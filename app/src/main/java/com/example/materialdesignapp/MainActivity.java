package com.example.materialdesignapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

import com.example.materialdesignapp.part1.HomeEbookActivity;
import com.example.materialdesignapp.part2.HomeActivityFood;
import com.example.materialdesignapp.part3.HomeMusicActivity;
import com.example.materialdesignapp.part4.HomeWallpaperActivity;

import java.lang.reflect.Field;

import me.anwarshahriar.calligrapher.Calligrapher;

public class MainActivity extends AppCompatActivity {

    CardView card1,card2,card3,card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1= findViewById(R.id.card1_main);
        card2= findViewById(R.id.card2_main);
        card3= findViewById(R.id.card3_main);
        card4= findViewById(R.id.card4_main);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HomeEbookActivity.class));
            }
        });


        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HomeActivityFood.class));
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HomeMusicActivity.class));
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HomeWallpaperActivity.class));
            }
        });
    }

}