package com.example.materialdesignapp.part4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.materialdesignapp.R;
import com.github.clans.fab.FloatingActionButton;
import com.squareup.picasso.Picasso;

public class DetailsWallpaperActivity extends AppCompatActivity {

    ImageView iv_detail;
    Bundle bundle;
    String imgFrNew;

    Dialog dialog;
    FloatingActionButton fab_download;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_wallpaper);

        dialog = new Dialog(DetailsWallpaperActivity.this);
        fab_download = findViewById(R.id.fab_download);
        iv_detail= findViewById(R.id.iv_detailWallpaper);

        bundle = getIntent().getExtras();
        imgFrNew = bundle.getString("link_img");
        Picasso.with(this).load(imgFrNew).into(iv_detail);






        fab_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.layout_download_wallpaper);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });


    }
}