package com.example.materialdesignapp.part2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part2.adapter.RecommendFoodDetailAdapter;
import com.example.materialdesignapp.part2.model.Food;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DetailFoodActivity extends AppCompatActivity {

    ImageView iv_collapsingDetail,iv_back;
    TextView tv_collapsingDetailName,tv_detailName,tv_detailDesc,tv_detailCount,tv_detailRate,tv_detailPrice;

    Bundle bundle;
    String nameFood,link_img,desc,count,rate,price;
    String nameSlider,link_img_slider,desc_slider,count_slider,rate_slider,price_slider;

    RecyclerView rvDetailRecommend;
    List<Food> list_DetailRecommend = new ArrayList<>();
    RecommendFoodDetailAdapter adapterDetailRecommend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_food);
        getAppbarANDDecCard();
        getRecommendRV();
        getSlider();


        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void getSlider() {
        bundle = getIntent().getExtras();

        nameSlider =bundle.getString("name");
        link_img_slider =bundle.getString("link_img");
        desc_slider =bundle.getString("desc");
        count_slider =bundle.getString("count");
        rate_slider =bundle.getString("rate");
        price_slider =bundle.getString("price");

        Picasso.with(this).load(link_img_slider).into(iv_collapsingDetail);
        tv_collapsingDetailName.setText(nameSlider);
        tv_detailName.setText(nameSlider);
        tv_detailDesc.setText(desc_slider);
        tv_detailCount.setText("("+count_slider+")");
        tv_detailPrice.setText("قیمت : "+price_slider+" تومان");
        tv_detailRate.setText(rate_slider);


    }

    private void getRecommendRV() {
        rvDetailRecommend = findViewById(R.id.rv_detailFood_recommend);
        rvDetailRecommend.setHasFixedSize(true);
        rvDetailRecommend.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        list_DetailRecommend.add(new Food("قرمه سبزی","https://noktechi.ir/wp-content/uploads/2019/11/ghorme-sabzi.jpg","50000","5.0","22.3k"));
        list_DetailRecommend.add(new Food("قیمه","https://noktechi.ir/wp-content/uploads/2019/12/khoresh-gheyme.jpg","43000","4.9","15.6k","خورشت قیمه معمولا به یه روش کلی و مرسوم پخته میشه، ولی چرا خورشت قیمه بعضی ها خیلی خوشمزه تر و خوش عطر تر از بقیه اس؟؟ به نظر من دلیل اصلی خوشمزه شدن قیمه تجربه داشتن در آشپزیه، اما یه دلیل دیگه هم هست که خیلی مهمه، اونم ادویه هایی که تو این خورشت استفاده میشه بعلاوه فوت و فن های پختنشه. در این مطلب علاوه بر آموزش مرحله به مرحله پخت خورشت قیمه درباره این ادویه ها و نکات هم توضیح میدم."));
        list_DetailRecommend.add(new Food("فسنجون","https://www.niksalehi.com/cooking/wp-content/uploads/sites/52/2014/06/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D9%81%D8%B3%D9%86%D8%AC%D9%88%D9%86-%D8%BA%D8%B0%D8%A7%DB%8C-%D8%A7%D8%B5%DB%8C%D9%84-%D8%A7%DB%8C%D8%B1%D9%88%D9%86%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","41000","4.8","42.6k","خورشت فسنجون یا فسنجان یکی از اصیل ترین و خوشمزه ترین خورشت های ایرانی است. خواستگاه و اصالت خورشت فسنجون از استان گیلان است. اما به دلیل طعم بی نظیر و خوشمزه آن در اکثر شهرهای ایران پخته می شود. این غذا معمولا با گوشت یا مرغ برای ناهار درست می شود که این بار قصد داریم طرز پخت آن با مرغ را به شما عزیزان آموزش دهیم. اگر قصد دارید این غذا را با گوشت های قلقلی درست کنید، طرز تهیه فسنجان با گوشت قلقلی را دنبال کنید. گفته می شود که خورشت فسنجون یکی از قدیمی ترین غذاهای سنتی ایرانی است که قدمت آن به دوره ساسانیان بر می گردد. در مناطق شمالی در تهیه فسنجون از گوشت اردک و گاهی گوشت قلقلی استفاده می کنند. در ادامه شما را با طرز تهیه خورشت فسنجون با گوشت مرغ آشنا خواهیم کرد. این خورشت خوشمزه را برای شام شب یلدا و مراسم دیگر نیز سرو می کنند. "));
        list_DetailRecommend.add(new Food("کشک بادمجون","https://img-global.cpcdn.com/recipes/afbff9346ee4cdae/751x532cq70/%DA%A9%D8%B4%DA%A9-%D8%A8%D8%A7%D8%AF%D9%85%D8%AC%D9%88%D9%86-%D9%85%D8%B1%D8%B6%DB%8C%D9%87-%D9%BE%D8%B2-%D8%AF%D8%B3%D8%AA%D9%88%D8%B1-%D8%A7%D8%B5%D9%84%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","20000","4.2","45.3k","اول از همه بادمجان ها را پوست می کنیم و مثل خیلی از غذاهای دیگه که گفتم بادمجان ها را می گذاریم نیم ساعت یک کنار تا آب بندازن و بعد از آن آنها را آب می کشیم و میگذاریم خشک بشن. حال در داخل یک ماهیتابه ای مقدار لازم روغن می ریزیم و می گذاریم یک الی دو دقیقه روغن آن داغ شود و بعد از داغ شدن آن بادمجان ها را درون ماهیتابه می ریزیم و بعد آنها را سرخ می کنیم و می گذاریم تا کمی رنگ آنها عوض شود."));
        list_DetailRecommend.add(new Food("باقلا قاتوق","https://parsiday.com/wp-content/uploads/2020/10/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D8%A8%D8%A7-%D9%82%D9%84%D8%A7%D9%82%D8%A7%D8%AA%D9%82.jpg","40000","3.7","32.4k","پوست باقلا را جدا کنید و به همراه کمی روغن یا کره تفت دهید .بعد از کمی تفت دادن باقلا ،سیر کوبیده شده ,شوید و کمی زردچوبه و نمک  را هم به آن اضافه کنید و هم بزنید تا خوب تفت بخورند.سپس ا لیتر آب روی آنها بریزید تا باقلا نیم پز شود و وقتی آب داخل  باقلا به جوش آمد تخم مرغ ها را به آنها اضافه میکنیم .تخم مرغ ها باید کاملا  پخته شوند و نباید  در غذا هم زده شوند .در پایان پخت باقلا هم میتوانید آن را با کمی دارچین و نمک خوش عطر تر و لذیذ تر کنید."));
        list_DetailRecommend.add(new Food("لوبیا پلو","https://img-global.cpcdn.com/recipes/db76ca6763a534b5/751x532cq70/%D9%84%D9%88%D8%A8%DB%8C%D8%A7-%D9%BE%D9%84%D9%88-%D9%85%D8%AC%D9%84%D8%B3%DB%8C-%D8%AF%D8%B3%D8%AA%D9%88%D8%B1-%D8%A7%D8%B5%D9%84%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","32000","4.6","23.4k","نکات تکمیلی پخت لوبیا پلو" +
                "با نکته هایی که برای شما بیان می کنیم می توانید از طعم بهتر لوبیا پلو لذت ببرید :" +
                "" +
                "اگر دوستدار لوبیا پلو هستید در فصل بهار لوبیا سبزهای جوان را آماده و فریز کنید." +

                "سعی کنید قبل از فریز کردن لوبیاها آن ها را بلانچ کنید.و یا اگراز لوبیا سبز تازه استفاده می کنید در همان لحظه پخت آنها را بلانچ کنید." +
                "به جای پودر دارچین میتوانید از چوب دارچین در پخت گوشت استفاده کنید." +
                "اگر به لوبیا پلو کمی زعفران غلیظ شده اضافه کنید باعث لذیذ تر شدن طعم گوشت آن خواهد شد." +
                "استفاده از زیره در هنگام دم کشیدن لوبیا پلو برای بهتر شدن طعم آن مناسب است." +
                "شما میتوانید مقداری پودر گل سرخ را به همراه ادویه لوبیا پلو در هنگام سرخ کردن گوشت به اضافه می کنید."));
        list_DetailRecommend.add(new Food("ماکارونی","https://blog.okcs.com/wp-content/uploads/2019/02/d173fb8d41464e2e544c34ae0a43be65.jpg","25000","3.5","13.5k","ماکارونی یکی از گونه های پاستا می باشد که همانطور که مطمئنا می دنید اصالت آن متعلق به کشور ایتالیا می باشد. ماکارونی از محبوبیت بالایی در میان مردن جهان برخوردار است و به همین دلیل یکی از پر مصرف ترین غذاها در کل دنیا می باشد.این غذای ساده و خوشمزه هم در کشور عزیزمان ایران هم طرفداران بسیار زیادی دارد ، البته نکته جالب در مورد ماکارونی در میان ایرانیان این است که ته دیگ ماکارونی ( ته دیگ سیب زمینی ) از خود ماکارونی دارای محبوبیت بیشتری است."));
        list_DetailRecommend.add(new Food("آش رشته","https://gymito.com/blog/wp-content/uploads/2019/11/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D8%A2%D8%B4-%D8%B1%D8%B4%D8%AA%D9%87.jpg","35000","4.3","65.5k","طرز تهیه “آش رشته” یکی از غذاهای مورد علاقه ایرانیان را در این مطلب برای شما ارائه کرده ایم. مقداری از پیاز و سیر و نعناع سرخ شده را به آش اضافه کنید و بقیه را برای تزئین روی آش نگه دارید.از شب قبل نخود و لوبیا ها را باهم در ظرفی خیس میکنیم و عدس را جداگانه در ظرف دیگری خیس میدهیم .پیاز ها را هم خلالی میکنیم و برای اینکه موقع سرخ کردن له نشود و حالت چیپسی پیدا کند از شب قبل آن را روی پارچه ای تمیز پهن میکنیم و با یک پارچه نازک روی آن را می پوشانیم." +
                "نخود و لوبیاهایی که از شب قبل خیس کردیم درون قابلمه ای با 5 لیوان آب می پزیم و وقتی جوش آمد کف روی حبوبات را با قاشق میگیریم وحرارت شعله را کمتر میکنیم و در قابلمه را به طور کمی نیمه باز روی آن قرار میدهیم  و یک ساعت به آن زمان میدهیم تا حبوبات پخته شوند."));
        list_DetailRecommend.add(new Food("استیک گوشت","https://files.namnak.com/users/yf/aup/201807/329_pics/%D8%A7%D8%B3%D8%AA%DB%8C%DA%A9.jpg","75000","5.0","12.3k","طبخ استیک مثل هر غذای دیگر نیاز به رعایت فوت و فنی دارد اما گاهی در پخت آن دچار اشتباهاتی می شویم ، با این اشتباهات رایج در پخت استیک آشنا شوید.استیک طعم بسیار لذیذی دارد که باب میل اکثر سلیقه های غذایی می باشد اما اگر قصد خوب درست کردن استیک را داشته باشیم نیاز است که ابتدا طرز تهیه استیک و بعد نکات مهم هنگام طبخ آن را یاد بگیریم."));
        adapterDetailRecommend = new RecommendFoodDetailAdapter(this,list_DetailRecommend);
        rvDetailRecommend.setAdapter(adapterDetailRecommend);
    }

    private void getAppbarANDDecCard() {
        iv_collapsingDetail = findViewById(R.id.iv_detailFood_Collapsing);
        tv_collapsingDetailName = findViewById(R.id.tv_toolbarDetail_name);
        iv_back = findViewById(R.id.back_detailFood);
        tv_detailName = findViewById(R.id.tv_detailFood_name);
        tv_detailDesc = findViewById(R.id.tv_detailFood_desc);
        tv_detailCount = findViewById(R.id.tv_detailFood_foodCount);
        tv_detailRate = findViewById(R.id.tv_detailFood_foodRate);
        tv_detailPrice = findViewById(R.id.tv_detailFood_price);



        bundle = getIntent().getExtras();

        nameFood = bundle.getString("name");
        link_img = bundle.getString("link_img");
        desc = bundle.getString("desc");
        count = bundle.getString("count");
        rate = bundle.getString("rate");
        price =bundle.getString("price");


        tv_collapsingDetailName.setText(nameFood);
        tv_detailName.setText(nameFood);
        Picasso.with(this).load(link_img).into(iv_collapsingDetail);
        tv_detailDesc.setText(desc);
        tv_detailCount.setText("("+count+")");
        tv_detailPrice.setText("قیمت : "+price+" تومان");
        tv_detailRate.setText(rate);

    }
}