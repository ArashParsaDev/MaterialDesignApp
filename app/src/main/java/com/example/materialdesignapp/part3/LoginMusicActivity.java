package com.example.materialdesignapp.part3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.materialdesignapp.R;

import java.lang.reflect.Field;

import me.anwarshahriar.calligrapher.Calligrapher;

public class LoginMusicActivity extends AppCompatActivity {

    ImageView img_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_music);
        setFont();
        img_go = findViewById(R.id.iv_go_home);
        img_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginMusicActivity.this,HomeMusicActivity.class));
            }
        });
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