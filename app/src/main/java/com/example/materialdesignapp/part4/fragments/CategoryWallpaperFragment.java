package com.example.materialdesignapp.part4.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part4.adapter.CategoryWallCatAdapter;
import com.example.materialdesignapp.part4.adapter.MahbobtarinWallAdapter;
import com.example.materialdesignapp.part4.model.Wallpaper;

import java.util.ArrayList;
import java.util.List;

public class CategoryWallpaperFragment extends Fragment {


    public CategoryWallpaperFragment() {
        // Required empty public constructor
    }
    View view;
    List<Wallpaper> listCatWall = new ArrayList<>();
    CategoryWallCatAdapter adapter_CatWall;
    RecyclerView rv_CatWall;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category_wallpaper, container, false);
        getCatList(view);
        return view;

    }
    private void getCatList(View view) {

        rv_CatWall = view.findViewById(R.id.rv_catWall);
        rv_CatWall.setHasFixedSize(true);
        rv_CatWall.setLayoutManager(new GridLayoutManager(getContext(),2));
        listCatWall.add(new Wallpaper("rabbit","https://images.wallpaperscraft.com/image/rabbit_small_furry_black_white_96564_300x168.jpg"));
        listCatWall.add(new Wallpaper("squirrel","https://images.wallpaperscraft.com/image/squirrel_small_tree_climbing_110033_300x168.jpg"));
        listCatWall.add(new Wallpaper("crocodile","https://images.wallpaperscraft.com/image/crocodile_small_reptile_striped_39950_300x168.jpg"));
        listCatWall.add(new Wallpaper("snake","https://images.wallpaperscraft.com/image/snake_small_timber_crawl_106874_300x168.jpg"));
        listCatWall.add(new Wallpaper("ape","https://images.wallpaperscraft.com/image/ape_small_hay_net_56858_300x168.jpg"));
        listCatWall.add(new Wallpaper("penguin","https://images.wallpaperscraft.com/image/small_penguin_north_snow_75910_300x168.jpg"));
        adapter_CatWall = new CategoryWallCatAdapter(getContext(),listCatWall);
        rv_CatWall.setAdapter(adapter_CatWall);

    }
}