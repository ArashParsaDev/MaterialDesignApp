package com.example.materialdesignapp.part4.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part4.adapter.NewsFrWallAdapter;
import com.example.materialdesignapp.part4.model.Wallpaper;

import java.util.ArrayList;
import java.util.List;

public class NewsWallpaperFragment extends Fragment {


    public NewsWallpaperFragment() {
        // Required empty public constructor
    }

    View view;

    RecyclerView rvFrNewsWall;
    NewsFrWallAdapter adapterNewsFrWall;
    List<Wallpaper> listNewsFrWall = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_news_wallpaper, container, false);

        rvFrNewsWall = view.findViewById(R.id.rv_frNewsWallpaper_news);
        rvFrNewsWall.setHasFixedSize(true);
        rvFrNewsWall.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        listNewsFrWall.add(new Wallpaper("https://images.pexels.com/photos/2486168/pexels-photo-2486168.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/2486168/pexels-photo-2486168.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listNewsFrWall.add(new Wallpaper("https://images.pexels.com/photos/1366913/pexels-photo-1366913.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1366913/pexels-photo-1366913.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listNewsFrWall.add(new Wallpaper("https://images.pexels.com/photos/1595655/pexels-photo-1595655.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1595655/pexels-photo-1595655.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listNewsFrWall.add(new Wallpaper("https://images.pexels.com/photos/1591382/pexels-photo-1591382.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1591382/pexels-photo-1591382.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listNewsFrWall.add(new Wallpaper("https://images.pexels.com/photos/1784578/pexels-photo-1784578.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1784578/pexels-photo-1784578.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listNewsFrWall.add(new Wallpaper("https://images.pexels.com/photos/1253661/pexels-photo-1253661.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1253661/pexels-photo-1253661.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listNewsFrWall.add(new Wallpaper("https://images.pexels.com/photos/1122868/pexels-photo-1122868.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1122868/pexels-photo-1122868.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listNewsFrWall.add(new Wallpaper("https://images.pexels.com/photos/556669/pexels-photo-556669.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/556669/pexels-photo-556669.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listNewsFrWall.add(new Wallpaper("https://images.pexels.com/photos/1578105/pexels-photo-1578105.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/1578105/pexels-photo-1578105.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        listNewsFrWall.add(new Wallpaper("https://images.pexels.com/photos/2097628/pexels-photo-2097628.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500 500w, https://images.pexels.com/photos/2097628/pexels-photo-2097628.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500 1000w"));
        adapterNewsFrWall = new NewsFrWallAdapter(getContext(),listNewsFrWall);
        rvFrNewsWall.setAdapter(adapterNewsFrWall);







        return view;
    }
}