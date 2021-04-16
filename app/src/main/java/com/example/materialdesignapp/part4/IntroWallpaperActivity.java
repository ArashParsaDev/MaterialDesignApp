package com.example.materialdesignapp.part4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part4.adapter.IntroWallpaperAdapter;
import com.example.materialdesignapp.part4.model.Intro;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import me.anwarshahriar.calligrapher.Calligrapher;

public class IntroWallpaperActivity extends AppCompatActivity {

    List<Intro> list_wallpaper = new ArrayList<>();
    IntroWallpaperAdapter adapter;
    TabLayout tabLayout;
    ViewPager viewPager;

    TextView tv_next,tv_before;
    MaterialButton btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_wallpaper);
        setFont();

        getIntroWallpaper();
        setVisibilityViews();

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroWallpaperActivity.this,HomeWallpaperActivity.class));
            }
        });
    }

    private void setVisibilityViews() {
        tv_next = findViewById(R.id.tv_intro_next);
        tv_before = findViewById(R.id.tv_intro_before);
        btn_start = findViewById(R.id.btn_intro_start);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == list_wallpaper.size() - 1){
                    btn_start.setVisibility(View.VISIBLE);
                    tv_next.setText("تمام");
                    tabLayout.setVisibility(View.INVISIBLE);
                  //  tv_before.setVisibility(View.VISIBLE);
                }else if(tab.getPosition() ==list_wallpaper.size() - 2){
                    btn_start.setVisibility(View.INVISIBLE);
                    tv_next.setText("بعدی");
                    tabLayout.setVisibility(View.VISIBLE);
                  //  tv_before.setVisibility(View.VISIBLE);
                }
                /*else if(tab.getPosition() ==list_wallpaper.size() - 3) {
                    tv_before.setVisibility(View.VISIBLE);
                }else if(tab.getPosition() ==list_wallpaper.size() - 4) {
                    tv_before.setVisibility(View.INVISIBLE);
                }*/
                else if (tab.getPosition()>0){
                    tv_before.setVisibility(View.VISIBLE);
                }else{
                    tv_before.setVisibility(View.GONE);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setFont() {
        //dont forget add this to style :
        //<item name="android:typeface">monospace</item>
        String sarbaz = "sarbaz.ttf";
        AssetManager assetManager = this.getAssets();

        Typeface typeface = Typeface.createFromAsset(assetManager,sarbaz);
        try {
            Field field = Typeface.class.getDeclaredField("MONOSPACE");
            field.setAccessible(true);
            try {
                field.set(null,typeface);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "sarbaz.ttf", true);
    }

    private void getIntroWallpaper() {
        viewPager = findViewById(R.id.viewPager_Wallpaper);
        tabLayout = findViewById(R.id.tablayout_wallpaper);

        list_wallpaper.add(new Intro(R.raw.wall1,"کلی عکس جدید که خیلی راحت می تونی دانلودشون  کنی"));
        list_wallpaper.add(new Intro(R.raw.share,"می تونی عکس ها رو به اشتراک بزاری"));
        list_wallpaper.add(new Intro(R.raw.like,"عکس دوستات رو لایک کن"));
        list_wallpaper.add(new Intro(R.raw.download_it,"می تونی هر روز عکس های جدید دانلود کنی"));

        adapter = new IntroWallpaperAdapter(this,list_wallpaper);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager , true);
    }
}