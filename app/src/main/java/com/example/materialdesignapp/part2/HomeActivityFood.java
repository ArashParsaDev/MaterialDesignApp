package com.example.materialdesignapp.part2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.transition.Slide;
import android.view.WindowManager;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part2.adapter.CategoryFoodAdapter;
import com.example.materialdesignapp.part2.adapter.NewFoodAdapter;
import com.example.materialdesignapp.part2.adapter.RecommendFoodAdapter;
import com.example.materialdesignapp.part2.adapter.SliderAdapter;
import com.example.materialdesignapp.part2.adapter.TypeFoodAdapter;
import com.example.materialdesignapp.part2.model.Food;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class HomeActivityFood extends AppCompatActivity {
    //category
    RecyclerView recyclerViewCategory;
    CategoryFoodAdapter adapterCategory;
    List<Food> list_category_food = new ArrayList<>();
    //type
    RecyclerView recyclerViewType;
    TypeFoodAdapter adapterType;
    List<Food> list_type = new ArrayList<>();
    //recommend
    RecommendFoodAdapter adapterRecommend;
    RecyclerView recyclerViewRecommend;
    List<Food> list_recommend_food = new ArrayList<>();
    //new
    RecyclerView recyclerViewNew;
    List<Food> list_new = new ArrayList<>();
    NewFoodAdapter adapterNew;

    //slider
    ViewPager viewPager;
    TabLayout tabLayout;
    List<Food> list_slider = new ArrayList<>();
    SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_food);

        getFoodCategory();
        getFoodType();
        getFoodRecommend();
        getFoodNew();
        getFoodSlider();


    }

    private void getFoodSlider() {

        tabLayout = findViewById(R.id.food_home_tablayout);
        viewPager = findViewById(R.id.food_home_viewPager);
        list_slider.add(new Food("جوجه کباب","https://chishi.ir/wp-content/uploads/2020/07/jooje-kabab-tabe.jpg","54000","4.8","25.3","جوجه کباب اصولا غذایی است که مرد های خونه ادعای بسیار زیادی در خوب درست کردن آن دارد ، با رعایت چند نکته ساده “جوجه کباب” را بسیار خوشمزه تر از قبل درست کنید."));
        list_slider.add(new Food("کوبیده","https://digifood.ir/wp-content/uploads/2020/06/kubide-digifood-5.jpg","45000","4.2","17.7","کباب کوبیده کبابی است که برخلاف نظر برخی ها که می گویند درست کردن این کباب بسیار دشوار است و کباب ما آنطور که میخواهم مانند کباب های بیرون عمل نمی آید،  بسیار ساده و آسان تهیه می شود."));
        list_slider.add(new Food("غوره مسماي شمالی","https://cdn.yjc.ir/files/fa/news/1399/7/9/12674260_203.jpg","65000","4.9","16.9","این غذای شمالی که گاهی با خورش بادمجان اشتباه گرفته می شود، غذایی است خوش طعم که به دلیل همراه شدن بادمجان با گوشت مرغ سرخ شده، کمتر کسی می تواند از آن بگذرد اما پخت این غذا نیز مانند سایر غذاهای ایرانی، ریزه کاری هایی دارد."));
        list_slider.add(new Food("آش رشته","https://iranwatching.com/images/content-image/2020/08/iranwatching-1526-1598384154-ash-reshte.jpg","38000","4.1","23.7","طرز تهیه “آش رشته” یکی از غذاهای مورد علاقه ایرانیان را در این مطلب برای شما ارائه کرده ایم. مقداری از پیاز و سیر و نعناع سرخ شده را به آش اضافه کنید و بقیه را برای تزئین روی آش نگه دارید."));
        list_slider.add(new Food("مزغ شکم پر","https://irancook.ir/wp-content/uploads/2013/07/PicsArt_10-02-12.02.551-1280x720.jpg","59000","4.4","33.4","مرغ شکم پر یکی از غذاهای خوشمزه و مجلسی ایرانی است که در مهمانی ها و مجالس گزینه خوبی به حساب می آید، همچنین شام  فوق العاده ای برای جشن گرفتن شب یلدا است. "));
        list_slider.add(new Food("خورشت ترش واش گیلانی","https://chishi.ir/wp-content/uploads/2020/09/torsh-vash.jpg","67000","5.0","65.6","ترش واش یکی از انواع خورش های خوشمزه و پرطرفدار ایرانی است که اصالت ان متعلق به استان گیلان می باشد،"));
        sliderAdapter = new SliderAdapter(this,list_slider);
        //fix rtl
        viewPager.setRotationY(180);

        viewPager.setAdapter(sliderAdapter);
        tabLayout.setupWithViewPager(viewPager,true);
    }


    private void getFoodNew() {
        recyclerViewNew = findViewById(R.id.rv_Home_new);
        recyclerViewNew.setHasFixedSize(true);
        recyclerViewNew.setLayoutManager(new GridLayoutManager(this,2));
        list_new.add(new Food("قرمه سبزی","https://noktechi.ir/wp-content/uploads/2019/11/ghorme-sabzi.jpg","50000","5.0","22.3k"));
        list_new.add(new Food("قیمه","https://noktechi.ir/wp-content/uploads/2019/12/khoresh-gheyme.jpg","43000","4.9","15.6k"));
        list_new.add(new Food("فسنجون","https://www.niksalehi.com/cooking/wp-content/uploads/sites/52/2014/06/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D9%81%D8%B3%D9%86%D8%AC%D9%88%D9%86-%D8%BA%D8%B0%D8%A7%DB%8C-%D8%A7%D8%B5%DB%8C%D9%84-%D8%A7%DB%8C%D8%B1%D9%88%D9%86%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","41000","4.8","42.6k"));
        list_new.add(new Food("کشک بادمجون","https://img-global.cpcdn.com/recipes/afbff9346ee4cdae/751x532cq70/%DA%A9%D8%B4%DA%A9-%D8%A8%D8%A7%D8%AF%D9%85%D8%AC%D9%88%D9%86-%D9%85%D8%B1%D8%B6%DB%8C%D9%87-%D9%BE%D8%B2-%D8%AF%D8%B3%D8%AA%D9%88%D8%B1-%D8%A7%D8%B5%D9%84%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","20000","4.2","45.3k"));
        list_new.add(new Food("باقلا قاتوق","https://parsiday.com/wp-content/uploads/2020/10/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D8%A8%D8%A7-%D9%82%D9%84%D8%A7%D9%82%D8%A7%D8%AA%D9%82.jpg","40000","3.7","32.4k"));
        list_new.add(new Food("لوبیا پلو","https://img-global.cpcdn.com/recipes/db76ca6763a534b5/751x532cq70/%D9%84%D9%88%D8%A8%DB%8C%D8%A7-%D9%BE%D9%84%D9%88-%D9%85%D8%AC%D9%84%D8%B3%DB%8C-%D8%AF%D8%B3%D8%AA%D9%88%D8%B1-%D8%A7%D8%B5%D9%84%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","32000","4.6","23.4k"));
        list_new.add(new Food("ماکارونی","https://blog.okcs.com/wp-content/uploads/2019/02/d173fb8d41464e2e544c34ae0a43be65.jpg","25000","3.5","13.5k"));
        list_new.add(new Food("آش رشته","https://gymito.com/blog/wp-content/uploads/2019/11/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D8%A2%D8%B4-%D8%B1%D8%B4%D8%AA%D9%87.jpg","35000","4.3","65.5k"));
        list_new.add(new Food("استیک گوشت","https://files.namnak.com/users/yf/aup/201807/329_pics/%D8%A7%D8%B3%D8%AA%DB%8C%DA%A9.jpg","75000","5.0","12.3k"));

        adapterNew = new NewFoodAdapter(this,list_new);
        recyclerViewNew.setAdapter(adapterNew);
    }

    private void getFoodRecommend() {
        recyclerViewRecommend = findViewById(R.id.rv_Home_recommend);
        recyclerViewRecommend.setHasFixedSize(true);
        recyclerViewRecommend.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        list_recommend_food.add(new Food("قرمه سبزی","https://noktechi.ir/wp-content/uploads/2019/11/ghorme-sabzi.jpg","50000","5.0","22.3k"));
        list_recommend_food.add(new Food("قیمه","https://noktechi.ir/wp-content/uploads/2019/12/khoresh-gheyme.jpg","43000","4.9","15.6k"));
        list_recommend_food.add(new Food("فسنجون","https://www.niksalehi.com/cooking/wp-content/uploads/sites/52/2014/06/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D9%81%D8%B3%D9%86%D8%AC%D9%88%D9%86-%D8%BA%D8%B0%D8%A7%DB%8C-%D8%A7%D8%B5%DB%8C%D9%84-%D8%A7%DB%8C%D8%B1%D9%88%D9%86%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","41000","4.8","42.6k"));
        list_recommend_food.add(new Food("کشک بادمجون","https://img-global.cpcdn.com/recipes/afbff9346ee4cdae/751x532cq70/%DA%A9%D8%B4%DA%A9-%D8%A8%D8%A7%D8%AF%D9%85%D8%AC%D9%88%D9%86-%D9%85%D8%B1%D8%B6%DB%8C%D9%87-%D9%BE%D8%B2-%D8%AF%D8%B3%D8%AA%D9%88%D8%B1-%D8%A7%D8%B5%D9%84%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","20000","4.2","45.3k"));
        list_recommend_food.add(new Food("باقلا قاتوق","https://parsiday.com/wp-content/uploads/2020/10/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D8%A8%D8%A7-%D9%82%D9%84%D8%A7%D9%82%D8%A7%D8%AA%D9%82.jpg","40000","3.7","32.4k"));
        list_recommend_food.add(new Food("لوبیا پلو","https://img-global.cpcdn.com/recipes/db76ca6763a534b5/751x532cq70/%D9%84%D9%88%D8%A8%DB%8C%D8%A7-%D9%BE%D9%84%D9%88-%D9%85%D8%AC%D9%84%D8%B3%DB%8C-%D8%AF%D8%B3%D8%AA%D9%88%D8%B1-%D8%A7%D8%B5%D9%84%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","32000","4.6","23.4k"));
        list_recommend_food.add(new Food("ماکارونی","https://blog.okcs.com/wp-content/uploads/2019/02/d173fb8d41464e2e544c34ae0a43be65.jpg","25000","3.5","13.5k"));
        list_recommend_food.add(new Food("آش رشته","https://gymito.com/blog/wp-content/uploads/2019/11/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D8%A2%D8%B4-%D8%B1%D8%B4%D8%AA%D9%87.jpg","35000","4.3","65.5k"));
        list_recommend_food.add(new Food("استیک گوشت","https://files.namnak.com/users/yf/aup/201807/329_pics/%D8%A7%D8%B3%D8%AA%DB%8C%DA%A9.jpg","75000","5.0","12.3k"));

        adapterRecommend = new RecommendFoodAdapter(this,list_recommend_food);
        recyclerViewRecommend.setAdapter(adapterRecommend);

    }

    private void getFoodCategory() {
        recyclerViewCategory = findViewById(R.id.rv_home_cat);
        recyclerViewCategory.setHasFixedSize(true);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
        list_category_food.add(new Food("پیتزا"));
        list_category_food.add(new Food("برگر"));
        list_category_food.add(new Food("سالاد"));
        list_category_food.add(new Food("نوشیدنی"));
        list_category_food.add(new Food("کیک"));
        list_category_food.add(new Food("ویژه"));
        list_category_food.add(new Food("پیتزا"));
        list_category_food.add(new Food("پیتزا"));
        list_category_food.add(new Food("پیتزا"));
        list_category_food.add(new Food("پیتزا"));

        adapterCategory = new CategoryFoodAdapter(getApplicationContext(),list_category_food);
        recyclerViewCategory.setAdapter(adapterCategory);
    }
    private void getFoodType() {
        recyclerViewType = findViewById(R.id.rv_Home_type);
        recyclerViewType.setHasFixedSize(true);
        recyclerViewType.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        list_type.add(new Food("ایرانی","https://irancook.ir/wp-content/uploads/2019/06/%D8%B2%D8%B1%D8%B4%DA%A9-%D9%BE%D9%84%D9%88-%D8%A8%D8%A7-%D9%85%D8%B1%D8%BA-%D9%85%D8%AC%D9%84%D8%B3%DB%8C.jpg"));
        list_type.add(new Food("ایتالیایی","https://cdn01.eavar.com/2020/1/7e7c479c-349b-4361-972a-2699d504c195.jpg"));
        list_type.add(new Food("اسپانیایی","https://cdn01.bluerose.ir/2019/3/213a3013-8c7a-4498-8a44-bf0e362579d1.jpg"));
        list_type.add(new Food("آمریکایی","https://gerdgard.com/wp-content/uploads/2018/10/food-1.jpg"));
        list_type.add(new Food("تایلندی","https://www.chetor.com/wp-content/uploads/2019/01/aad1-4.jpg"));
        list_type.add(new Food("مکزیکی","https://cdn.blog.safarme.com/2018/11/herson-rodriguez-96102-unsplash-2.jpg"));
        list_type.add(new Food("ژاپنی","https://setarehvanak.com/blog/wp-content/uploads/2019/01/%D8%B3%D9%88%D8%B4%DB%8C-min.jpg"));
        adapterType = new TypeFoodAdapter(getApplicationContext(),list_type);
        recyclerViewType.setAdapter(adapterType);
    }
}