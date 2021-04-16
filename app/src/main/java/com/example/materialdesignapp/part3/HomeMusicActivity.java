package com.example.materialdesignapp.part3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part3.adapter.ViewPagerAdapter;
import com.example.materialdesignapp.part3.fragment.HomeFragment;
import com.example.materialdesignapp.part3.fragment.MusicFragment;
import com.google.android.material.tabs.TabLayout;

import java.lang.reflect.Field;

import me.anwarshahriar.calligrapher.Calligrapher;

public class HomeMusicActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_music);
        setFont();

        tabLayout = findViewById(R.id.tabLayout_HomeMusic);
        viewPager = findViewById(R.id.viewPager_HomeMusic);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.setFragment(new HomeFragment() , "خانه");
        adapter.setFragment(new MusicFragment() , "موزیک");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager,true);
    }
    private void setFont() {
        //dont forget add this to style :
        //<item name="android:typeface">monospace</item>
        String sarbaz = "iransharp.ttf";
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
        calligrapher.setFont(this, "iransharp.ttf", true);
    }
}