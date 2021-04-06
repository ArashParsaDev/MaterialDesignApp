package com.example.materialdesignapp.part01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.materialdesignapp.HomeEbookActivity;
import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part01.adapter.AdapterForYou;
import com.example.materialdesignapp.part01.model.Book;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DetailBookActivity extends AppCompatActivity {
    Bundle bundle;
    ImageView img_book;
    TextView tv_name,tv_author,tv_title;
    ImageView iv_back;

    AdapterForYou adapterForYou;
    List<Book> list_for_you = new ArrayList<>();


    Button byn_buy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_book);

        bundle = getIntent().getExtras();

        img_book = findViewById(R.id.iv_detail_img);
        iv_back = findViewById(R.id.iv_back);
        tv_name = findViewById(R.id.tv_bottomsheet_name);
        tv_author = findViewById(R.id.tv_detail_author);
        tv_title = findViewById(R.id.tv_detail_title);
        byn_buy = findViewById(R.id.btn_buy);

        tv_author.setText(bundle.getString("author"));
        tv_name.setText(bundle.getString("name"));
        tv_title.setText(bundle.getString("name"));

        Picasso.with(this).load(bundle.getString("link_img")).into(img_book);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailBookActivity.this, HomeEbookActivity.class);
                startActivity(intent);
            }
        });

        byn_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(DetailBookActivity.this,R.style.BottomSheet_Ebook_Layout);
                View layout_bottom_sheet = LayoutInflater.from(getApplicationContext())
                        .inflate(R.layout.layout_bottom_sheet_ebook,findViewById(R.id.card_bottom_sheet));

                TextView name = layout_bottom_sheet.findViewById(R.id.tv_bottomsheet_name);
                TextView author = layout_bottom_sheet.findViewById(R.id.tv_bottomsheet_author);
                ImageView imageView =layout_bottom_sheet.findViewById(R.id.iv_bottomsheet_book);

                name.setText(bundle.getString("name"));
                author.setText(bundle.getString("author"));
                Picasso.with(getApplicationContext()).load(bundle.getString("link_img")).into(imageView);

                RecyclerView recyclerView_for_you = layout_bottom_sheet.findViewById(R.id.rv_bottomsheet);
                recyclerView_for_you.setHasFixedSize(true);
                recyclerView_for_you.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.HORIZONTAL,false));

                list_for_you.add(new Book("The Glass Hotel","Emily St. John Mandel","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQgxmv3DoWGvFX22GTpxsmby-dsmVaqyQFy87e8eX-LZq4lToT6"));
                list_for_you.add(new Book("Hamnet","Maggie O'Farrell","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQyRaCf9bJ_OhxCTfUs8xSZ8jlb6pOyjVioRfWfJwRJWclJhIcu"));
                list_for_you.add(new Book("Real Life","Brandon Taylor","https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRhPHCvh2bneBkyySO5Kxp5LevIQNLe_0r7XC1moHtvWZ-Gm0Nm"));
                list_for_you.add(new Book("Leave the World Behind","Rumaan Alam","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHKcRb1t1Rd0z6wC7XJ0Oyf95yYw0egwiPWARfxmJzz_wPL3Nz"));
                list_for_you.add(new Book("Weather","Jenny Offill","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpS4J1a21qkduedyAiQvDSNGuNEY4PQewf0BxItK4iEGKV_QNj"));
                list_for_you.add(new Book("Luster","Raven Leilani","https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcR-nudFqcb_jYFcd5n5wIlBHspz0koXdzAz7ioG_dMV6QPTFy5f"));
                list_for_you.add(new Book("The Mirror and the Light","Hilary Mantel","https://www.thehindu.com/books/r545hy/article31532333.ece/alternates/FREE_435/10LRMantelcover"));
                list_for_you.add(new Book("Transcendent Kingdom","Yaa Gyasi","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJokCRDugLCn8aeOW4Kf4W4IXTFouSAaoBZSqWHPgong9YFQgU"));
                list_for_you.add(new Book("Deacon King Kong: A Novel","James McBride","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRLgtVh3rrUgU8Z-1r4MTa29KzMXp6QOHPS_wBaHdKQzzfTdYTJ"));
                list_for_you.add(new Book("A Promised Land","Barack Obama","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSQLdPkH8rcP9J5312fLiWkkAIDeb_la_z0kCXsswJf0DMfa5Ay"));
                list_for_you.add(new Book("Vesper Flights","Helen Macdonald","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQzAYTcBXd-MuumP8XboKDATh5kD3dUFjxlmlgwTSBXov0g68p-"));
                list_for_you.add(new Book("Minor Feelings: An Asian American Reckoning","Cathy Park Hong","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTdTqd0oZNE7qducKX6D0R1HbKOfH8o5QNve7t-hoPoKYAqF0_u"));
                list_for_you.add(new Book("Jack","Marilynne Robinson","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEkiPC8rLSUozNVPmKCTOtzVDYI6O2s-oLQDeEq7SKssGBbqfN"));

                adapterForYou = new AdapterForYou(getApplicationContext(),list_for_you);
                recyclerView_for_you.setAdapter(adapterForYou);

                bottomSheetDialog.setContentView(layout_bottom_sheet);
                bottomSheetDialog.show();
            }
        });


    }
}