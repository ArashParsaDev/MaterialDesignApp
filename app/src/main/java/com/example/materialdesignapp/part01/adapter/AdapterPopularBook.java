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

public class AdapterPopularBook extends RecyclerView.Adapter<AdapterPopularBook.MyViewHolder> {
    Context context;
    List<Book> data;


    public AdapterPopularBook( Context context,List<Book> data) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_book_popular,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Picasso.with(context).load(data.get(position).getLink_img()).into(holder.img_book);
        holder.tv_author.setText(data.get(position).getAuthor());
        holder.tv_name.setText(data.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img_book;
        TextView tv_name,tv_author;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_book= itemView.findViewById(R.id.iv_homeEbook_popular);
            tv_name= itemView.findViewById(R.id.tv_homeEbook_bookName);
            tv_author= itemView.findViewById(R.id.tv_homeEbook_bookAuthor);
        }
    }
}
