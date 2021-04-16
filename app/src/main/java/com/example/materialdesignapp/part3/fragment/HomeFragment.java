package com.example.materialdesignapp.part3.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part3.adapter.HeaderAlbumAdapter;
import com.example.materialdesignapp.part3.adapter.HeaderMusicAdapter;
import com.example.materialdesignapp.part3.adapter.PlayListHomeAdapter;
import com.example.materialdesignapp.part3.model.Music;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }
    //headerMusic
    View view;
    RecyclerView rvHeaderMusic;
    HeaderMusicAdapter adapterHeaderMusic;
    List<Music> listHeaderMusic = new ArrayList<>();

    //headerAlbum
    RecyclerView rvHeaderAlbum;
    HeaderAlbumAdapter adapterHeaderAlbum;
    List<Music> listHeaderAlbum = new ArrayList<>();
    //ListPlay
    RecyclerView rvListHome;
    PlayListHomeAdapter adapterListHome;
    List<Music> listListHome = new ArrayList<>();




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home,container,false);

        getHeaderMusic();
        getHeaderAlbum();
        getListHome();


        return view;
    }

    private void getListHome() {
        rvListHome = view.findViewById(R.id.rv_listHome);
        rvListHome.setHasFixedSize(true);
        rvListHome.setLayoutManager(new LinearLayoutManager(getContext()));
        listListHome.add(new Music("Alireza Lafzi","Genre Episode 11","03:56","https://cdnmrtehran.ir/media/mp3s/alireza_lafzi/alireza_lafzi_genre_episode_11.jpg",""));
        listListHome.add(new Music("Amin Habibi","Khoobe Ke Hasti","04:02","https://cdnmrtehran.ir/media/mp3s/amin_habibi/amin_habibi_khoobe_ke_hasti.jpg",""));
        listListHome.add(new Music("Macan Band","Bon Bast","03:22","https://cdnmrtehran.ir/media/mp3s/macan_band/macan_band_bon_bast.jpg",""));
        listListHome.add(new Music("Ehsan Daryadel","Del Kandam","05:01","https://cdnmrtehran.ir/media/mp3s/ehsan_daryadel/ehsan_daryadel_del_kandam.jpg",""));
        listListHome.add(new Music("Sina Derakhshande","Namak Dari","04:44","https://cdnmrtehran.ir/media/mp3s/sina_derakhshande/sina_derakhshande_namak_dari.jpg",""));
        listListHome.add(new Music("Meysam Ebrahimi","Salamati","02:58","https://cdnmrtehran.ir/media/mp3s/meysam_ebrahimi/meysam_ebrahimi_salamati.jpg",""));
        listListHome.add(new Music("Farvaag","Hamshahrihaye Khoobe Man","03:46","https://cdnmrtehran.ir/media/mp3s/farvaag/farvaag_hamshahrihaye_khoobe_man.jpg",""));
        listListHome.add(new Music("Mehdi Moghaddam","Katrina   ","03:16","https://cdnmrtehran.ir/media/mp3s/mehdi_moghaddam/mehdi_moghaddam_katrina.jpg",""));
        listListHome.add(new Music("Shahin Banan","Aftab","05:50","https://cdnmrtehran.ir/media/mp3s/shahin_banan/shahin_banan_aftab.jpg",""));
        listListHome.add(new Music("Ragheb","Havaye Eshgh","04:31","https://cdnmrtehran.ir/media/mp3s/ragheb/ragheb_havaye_eshgh.jpg",""));
        listListHome.add(new Music("Reza Sadeghi","Hale Khoob","03:27","https://cdnmrtehran.ir/media/mp3s/reza_sadeghi/reza_sadeghi_hale_khoob.jpg",""));
        listListHome.add(new Music("Salar Aghili","Norooze Eshgh","04:30","https://cdnmrtehran.ir/media/mp3s/salar_aghili/salar_aghili_norooze_eshgh.jpg",""));

        adapterListHome = new PlayListHomeAdapter(getContext(),listListHome);
        rvListHome.setAdapter(adapterListHome);
    }

    private void getHeaderAlbum() {
        rvHeaderAlbum = view.findViewById(R.id.rv_frHome_album);
        rvHeaderAlbum.setHasFixedSize(true);
        rvHeaderAlbum.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));

        listHeaderAlbum.add(new Music("https://cdnmrtehran.ir/media/genremood/5e8badd9490f7.jpg"));
        listHeaderAlbum.add(new Music("https://cdnmrtehran.ir/media/genremood/5e397cb5adc18.jpg"));


        adapterHeaderAlbum = new HeaderAlbumAdapter(getContext(),listHeaderAlbum);
        rvHeaderAlbum.setAdapter(adapterHeaderAlbum);
    }

    private void getHeaderMusic() {
        rvHeaderMusic = view.findViewById(R.id.rv_frHome_music);
        rvHeaderMusic.setHasFixedSize(true);
        rvHeaderMusic.setLayoutManager(new GridLayoutManager(getContext(),2));

        listHeaderMusic.add(new Music("سلام","https://cdnmrtehran.ir/media/imgtmp/606f196b005e0.jpg"));
        listHeaderMusic.add(new Music("احساسی میشم","https://cdnmrtehran.ir/media/imgtmp/605cadf0e7d55.jpg"));
        listHeaderMusic.add(new Music("تو","https://cdnmrtehran.ir/media/imgtmp/605f4822a29c1.jpg"));
        listHeaderMusic.add(new Music("هایلایت 5","https://cdnmrtehran.ir/media/imgtmp/606d7b4372b9d.jpg"));


        adapterHeaderMusic = new HeaderMusicAdapter(getContext(),listHeaderMusic);
        rvHeaderMusic.setAdapter(adapterHeaderMusic);
    }
}