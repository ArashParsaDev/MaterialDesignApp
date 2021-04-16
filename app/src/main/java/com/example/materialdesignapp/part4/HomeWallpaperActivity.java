package com.example.materialdesignapp.part4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part4.fragments.CategoryWallpaperFragment;
import com.example.materialdesignapp.part4.fragments.HomeWallpaperFragment;
import com.example.materialdesignapp.part4.fragments.NewsWallpaperFragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class HomeWallpaperActivity extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_wallpaper);

        chipNavigationBar = findViewById(R.id.chipnavigation);

        HomeWallpaperFragment homeWallpaperFragment = new HomeWallpaperFragment();
        FragmentTransaction fragmentTransaction_home = getSupportFragmentManager().beginTransaction();
        fragmentTransaction_home.replace(R.id.frameLayout ,homeWallpaperFragment);
        fragmentTransaction_home.commit();

        chipNavigationBar.setItemSelected(R.id.nav_home,true);

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int position) {
                switch (position){
                    case R.id.nav_home:
                        HomeWallpaperFragment homeWallpaperFragment = new HomeWallpaperFragment();
                        FragmentTransaction fragmentTransaction_home = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_home.replace(R.id.frameLayout ,homeWallpaperFragment);
                        fragmentTransaction_home.commit();
                        break;
                    case R.id.nav_cat:
                        CategoryWallpaperFragment categoryWallpaperFragment = new CategoryWallpaperFragment();
                        FragmentTransaction fragmentTransaction_cat = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_cat.replace(R.id.frameLayout ,categoryWallpaperFragment);
                        fragmentTransaction_cat.commit();
                        break;
                    case R.id.nav_news:
                        NewsWallpaperFragment newsWallpaperFragment = new NewsWallpaperFragment();
                        FragmentTransaction fragmentTransaction_news = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_news.replace(R.id.frameLayout ,newsWallpaperFragment);
                        fragmentTransaction_news.commit();
                        break;

                }
            }
        });
    }
}