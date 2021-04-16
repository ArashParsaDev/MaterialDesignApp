package com.example.materialdesignapp.part3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.materialdesignapp.R;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Field;

import de.hdodenhof.circleimageview.CircleImageView;
import me.anwarshahriar.calligrapher.Calligrapher;

public class PlayListMusicActivity extends AppCompatActivity {

    TextView tv_name,tv_nameSong,tv_time;
    CircleImageView iv_song;
    ImageView iv_download;
    ImageView iv_back;
    ImageView iv_more;
    Dialog dialog;

    Bundle bundle;
    String name,name_song,time,link_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list_music);
        setFont();

        dialog = new Dialog(PlayListMusicActivity.this);


        tv_name=findViewById(R.id.tv_listHome_name);
        tv_nameSong=findViewById(R.id.tv_listHome_nameSong);
        tv_time =findViewById(R.id.tv_listHome_endTime);
        iv_song = findViewById(R.id.civ_listHome);
        iv_download = findViewById(R.id.iv_download);
        iv_back = findViewById(R.id.iv_back);
        iv_more = findViewById(R.id.iv_more);


        bundle = getIntent().getExtras();
        name = bundle.getString("name");
        name_song = bundle.getString("song_name");
        time = bundle.getString("time");
        link_img = bundle.getString("link_img");


        tv_nameSong.setText(name_song);
        tv_name.setText(name);
        tv_time.setText(time);
        Picasso.with(this).load(link_img).into(iv_song);

        iv_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            dialog.setContentView(R.layout.layout_download_music);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.show();
            }
        });

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        iv_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PlayListMusicActivity.this, "more", Toast.LENGTH_SHORT).show();
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

}