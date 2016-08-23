package com.wonkydan.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button popularMovies, stockHawk, buildItBigger, makeYourAppMaterial, goUbiquitous, capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign all the buttons
        popularMovies = (Button) findViewById(R.id.popular_movies);
        stockHawk = (Button) findViewById(R.id.stock_hawk);
        buildItBigger = (Button) findViewById(R.id.build_it_bigger);
        makeYourAppMaterial = (Button) findViewById(R.id.make_your_app_material);
        goUbiquitous = (Button) findViewById(R.id.go_ubiquitous);
        capstone = (Button) findViewById(R.id.capstone);



        //assign on click listeners to all the buttons
        popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button opens the popular movies app", Toast.LENGTH_SHORT).show();
            }
        });
        stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button opens the stock hawk app", Toast.LENGTH_SHORT).show();
            }
        });
        buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button opens the build it bigger app", Toast.LENGTH_SHORT).show();
            }
        });
        makeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button opens the make your app material app", Toast.LENGTH_SHORT).show();
            }
        });
        goUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button opens the go ubiquitous app", Toast.LENGTH_SHORT).show();
            }
        });
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button opens the capstone app", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
