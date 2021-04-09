
package com.example.materialdesignapp.part2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
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
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
        list_slider.add(new Food("جوجه کباب","https://chishi.ir/wp-content/uploads/2020/07/jooje-kabab-tabe.jpg","54000","4.8","25.3k","جوجه کباب اصولا غذایی است که مرد های خونه ادعای بسیار زیادی در خوب درست کردن آن دارد ، با رعایت چند نکته ساده “جوجه کباب” را بسیار خوشمزه تر از قبل درست کنید."));
        list_slider.add(new Food("کوبیده","https://digifood.ir/wp-content/uploads/2020/06/kubide-digifood-5.jpg","45000","4.2","17.7k","کباب کوبیده کبابی است که برخلاف نظر برخی ها که می گویند درست کردن این کباب بسیار دشوار است و کباب ما آنطور که میخواهم مانند کباب های بیرون عمل نمی آید،  بسیار ساده و آسان تهیه می شود."));
        list_slider.add(new Food("غوره مسماي شمالی","https://cdn.yjc.ir/files/fa/news/1399/7/9/12674260_203.jpg","65000","4.9","16.9k","این غذای شمالی که گاهی با خورش بادمجان اشتباه گرفته می شود، غذایی است خوش طعم که به دلیل همراه شدن بادمجان با گوشت مرغ سرخ شده، کمتر کسی می تواند از آن بگذرد اما پخت این غذا نیز مانند سایر غذاهای ایرانی، ریزه کاری هایی دارد."));
        list_slider.add(new Food("آش رشته","https://iranwatching.com/images/content-image/2020/08/iranwatching-1526-1598384154-ash-reshte.jpg","38000","4.1","23.7k","طرز تهیه “آش رشته” یکی از غذاهای مورد علاقه ایرانیان را در این مطلب برای شما ارائه کرده ایم. مقداری از پیاز و سیر و نعناع سرخ شده را به آش اضافه کنید و بقیه را برای تزئین روی آش نگه دارید."));
        list_slider.add(new Food("مزغ شکم پر","https://irancook.ir/wp-content/uploads/2013/07/PicsArt_10-02-12.02.551-1280x720.jpg","59000","4.4","33.4k","مرغ شکم پر یکی از غذاهای خوشمزه و مجلسی ایرانی است که در مهمانی ها و مجالس گزینه خوبی به حساب می آید، همچنین شام  فوق العاده ای برای جشن گرفتن شب یلدا است. "));
        list_slider.add(new Food("خورشت ترش واش گیلانی","https://chishi.ir/wp-content/uploads/2020/09/torsh-vash.jpg","67000","5.0","65.6k","یکی از جذابیت های خطه سرسبز شمال کشور، به ویژه گیلان غذاهای محلی این منطقه است. غذاهایی که با مواد ارگانیک و سبزیجاتی درست می\u200Cشوند که اساسا در همین منطقه می\u200Cرویند. بنابراین غذاهای شمالی به ویژه غذاهای گیلکی در مقایسه با دیگر شهرها، طعم و عطر خاص خودشان را دارند. خورش ترش واش یکی از همین غذاهای گیلانی است که اصالتا درون ظرفی به نام گمج طبخ می\u200Cشود و در آن از سبزی به اسم «ترش واش» استفاده می\u200Cشود. این سبزی که به آن شبدر ترشک هم می\u200Cگویند، همانطور که از نام آن هم پیداست طعم ترشی دارد و در آشپزی گیلان از آن برای پخت خورش ترش واش استفاده می\u200Cشود."));
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
        list_new.add(new Food("قرمه سبزی","https://noktechi.ir/wp-content/uploads/2019/11/ghorme-sabzi.jpg","50000","5.0","22.3k","قورمه سبزی از معدود غذاهایی است که در طول تاریخ به شکل دست نخورده ای از مادر به دختر و از نسل به نسل دیگر منتقل شده است.\n" +
                "\n" +
                "یعنی قورمه سبزی که صد سال پیش طبخ می شد با قورمه سبزی که این روزها در خانه های ایرانیان طبخ می شود تفاوت چندانی ندارد . می توان گفت این خورشت ابتدا در بین عشایری که به کار دامپروری مشغول بودند شکل گرفت ؛ آنها با ذبح گوسفندان و خرد کردن گوشت و جداسازی چربی آن (برای تهیه روغن حیوانی) مراحل اولیه پخت قرمه سبزی را طی میکردند و با اضافه کردن سبزیجات کوهی و گرد لیمو آن غذا را تهیه می کردند."));
        list_new.add(new Food("قیمه","https://noktechi.ir/wp-content/uploads/2019/12/khoresh-gheyme.jpg","43000","4.9","15.6k","خورشت قیمه معمولا به یه روش کلی و مرسوم پخته میشه، ولی چرا خورشت قیمه بعضی ها خیلی خوشمزه تر و خوش عطر تر از بقیه اس؟؟ به نظر من دلیل اصلی خوشمزه شدن قیمه تجربه داشتن در آشپزیه، اما یه دلیل دیگه هم هست که خیلی مهمه، اونم ادویه هایی که تو این خورشت استفاده میشه بعلاوه فوت و فن های پختنشه. در این مطلب علاوه بر آموزش مرحله به مرحله پخت خورشت قیمه درباره این ادویه ها و نکات هم توضیح میدم.\n" +
                "\n"));
        list_new.add(new Food("فسنجون","https://www.niksalehi.com/cooking/wp-content/uploads/sites/52/2014/06/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D9%81%D8%B3%D9%86%D8%AC%D9%88%D9%86-%D8%BA%D8%B0%D8%A7%DB%8C-%D8%A7%D8%B5%DB%8C%D9%84-%D8%A7%DB%8C%D8%B1%D9%88%D9%86%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","41000","4.8","42.6k","خورشت فسنجون یا فسنجان یکی از اصیل\u200Cترین و خوشمزه\u200Cترین خورشت\u200Cهای ایرانی است. خواستگاه و اصالت خورشت فسنجون از استان گیلان است. اما به دلیل طعم بی\u200Cنظیر و خوشمزه آن در اکثر شهرهای ایران پخته می\u200Cشود. این غذا معمولا با گوشت یا مرغ برای ناهار درست می\u200Cشود که این بار قصد داریم طرز پخت آن با مرغ را به شما عزیزان آموزش دهیم. اگر قصد دارید این غذا را با گوشت\u200Cهای قلقلی درست کنید، طرز تهیه فسنجان با گوشت قلقلی را دنبال کنید. گفته می\u200Cشود که خورشت فسنجون یکی از قدیمی\u200Cترین غذاهای سنتی ایرانی است که قدمت آن به دوره ساسانیان بر می\u200Cگردد. در مناطق شمالی در تهیه فسنجون از گوشت اردک و گاهی گوشت قلقلی استفاده می\u200Cکنند. در ادامه شما را با طرز تهیه خورشت فسنجون با گوشت مرغ آشنا خواهیم کرد. این خورشت خوشمزه را برای شام شب یلدا و مراسم دیگر نیز سرو می\u200Cکنند. "));
        list_new.add(new Food("کشک بادمجون","https://img-global.cpcdn.com/recipes/afbff9346ee4cdae/751x532cq70/%DA%A9%D8%B4%DA%A9-%D8%A8%D8%A7%D8%AF%D9%85%D8%AC%D9%88%D9%86-%D9%85%D8%B1%D8%B6%DB%8C%D9%87-%D9%BE%D8%B2-%D8%AF%D8%B3%D8%AA%D9%88%D8%B1-%D8%A7%D8%B5%D9%84%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","20000","4.2","45.3k","اول از همه بادمجان ها را پوست می کنیم و مثل خیلی از غذاهای دیگه که گفتم بادمجان ها را می گذاریم نیم ساعت یک کنار تا آب بندازن و بعد از آن آنها را آب می کشیم و میگذاریم خشک بشن. حال در داخل یک ماهیتابه ای مقدار لازم روغن می ریزیم و می گذاریم یک الی دو دقیقه روغن آن داغ شود و بعد از داغ شدن آن بادمجان ها را درون ماهیتابه می ریزیم و بعد آنها را سرخ می کنیم و می گذاریم تا کمی رنگ آنها عوض شود."));
        list_new.add(new Food("باقلا قاتوق","https://parsiday.com/wp-content/uploads/2020/10/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D8%A8%D8%A7-%D9%82%D9%84%D8%A7%D9%82%D8%A7%D8%AA%D9%82.jpg","40000","3.7","32.4k","پوست باقلا را جدا کنید و به همراه کمی روغن یا کره تفت دهید .بعد از کمی تفت دادن باقلا ،سیر کوبیده شده ,شوید و کمی زردچوبه و نمک  را هم به آن اضافه کنید و هم بزنید تا خوب تفت بخورند.سپس ا لیتر آب روی آنها بریزید تا باقلا نیم پز شود و وقتی آب داخل  باقلا به جوش آمد تخم مرغ ها را به آنها اضافه میکنیم .تخم مرغ ها باید کاملا  پخته شوند و نباید  در غذا هم زده شوند .در پایان پخت باقلا هم میتوانید آن را با کمی دارچین و نمک خوش عطر تر و لذیذ تر کنید."));
        list_new.add(new Food("لوبیا پلو","https://img-global.cpcdn.com/recipes/db76ca6763a534b5/751x532cq70/%D9%84%D9%88%D8%A8%DB%8C%D8%A7-%D9%BE%D9%84%D9%88-%D9%85%D8%AC%D9%84%D8%B3%DB%8C-%D8%AF%D8%B3%D8%AA%D9%88%D8%B1-%D8%A7%D8%B5%D9%84%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","32000","4.6","23.4k","نکات تکمیلی پخت لوبیا پلو" +
                "با نکته هایی که برای شما بیان می کنیم می توانید از طعم بهتر لوبیا پلو لذت ببرید :" +
                "" +
                "اگر دوستدار لوبیا پلو هستید در فصل بهار لوبیا سبزهای جوان را آماده و فریز کنید." +

                "سعی کنید قبل از فریز کردن لوبیاها آن ها را بلانچ کنید.و یا اگراز لوبیا سبز تازه استفاده می کنید در همان لحظه پخت آنها را بلانچ کنید." +
                "به جای پودر دارچین میتوانید از چوب دارچین در پخت گوشت استفاده کنید." +
                "اگر به لوبیا پلو کمی زعفران غلیظ شده اضافه کنید باعث لذیذ تر شدن طعم گوشت آن خواهد شد." +
                "استفاده از زیره در هنگام دم کشیدن لوبیا پلو برای بهتر شدن طعم آن مناسب است." +
                "شما میتوانید مقداری پودر گل سرخ را به همراه ادویه لوبیا پلو در هنگام سرخ کردن گوشت به اضافه می کنید."));
        list_new.add(new Food("ماکارونی","https://blog.okcs.com/wp-content/uploads/2019/02/d173fb8d41464e2e544c34ae0a43be65.jpg","25000","3.5","13.5k","ماکارونی یکی از گونه های پاستا می باشد که همانطور که مطمئنا می دنید اصالت آن متعلق به کشور ایتالیا می باشد. ماکارونی از محبوبیت بالایی در میان مردن جهان برخوردار است و به همین دلیل یکی از پر مصرف ترین غذاها در کل دنیا می باشد.این غذای ساده و خوشمزه هم در کشور عزیزمان ایران هم طرفداران بسیار زیادی دارد ، البته نکته جالب در مورد ماکارونی در میان ایرانیان این است که ته دیگ ماکارونی ( ته دیگ سیب زمینی ) از خود ماکارونی دارای محبوبیت بیشتری است."));
        list_new.add(new Food("آش رشته","https://gymito.com/blog/wp-content/uploads/2019/11/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D8%A2%D8%B4-%D8%B1%D8%B4%D8%AA%D9%87.jpg","35000","4.3","65.5k","طرز تهیه “آش رشته” یکی از غذاهای مورد علاقه ایرانیان را در این مطلب برای شما ارائه کرده ایم. مقداری از پیاز و سیر و نعناع سرخ شده را به آش اضافه کنید و بقیه را برای تزئین روی آش نگه دارید.از شب قبل نخود و لوبیا ها را باهم در ظرفی خیس میکنیم و عدس را جداگانه در ظرف دیگری خیس میدهیم .پیاز ها را هم خلالی میکنیم و برای اینکه موقع سرخ کردن له نشود و حالت چیپسی پیدا کند از شب قبل آن را روی پارچه ای تمیز پهن میکنیم و با یک پارچه نازک روی آن را می پوشانیم." +
                "نخود و لوبیاهایی که از شب قبل خیس کردیم درون قابلمه ای با 5 لیوان آب می پزیم و وقتی جوش آمد کف روی حبوبات را با قاشق میگیریم وحرارت شعله را کمتر میکنیم و در قابلمه را به طور کمی نیمه باز روی آن قرار میدهیم  و یک ساعت به آن زمان میدهیم تا حبوبات پخته شوند."));
        list_new.add(new Food("استیک گوشت","https://files.namnak.com/users/yf/aup/201807/329_pics/%D8%A7%D8%B3%D8%AA%DB%8C%DA%A9.jpg","75000","5.0","12.3k","طبخ استیک مثل هر غذای دیگر نیاز به رعایت فوت و فنی دارد اما گاهی در پخت آن دچار اشتباهاتی می شویم ، با این اشتباهات رایج در پخت استیک آشنا شوید.استیک طعم بسیار لذیذی دارد که باب میل اکثر سلیقه های غذایی می باشد اما اگر قصد خوب درست کردن استیک را داشته باشیم نیاز است که ابتدا طرز تهیه استیک و بعد نکات مهم هنگام طبخ آن را یاد بگیریم."));
        adapterNew = new NewFoodAdapter(this,list_new);
        recyclerViewNew.setAdapter(adapterNew);
    }

    private void getFoodRecommend() {
        recyclerViewRecommend = findViewById(R.id.rv_Home_recommend);
        recyclerViewRecommend.setHasFixedSize(true);
        recyclerViewRecommend.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        list_recommend_food.add(new Food("قرمه سبزی","https://noktechi.ir/wp-content/uploads/2019/11/ghorme-sabzi.jpg","50000","5.0","22.3k"));
        list_recommend_food.add(new Food("قیمه","https://noktechi.ir/wp-content/uploads/2019/12/khoresh-gheyme.jpg","43000","4.9","15.6k","خورشت قیمه معمولا به یه روش کلی و مرسوم پخته میشه، ولی چرا خورشت قیمه بعضی ها خیلی خوشمزه تر و خوش عطر تر از بقیه اس؟؟ به نظر من دلیل اصلی خوشمزه شدن قیمه تجربه داشتن در آشپزیه، اما یه دلیل دیگه هم هست که خیلی مهمه، اونم ادویه هایی که تو این خورشت استفاده میشه بعلاوه فوت و فن های پختنشه. در این مطلب علاوه بر آموزش مرحله به مرحله پخت خورشت قیمه درباره این ادویه ها و نکات هم توضیح میدم."));
        list_recommend_food.add(new Food("فسنجون","https://www.niksalehi.com/cooking/wp-content/uploads/sites/52/2014/06/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D9%81%D8%B3%D9%86%D8%AC%D9%88%D9%86-%D8%BA%D8%B0%D8%A7%DB%8C-%D8%A7%D8%B5%DB%8C%D9%84-%D8%A7%DB%8C%D8%B1%D9%88%D9%86%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","41000","4.8","42.6k","خورشت فسنجون یا فسنجان یکی از اصیل ترین و خوشمزه ترین خورشت های ایرانی است. خواستگاه و اصالت خورشت فسنجون از استان گیلان است. اما به دلیل طعم بی نظیر و خوشمزه آن در اکثر شهرهای ایران پخته می شود. این غذا معمولا با گوشت یا مرغ برای ناهار درست می شود که این بار قصد داریم طرز پخت آن با مرغ را به شما عزیزان آموزش دهیم. اگر قصد دارید این غذا را با گوشت های قلقلی درست کنید، طرز تهیه فسنجان با گوشت قلقلی را دنبال کنید. گفته می شود که خورشت فسنجون یکی از قدیمی ترین غذاهای سنتی ایرانی است که قدمت آن به دوره ساسانیان بر می گردد. در مناطق شمالی در تهیه فسنجون از گوشت اردک و گاهی گوشت قلقلی استفاده می کنند. در ادامه شما را با طرز تهیه خورشت فسنجون با گوشت مرغ آشنا خواهیم کرد. این خورشت خوشمزه را برای شام شب یلدا و مراسم دیگر نیز سرو می کنند. "));
        list_recommend_food.add(new Food("کشک بادمجون","https://img-global.cpcdn.com/recipes/afbff9346ee4cdae/751x532cq70/%DA%A9%D8%B4%DA%A9-%D8%A8%D8%A7%D8%AF%D9%85%D8%AC%D9%88%D9%86-%D9%85%D8%B1%D8%B6%DB%8C%D9%87-%D9%BE%D8%B2-%D8%AF%D8%B3%D8%AA%D9%88%D8%B1-%D8%A7%D8%B5%D9%84%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","20000","4.2","45.3k","اول از همه بادمجان ها را پوست می کنیم و مثل خیلی از غذاهای دیگه که گفتم بادمجان ها را می گذاریم نیم ساعت یک کنار تا آب بندازن و بعد از آن آنها را آب می کشیم و میگذاریم خشک بشن. حال در داخل یک ماهیتابه ای مقدار لازم روغن می ریزیم و می گذاریم یک الی دو دقیقه روغن آن داغ شود و بعد از داغ شدن آن بادمجان ها را درون ماهیتابه می ریزیم و بعد آنها را سرخ می کنیم و می گذاریم تا کمی رنگ آنها عوض شود."));
        list_recommend_food.add(new Food("باقلا قاتوق","https://parsiday.com/wp-content/uploads/2020/10/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D8%A8%D8%A7-%D9%82%D9%84%D8%A7%D9%82%D8%A7%D8%AA%D9%82.jpg","40000","3.7","32.4k","پوست باقلا را جدا کنید و به همراه کمی روغن یا کره تفت دهید .بعد از کمی تفت دادن باقلا ،سیر کوبیده شده ,شوید و کمی زردچوبه و نمک  را هم به آن اضافه کنید و هم بزنید تا خوب تفت بخورند.سپس ا لیتر آب روی آنها بریزید تا باقلا نیم پز شود و وقتی آب داخل  باقلا به جوش آمد تخم مرغ ها را به آنها اضافه میکنیم .تخم مرغ ها باید کاملا  پخته شوند و نباید  در غذا هم زده شوند .در پایان پخت باقلا هم میتوانید آن را با کمی دارچین و نمک خوش عطر تر و لذیذ تر کنید."));
        list_recommend_food.add(new Food("لوبیا پلو","https://img-global.cpcdn.com/recipes/db76ca6763a534b5/751x532cq70/%D9%84%D9%88%D8%A8%DB%8C%D8%A7-%D9%BE%D9%84%D9%88-%D9%85%D8%AC%D9%84%D8%B3%DB%8C-%D8%AF%D8%B3%D8%AA%D9%88%D8%B1-%D8%A7%D8%B5%D9%84%DB%8C-%D8%B9%DA%A9%D8%B3.jpg","32000","4.6","23.4k","نکات تکمیلی پخت لوبیا پلو" +
                "با نکته هایی که برای شما بیان می کنیم می توانید از طعم بهتر لوبیا پلو لذت ببرید :" +
                "" +
                "اگر دوستدار لوبیا پلو هستید در فصل بهار لوبیا سبزهای جوان را آماده و فریز کنید." +

                "سعی کنید قبل از فریز کردن لوبیاها آن ها را بلانچ کنید.و یا اگراز لوبیا سبز تازه استفاده می کنید در همان لحظه پخت آنها را بلانچ کنید." +
                "به جای پودر دارچین میتوانید از چوب دارچین در پخت گوشت استفاده کنید." +
                "اگر به لوبیا پلو کمی زعفران غلیظ شده اضافه کنید باعث لذیذ تر شدن طعم گوشت آن خواهد شد." +
                "استفاده از زیره در هنگام دم کشیدن لوبیا پلو برای بهتر شدن طعم آن مناسب است." +
                "شما میتوانید مقداری پودر گل سرخ را به همراه ادویه لوبیا پلو در هنگام سرخ کردن گوشت به اضافه می کنید."));
        list_recommend_food.add(new Food("ماکارونی","https://blog.okcs.com/wp-content/uploads/2019/02/d173fb8d41464e2e544c34ae0a43be65.jpg","25000","3.5","13.5k","ماکارونی یکی از گونه های پاستا می باشد که همانطور که مطمئنا می دنید اصالت آن متعلق به کشور ایتالیا می باشد. ماکارونی از محبوبیت بالایی در میان مردن جهان برخوردار است و به همین دلیل یکی از پر مصرف ترین غذاها در کل دنیا می باشد.این غذای ساده و خوشمزه هم در کشور عزیزمان ایران هم طرفداران بسیار زیادی دارد ، البته نکته جالب در مورد ماکارونی در میان ایرانیان این است که ته دیگ ماکارونی ( ته دیگ سیب زمینی ) از خود ماکارونی دارای محبوبیت بیشتری است."));
        list_recommend_food.add(new Food("آش رشته","https://gymito.com/blog/wp-content/uploads/2019/11/%D8%B7%D8%B1%D8%B2-%D8%AA%D9%87%DB%8C%D9%87-%D8%A2%D8%B4-%D8%B1%D8%B4%D8%AA%D9%87.jpg","35000","4.3","65.5k","طرز تهیه “آش رشته” یکی از غذاهای مورد علاقه ایرانیان را در این مطلب برای شما ارائه کرده ایم. مقداری از پیاز و سیر و نعناع سرخ شده را به آش اضافه کنید و بقیه را برای تزئین روی آش نگه دارید.از شب قبل نخود و لوبیا ها را باهم در ظرفی خیس میکنیم و عدس را جداگانه در ظرف دیگری خیس میدهیم .پیاز ها را هم خلالی میکنیم و برای اینکه موقع سرخ کردن له نشود و حالت چیپسی پیدا کند از شب قبل آن را روی پارچه ای تمیز پهن میکنیم و با یک پارچه نازک روی آن را می پوشانیم." +
                "نخود و لوبیاهایی که از شب قبل خیس کردیم درون قابلمه ای با 5 لیوان آب می پزیم و وقتی جوش آمد کف روی حبوبات را با قاشق میگیریم وحرارت شعله را کمتر میکنیم و در قابلمه را به طور کمی نیمه باز روی آن قرار میدهیم  و یک ساعت به آن زمان میدهیم تا حبوبات پخته شوند."));
        list_recommend_food.add(new Food("استیک گوشت","https://files.namnak.com/users/yf/aup/201807/329_pics/%D8%A7%D8%B3%D8%AA%DB%8C%DA%A9.jpg","75000","5.0","12.3k","طبخ استیک مثل هر غذای دیگر نیاز به رعایت فوت و فنی دارد اما گاهی در پخت آن دچار اشتباهاتی می شویم ، با این اشتباهات رایج در پخت استیک آشنا شوید.استیک طعم بسیار لذیذی دارد که باب میل اکثر سلیقه های غذایی می باشد اما اگر قصد خوب درست کردن استیک را داشته باشیم نیاز است که ابتدا طرز تهیه استیک و بعد نکات مهم هنگام طبخ آن را یاد بگیریم."));

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