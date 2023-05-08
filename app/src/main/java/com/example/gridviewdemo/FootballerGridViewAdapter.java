package com.example.gridviewdemo;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FootballerGridViewAdapter extends BaseAdapter {
    private ArrayList<Footballer> footballers;

    public FootballerGridViewAdapter(ArrayList<Footballer> footballers) {
        this.footballers = footballers;
    }

    @Override
    public int getCount() {
        return footballers.size();
    }

    @Override
    public Object getItem(int position) {
        return footballers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        @SuppressLint("ViewHolder")
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.footballer_gridview_item, parent, false);

        ImageView imageView = view.findViewById(R.id.footballer_gridview_item_image);
        TextView textView = view.findViewById(R.id.footballer_gridview_item_text);

        Footballer footballer = footballers.get(position);
        imageView.setImageResource(footballer.getImageId());
        textView.setText(String.format("#%s - %s", footballer.getNumber(), footballer.getName()));

        view.setOnClickListener(v -> footballerGiveSpeech(v, footballer));

        return view;
    }

    private void footballerGiveSpeech(View v, Footballer footballer) {
        String message = String.format("%s said:\n\"%s\"", footballer.getName(), footballer.getSpeech());
        Toast.makeText(v.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
