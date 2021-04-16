package com.example.materialdesignapp.part4.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part4.adapter.DastebandiWallAdapter;
import com.example.materialdesignapp.part4.adapter.JadidtarinWallAdapter;
import com.example.materialdesignapp.part4.adapter.MahbobtarinWallAdapter;
import com.example.materialdesignapp.part4.model.Wallpaper;

import java.util.ArrayList;
import java.util.List;

public class HomeWallpaperFragment extends Fragment {


    public HomeWallpaperFragment() {
        // Required empty public constructor
    }

    View view;
    //news
    List<Wallpaper> listNews = new ArrayList<>();
    JadidtarinWallAdapter adapter_news;
    RecyclerView rv_news;
    //category
    List<Wallpaper> listCat = new ArrayList<>();
    DastebandiWallAdapter adapter_Cat;
    RecyclerView rv_Cat;
    //popular
    List<Wallpaper> listPopular = new ArrayList<>();
    MahbobtarinWallAdapter adapter_Popular;
    RecyclerView rv_Popular;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_wallpaper, container, false);

        getNewsWallpaper(view);
        getCategoryWallpaper(view);
        getPopularWallpaper(view);


        return view;
    }

    private void getCategoryWallpaper(View view) {
        rv_Cat = view.findViewById(R.id.rv_frHomeWallpaper_category);
        rv_Cat.setHasFixedSize(true);
        rv_Cat.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false));
        listCat.add(new Wallpaper("rabbit","https://images.wallpaperscraft.com/image/rabbit_small_furry_black_white_96564_300x168.jpg"));
        listCat.add(new Wallpaper("squirrel","https://images.wallpaperscraft.com/image/squirrel_small_tree_climbing_110033_300x168.jpg"));
        listCat.add(new Wallpaper("crocodile","https://images.wallpaperscraft.com/image/crocodile_small_reptile_striped_39950_300x168.jpg"));
        listCat.add(new Wallpaper("snake","https://images.wallpaperscraft.com/image/snake_small_timber_crawl_106874_300x168.jpg"));
        listCat.add(new Wallpaper("ape","https://images.wallpaperscraft.com/image/ape_small_hay_net_56858_300x168.jpg"));
        listCat.add(new Wallpaper("penguin","https://images.wallpaperscraft.com/image/small_penguin_north_snow_75910_300x168.jpg"));
        adapter_Cat = new DastebandiWallAdapter(getContext(),listCat);
        rv_Cat.setAdapter(adapter_Cat);

    }

    private void getPopularWallpaper(View view) {
        rv_Popular = view.findViewById(R.id.rv_frHomeWallpaper_popular);
        rv_Popular.setHasFixedSize(true);
        rv_Popular.setLayoutManager(new GridLayoutManager(getContext(),3));
        listPopular.add(new Wallpaper("https://images.pexels.com/photos/2486168/pexels-photo-2486168.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/2486168/pexels-photo-2486168.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listPopular.add(new Wallpaper("https://images.pexels.com/photos/1366913/pexels-photo-1366913.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1366913/pexels-photo-1366913.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listPopular.add(new Wallpaper("https://images.pexels.com/photos/1595655/pexels-photo-1595655.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1595655/pexels-photo-1595655.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listPopular.add(new Wallpaper("https://images.pexels.com/photos/1591382/pexels-photo-1591382.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1591382/pexels-photo-1591382.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listPopular.add(new Wallpaper("https://images.pexels.com/photos/1784578/pexels-photo-1784578.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1784578/pexels-photo-1784578.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listPopular.add(new Wallpaper("https://images.pexels.com/photos/1253661/pexels-photo-1253661.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1253661/pexels-photo-1253661.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listPopular.add(new Wallpaper("https://images.pexels.com/photos/1122868/pexels-photo-1122868.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1122868/pexels-photo-1122868.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listPopular.add(new Wallpaper("https://images.pexels.com/photos/556669/pexels-photo-556669.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/556669/pexels-photo-556669.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listPopular.add(new Wallpaper("https://images.pexels.com/photos/1578105/pexels-photo-1578105.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1578105/pexels-photo-1578105.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listPopular.add(new Wallpaper("https://images.pexels.com/photos/2097628/pexels-photo-2097628.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/2097628/pexels-photo-2097628.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        adapter_Popular = new MahbobtarinWallAdapter(getContext(),listPopular);
        rv_Popular.setAdapter(adapter_Popular);

    }

    private void getNewsWallpaper(View view) {
        rv_news = view.findViewById(R.id.rv_frHomeWallpaper_news);
        rv_news.setHasFixedSize(true);
        rv_news.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false));
        listNews.add(new Wallpaper("https://wallpaperaccess.com/full/1213672.jpg"));
        listNews.add(new Wallpaper("https://images.pexels.com/photos/775199/pexels-photo-775199.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/775199/pexels-photo-775199.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listNews.add(new Wallpaper("https://images.pexels.com/photos/1624496/pexels-photo-1624496.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1624496/pexels-photo-1624496.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listNews.add(new Wallpaper("https://images.pexels.com/photos/1366919/pexels-photo-1366919.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1366919/pexels-photo-1366919.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listNews.add(new Wallpaper("https://images.pexels.com/photos/1212487/pexels-photo-1212487.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1212487/pexels-photo-1212487.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listNews.add(new Wallpaper("https://images.pexels.com/photos/937980/pexels-photo-937980.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/937980/pexels-photo-937980.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));


        adapter_news = new JadidtarinWallAdapter(getContext(),listNews);
        rv_news.setAdapter(adapter_news);
    }
}