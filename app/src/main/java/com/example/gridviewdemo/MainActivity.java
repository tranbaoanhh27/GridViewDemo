package com.example.gridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private GridView footballerGridView;
    private static final Footballer[] footballers = {
            new Footballer("Gareth Bale", "11", R.drawable.bale),
            new Footballer("Cristiano Ronaldo", "7", R.drawable.cristiano, "SIUUUUUUU!"),
            new Footballer("Karim Benzema", "9", R.drawable.benzema),
            new Footballer("James Rodriguez", "10", R.drawable.james),
            new Footballer("Toni Kroos", "8", R.drawable.kroos),
            new Footballer("Luka Modric", "19", R.drawable.modric),
            new Footballer("Sergio Ramos", "4", R.drawable.ramos),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setupFootballerGridView();
    }

    private void setupFootballerGridView() {
        FootballerGridViewAdapter adapter = new FootballerGridViewAdapter(
                new ArrayList<>(Arrays.asList(footballers))
        );
        footballerGridView.setAdapter(adapter);
    }

    private void findViews() {
        footballerGridView = findViewById(R.id.footballer_gridview);
    }
}