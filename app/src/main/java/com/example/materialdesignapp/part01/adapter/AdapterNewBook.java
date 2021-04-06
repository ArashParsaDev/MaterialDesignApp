package com.example.materialdesignapp.part01.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part01.DetailBookActivity;
import com.example.materialdesignapp.part01.model.Book;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterNewBook extends RecyclerView.Adapter<AdapterNewBook.MyViewHolder> {
    Context context;
    List<Book> data;


    public AdapterNewBook(Context context, List<Book> data) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_book_new,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Picasso.with(context).load(data.get(position).getLink_img()).into(holder.img_book);
        holder.tv_author.setText(data.get(position).getAuthor());
        holder.tv_name.setText(data.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailBookActivity.class);
                intent.putExtra("name",data.get(position).getName());
                intent.putExtra("author",data.get(position).getAuthor());
                intent.putExtra("link_img",data.get(position).getLink_img());

                ActivityOptions options = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options = ActivityOptions.makeSceneTransitionAnimation((Activity) context,holder.img_book,"img_book");
                }


                context.startActivity(intent,options.toBundle());
            }
        });


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
            img_book= itemView.findViewById(R.id.iv_homeEbook_new);
            tv_name= itemView.findViewById(R.id.tv_homeEbook_bookName);
            tv_author= itemView.findViewById(R.id.tv_homeEbook_bookAuthor);
        }
    }
}
