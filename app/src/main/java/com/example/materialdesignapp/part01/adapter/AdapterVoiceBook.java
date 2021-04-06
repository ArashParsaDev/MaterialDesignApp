package com.example.materialdesignapp.part01.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part01.model.Book;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterVoiceBook extends RecyclerView.Adapter<AdapterVoiceBook.MyViewHolder> {
    Context context;
    List<Book> data;


    public AdapterVoiceBook(Context context, List<Book> data) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_book_voice,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Picasso.with(context).load(data.get(position).getLink_img()).into(holder.img_book);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img_book;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_book= itemView.findViewById(R.id.iv_homeEbook_voice);
        }
    }
}
