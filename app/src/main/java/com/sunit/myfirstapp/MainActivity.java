package com.sunit.myfirstapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Integer> posterImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(" Netflix UI Clone");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setLogo(R.drawable.netflix_logo);
        actionBar.setDisplayUseLogoEnabled(true);

        posterImages = new ArrayList<>();
        posterImages.add(R.drawable.film1);
        posterImages.add(R.drawable.film2);
        posterImages.add(R.drawable.film3);
        posterImages.add(R.drawable.film4);
        posterImages.add(R.drawable.film5);
        posterImages.add(R.drawable.film6);
        posterImages.add(R.drawable.film7);
        posterImages.add(R.drawable.film8);
        posterImages.add(R.drawable.film9);
        posterImages.add(R.drawable.film1);
        posterImages.add(R.drawable.film2);
        posterImages.add(R.drawable.film3);
        posterImages.add(R.drawable.film4);
        posterImages.add(R.drawable.film5);
        posterImages.add(R.drawable.film6);
        posterImages.add(R.drawable.film7);
        posterImages.add(R.drawable.film8);
        posterImages.add(R.drawable.film9);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(new Adapter(posterImages));

    }
}