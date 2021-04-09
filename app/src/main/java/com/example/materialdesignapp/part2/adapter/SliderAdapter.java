package com.example.materialdesignapp.part2.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part2.DetailFoodActivity;
import com.example.materialdesignapp.part2.model.Food;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SliderAdapter extends PagerAdapter {

    Context context;
    List<Food> data;

    public SliderAdapter(Context context, List<Food> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    //vasl shodan b item haye slider
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_food_slider,container,false);
        TextView tv_name = view.findViewById(R.id.tv_item_slider_name);
        TextView tv_desc = view.findViewById(R.id.tv_item_slider_description);
        TextView tv_rate = view.findViewById(R.id.tv_slider_foodRate);
        TextView tv_count = view.findViewById(R.id.tv_slider_foodCount);
        ImageView iv_food = view.findViewById(R.id.iv_item_slider);

        tv_name.setText(data.get(position).getName());
        tv_desc.setText(data.get(position).getDescription());
        tv_rate.setText(data.get(position).getRating());
        tv_count.setText("("+data.get(position).getCount()+")");
        Picasso.with(context).load(data.get(position).getLink_img()).into(iv_food);
        //fix rtl
        view.setRotationY(-180);

        //show in detailFood
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailFoodActivity.class);
                intent.putExtra("name",data.get(position).getName());
                intent.putExtra("price",data.get(position).getPrice());
                intent.putExtra("count",data.get(position).getCount());
                intent.putExtra("rate",data.get(position).getRating());
                intent.putExtra("link_img",data.get(position).getLink_img());
                intent.putExtra("desc",data.get(position).getDescription());
                context.startActivity(intent);
            }
        });


        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    //destroy kardan item haye ghabli baraye optimize kardan usage system
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);
    }
}
