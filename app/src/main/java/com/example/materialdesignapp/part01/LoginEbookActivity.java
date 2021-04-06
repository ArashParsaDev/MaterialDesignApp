package com.example.materialdesignapp.part01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.materialdesignapp.HomeEbookActivity;
import com.example.materialdesignapp.MainActivity;
import com.example.materialdesignapp.R;

public class LoginEbookActivity extends AppCompatActivity {

    CardView cardLogin, cardRegister;
    Button btnLogin, btnRegister;
    ImageView imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ebook);

        cardLogin = findViewById(R.id.card_login);
        cardRegister = findViewById(R.id.card_register);
        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);
        imgBack = findViewById(R.id.img_back);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            cardLogin.setVisibility(View.VISIBLE);
            cardRegister.setVisibility(View.GONE);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardLogin.setVisibility(View.GONE);
                cardRegister.setVisibility(View.VISIBLE);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginEbookActivity.this, HomeEbookActivity.class));
            }
        });



    }
}