package com.example.materialdesignapp.part3.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.part3.adapter.IntroArtistAdapter;
import com.example.materialdesignapp.part3.adapter.MusicVideoAdapter;
import com.example.materialdesignapp.part3.adapter.NewSongAdapter;
import com.example.materialdesignapp.part3.model.Music;
import com.example.materialdesignapp.part3.model.MusicVideo;

import java.util.ArrayList;
import java.util.List;

public class MusicFragment extends Fragment {


    public MusicFragment() {
        // Required empty public constructor

    }

    View view;
    //Intro
    List<Music> listIntro = new ArrayList<>();
    IntroArtistAdapter adapterIntro;
    RecyclerView rvIntro;

    //newSong
    List<Music> listNewSong = new ArrayList<>();
    NewSongAdapter adapterNewSong;
    RecyclerView rvNewSong;
    //musicVideo
    List<MusicVideo> listMusicVideo = new ArrayList<>();
    MusicVideoAdapter adapterMusicVideo;
    RecyclerView rvMusicVideo;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_music, container, false);

        getIntroMusic();
        getNewSongMusic();
        getMusicVideoMusic();


        return view;
    }

    private void getMusicVideoMusic() {
        rvMusicVideo =view.findViewById(R.id.rv_frMusic_musicVideo);
        rvMusicVideo.setHasFixedSize(true);
        rvMusicVideo.setLayoutManager(new GridLayoutManager(getContext(),2));
        listMusicVideo.add(new MusicVideo("https://rozmusic.com/wp-content/uploads/2020/05/Alireza-Talischi-Ay-Dele-Ghafel.jpg","https://dl.rozmusic.com/Music%20Video/1399/12/12/Alireza%20Talischi%20-%20Ay%20Dele%20Ghafel%20480p_RozMusic.mp4"));
        listMusicVideo.add(new MusicVideo("https://rozmusic.com/wp-content/uploads/2019/08/PedramPaliz-Taghvime-Shamsi.jpg","https://dl.rozmusic.com/Music%20Video/1400/01/16/Pedram%20Paliz%20-%20Taghvime%20Shamsi_RozMusic.MP4"));
        listMusicVideo.add(new MusicVideo("https://rozmusic.com/wp-content/uploads/2021/03/Reza-Sadeghi-Yekio-Doost-Dashtam.jpg","https://dl.rozmusic.com/Music%20Video/1399/12/21/Reza%20Sadeghi%20-%20Yekio%20Doost%20Dashtam%20480p_RozMusic.mp4"));
        listMusicVideo.add(new MusicVideo("https://rozmusic.com/wp-content/uploads/2020/12/Masoud-Sadeghloo-Zade-Baroon.jpg","https://dl.rozmusic.com/Music%20Video/1399/12/29/Masoud%20Sadeghloo%20-%20Zade%20Baroon%20480p_RozMusic.mp4"));

        adapterMusicVideo= new MusicVideoAdapter(getContext(),listMusicVideo);
        rvMusicVideo.setAdapter(adapterMusicVideo);
    }

    private void getNewSongMusic() {
        rvNewSong = view.findViewById(R.id.rv_frMusic_newSongs);
        rvNewSong.setHasFixedSize(true);
        rvNewSong.setLayoutManager(new GridLayoutManager(getContext(),3));

        listNewSong.add(new Music("Mohsen Chavoshi","Sale Bi Bahar","https://cdnmrtehran.ir/media/mp3s/mohsen_chavoshi/mohsen_chavoshi_sale_bi_bahar.jpg"));
        listNewSong.add(new Music("Mohammad Alizadeh","Gando","https://cdnmrtehran.ir/media/mp3s/mohammad_alizadeh/mohammad_alizadeh_gando.jpg"));
        listNewSong.add(new Music("Ali Yasini","Divar","https://cdnmrtehran.ir/media/mp3s/ali_yasini/ali_yasini_24.jpg"));
        listNewSong.add(new Music("Xaniar Khosravi","Gelofen","https://cdnmrtehran.ir/media/mp3s/xaniar_khosravi/xaniar_khosravi_gelofen.jpg"));
        listNewSong.add(new Music("Mohsen Yeganeh","Shahre Khakestari","https://cdnmrtehran.ir/media/mp3s/mohsen_yeganeh/mohsen_yeganeh_shahre_khakestari.jpg"));
        listNewSong.add(new Music("Naser Zeynali","Bego Chand","https://cdnmrtehran.ir/media/mp3s/naser_zeynali/naser_zeynali_bego_chand.jpg"));
        listNewSong.add(new Music("Hojjat Ashrafzadeh & Reza Rashidpour","Baran Bebarad","https://cdnmrtehran.ir/media/mp3s/hojjat_ashrafzadeh/hojjat_ashrafzadeh_baran_bebarad.jpg"));
        listNewSong.add(new Music("Evan Band","Goli","https://cdnmrtehran.ir/media/mp3s/evan_band/evan_band_goli.jpg"));
        listNewSong.add(new Music("Hamid Hiraad","Delbar","https://cdnmrtehran.ir/media/mp3s/hamid_hiraad/hamid_hiraad_delbar.jpg"));
        listNewSong.add(new Music("Mehdi Jahani","Vojoode To","https://cdnmrtehran.ir/media/mp3s/mehdi_jahani/mehdi_jahani_vojoode_to.jpg"));
        listNewSong.add(new Music("Ragheb","Divanegi","https://cdnmrtehran.ir/media/mp3s/ragheb/ragheb_divanegi.jpg"));
        listNewSong.add(new Music("Farzad Farokh","Cheshm Ahoo","https://cdnmrtehran.ir/media/mp3s/farzad_farokh/farzad_farokh_cheshm_ahoo.jpg"));

        adapterNewSong = new NewSongAdapter(getContext(),listNewSong);
        rvNewSong.setAdapter(adapterNewSong);
    }

    private void getIntroMusic() {
        rvIntro = view.findViewById(R.id.rv_frMusic_intro);
        rvIntro.setHasFixedSize(true);
        rvIntro.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        listIntro.add(new Music("Meysam Ebrahimi", "Salamati", "02:58", "https://cdnmrtehran.ir/media/mp3s/meysam_ebrahimi/meysam_ebrahimi_salamati.jpg", "3.5k", "8"));
        listIntro.add(new Music("Reza Sadeghi", "Hale Khoob", "03:27", "https://cdnmrtehran.ir/media/mp3s/reza_sadeghi/reza_sadeghi_hale_khoob.jpg", "2.8k", "4"));
        listIntro.add(new Music("Ragheb", "Havaye Eshgh", "04:31", "https://cdnmrtehran.ir/media/mp3s/ragheb/ragheb_havaye_eshgh.jpg", "5.9k", "25"));
        listIntro.add(new Music("Farvaag", "Hamshahrihaye Khoobe Man", "03:46", "https://cdnmrtehran.ir/media/mp3s/farvaag/farvaag_hamshahrihaye_khoobe_man.jpg", "7.7k", "10"));
        listIntro.add(new Music("Mehdi Moghaddam", "Katrina   ", "03:16", "https://cdnmrtehran.ir/media/mp3s/mehdi_moghaddam/mehdi_moghaddam_katrina.jpg", "6.9k", "15"));
        listIntro.add(new Music("Shahin Banan", "Aftab", "05:50", "https://cdnmrtehran.ir/media/mp3s/shahin_banan/shahin_banan_aftab.jpg", "4.5k", "12k"));
        adapterIntro = new IntroArtistAdapter(getContext(), listIntro);
        rvIntro.setAdapter(adapterIntro);
    }
}