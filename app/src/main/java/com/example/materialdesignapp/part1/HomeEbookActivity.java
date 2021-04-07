package com.example.materialdesignapp.part1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part1.adapter.AdapterNewBook;
import com.example.materialdesignapp.part1.adapter.AdapterPopularBook;
import com.example.materialdesignapp.part1.adapter.AdapterVoiceBook;
import com.example.materialdesignapp.part1.model.Book;

import java.util.ArrayList;
import java.util.List;

public class HomeEbookActivity extends AppCompatActivity {
    //Book popular
    RecyclerView rv_popular;
    AdapterPopularBook popularBookAdapter;
    //Book Voice
    RecyclerView rv_voice;
    AdapterVoiceBook vocieBookAdapter;
    //Book New
    RecyclerView rv_new;
    AdapterNewBook newBookAdapter;

    ImageView img_menu;
    DrawerLayout drawerLayout;


    List<Book> list_popular = new ArrayList<>();
    List<Book> list_new = new ArrayList<>();
    List<Book> list_voice = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_ebook);

        rv_popular= findViewById(R.id.rv_popular);
        rv_new= findViewById(R.id.rv_new);
        rv_voice= findViewById(R.id.rv_voice);

        //rv Popular
        rv_popular.setHasFixedSize(true);
        rv_popular.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));

        list_popular.add(new Book("The Glass Hotel","Emily St. John Mandel","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQgxmv3DoWGvFX22GTpxsmby-dsmVaqyQFy87e8eX-LZq4lToT6"));
        list_popular.add(new Book("Hamnet","Maggie O'Farrell","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQyRaCf9bJ_OhxCTfUs8xSZ8jlb6pOyjVioRfWfJwRJWclJhIcu"));
        list_popular.add(new Book("Real Life","Brandon Taylor","https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRhPHCvh2bneBkyySO5Kxp5LevIQNLe_0r7XC1moHtvWZ-Gm0Nm"));
        list_popular.add(new Book("Leave the World Behind","Rumaan Alam","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHKcRb1t1Rd0z6wC7XJ0Oyf95yYw0egwiPWARfxmJzz_wPL3Nz"));
        list_popular.add(new Book("Weather","Jenny Offill","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpS4J1a21qkduedyAiQvDSNGuNEY4PQewf0BxItK4iEGKV_QNj"));
        list_popular.add(new Book("Luster","Raven Leilani","https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcR-nudFqcb_jYFcd5n5wIlBHspz0koXdzAz7ioG_dMV6QPTFy5f"));
        list_popular.add(new Book("The Mirror and the Light","Hilary Mantel","https://www.thehindu.com/books/r545hy/article31532333.ece/alternates/FREE_435/10LRMantelcover"));
        list_popular.add(new Book("Transcendent Kingdom","Yaa Gyasi","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJokCRDugLCn8aeOW4Kf4W4IXTFouSAaoBZSqWHPgong9YFQgU"));
        list_popular.add(new Book("Deacon King Kong: A Novel","James McBride","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRLgtVh3rrUgU8Z-1r4MTa29KzMXp6QOHPS_wBaHdKQzzfTdYTJ"));
        list_popular.add(new Book("A Promised Land","Barack Obama","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSQLdPkH8rcP9J5312fLiWkkAIDeb_la_z0kCXsswJf0DMfa5Ay"));
        list_popular.add(new Book("Vesper Flights","Helen Macdonald","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQzAYTcBXd-MuumP8XboKDATh5kD3dUFjxlmlgwTSBXov0g68p-"));
        list_popular.add(new Book("Minor Feelings: An Asian American Reckoning","Cathy Park Hong","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTdTqd0oZNE7qducKX6D0R1HbKOfH8o5QNve7t-hoPoKYAqF0_u"));
        list_popular.add(new Book("Jack","Marilynne Robinson","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEkiPC8rLSUozNVPmKCTOtzVDYI6O2s-oLQDeEq7SKssGBbqfN"));

        popularBookAdapter = new AdapterPopularBook(this,list_popular);
        rv_popular.setAdapter(popularBookAdapter);


        //rv Voice
        rv_voice.setHasFixedSize(true);
        rv_voice.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        list_voice.add(new Book("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQgxmv3DoWGvFX22GTpxsmby-dsmVaqyQFy87e8eX-LZq4lToT6"));
        list_voice.add(new Book("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQyRaCf9bJ_OhxCTfUs8xSZ8jlb6pOyjVioRfWfJwRJWclJhIcu"));
        list_voice.add(new Book("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRhPHCvh2bneBkyySO5Kxp5LevIQNLe_0r7XC1moHtvWZ-Gm0Nm"));
        list_voice.add(new Book("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHKcRb1t1Rd0z6wC7XJ0Oyf95yYw0egwiPWARfxmJzz_wPL3Nz"));


        vocieBookAdapter = new AdapterVoiceBook(this,list_voice);
        rv_voice.setAdapter(vocieBookAdapter);

        //rv new
        rv_new.setHasFixedSize(true);
        rv_new.setLayoutManager(new GridLayoutManager(this,3));

        list_new.add(new Book("The Glass Hotel","Emily St. John Mandel","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQgxmv3DoWGvFX22GTpxsmby-dsmVaqyQFy87e8eX-LZq4lToT6"));
        list_new.add(new Book("Hamnet","Maggie O'Farrell","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQyRaCf9bJ_OhxCTfUs8xSZ8jlb6pOyjVioRfWfJwRJWclJhIcu"));
        list_new.add(new Book("Real Life","Brandon Taylor","https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRhPHCvh2bneBkyySO5Kxp5LevIQNLe_0r7XC1moHtvWZ-Gm0Nm"));
        list_new.add(new Book("Leave the World Behind","Rumaan Alam","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHKcRb1t1Rd0z6wC7XJ0Oyf95yYw0egwiPWARfxmJzz_wPL3Nz"));
        list_new.add(new Book("Weather","Jenny Offill","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpS4J1a21qkduedyAiQvDSNGuNEY4PQewf0BxItK4iEGKV_QNj"));
        list_new.add(new Book("Luster","Raven Leilani","https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcR-nudFqcb_jYFcd5n5wIlBHspz0koXdzAz7ioG_dMV6QPTFy5f"));
        list_new.add(new Book("The Mirror and the Light","Hilary Mantel","https://www.thehindu.com/books/r545hy/article31532333.ece/alternates/FREE_435/10LRMantelcover"));
        list_new.add(new Book("Transcendent Kingdom","Yaa Gyasi","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJokCRDugLCn8aeOW4Kf4W4IXTFouSAaoBZSqWHPgong9YFQgU"));
        list_new.add(new Book("Deacon King Kong: A Novel","James McBride","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRLgtVh3rrUgU8Z-1r4MTa29KzMXp6QOHPS_wBaHdKQzzfTdYTJ"));
        list_new.add(new Book("A Promised Land","Barack Obama","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSQLdPkH8rcP9J5312fLiWkkAIDeb_la_z0kCXsswJf0DMfa5Ay"));
        list_new.add(new Book("Vesper Flights","Helen Macdonald","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQzAYTcBXd-MuumP8XboKDATh5kD3dUFjxlmlgwTSBXov0g68p-"));
        list_new.add(new Book("Minor Feelings: An Asian American Reckoning","Cathy Park Hong","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTdTqd0oZNE7qducKX6D0R1HbKOfH8o5QNve7t-hoPoKYAqF0_u"));
        list_new.add(new Book("Jack","Marilynne Robinson","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEkiPC8rLSUozNVPmKCTOtzVDYI6O2s-oLQDeEq7SKssGBbqfN"));

        newBookAdapter = new AdapterNewBook(this,list_new);
        rv_new.setAdapter(newBookAdapter);


        img_menu = findViewById(R.id.img_menu);
        drawerLayout =findViewById(R.id.drawerlayout_books);
        img_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerVisible(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else{
            super.onBackPressed();
        }
    }
}