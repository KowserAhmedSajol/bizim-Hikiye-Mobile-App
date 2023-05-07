package com.sajoltech.bizimhikiye;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;

public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

        /*
    >>Source Code provided by
    >>Jubayer Hossain [https://www.facebook.com/JubayerHossainbd]
    >>Please don't forget to put a review on my site [www.bongoacademy.com]
    >>Share my course with your friends on Facebook
    >>Your positive words help me doing even better
     */

    //====================================================================
    private void addVideos(){
        // We will add all videos here

        //Video Details Here Here
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "0lfCGaQ5bH4");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 01 ");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>


        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "gfq5Hxn4g3U");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 02");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>


        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "EHpSOA13Wxc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 03");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>



        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "820JaWc4hGE");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 04");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "-TsiWGwyOKU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 05");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "EJzRMILACZg");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 06");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Vk1k0-XqOoo");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 07");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "n36hmWkN8Q4");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 08");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "QbGmNq3iqzU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 09");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "0I9v8WkdDck");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 10");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xhBUOfeInuI");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 11");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ruuucNOlb8A");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 12");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ACfniFNp0Bc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 13");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "wlgpQtLQqZs");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 14");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6r_8zziM4jQ");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 15");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xLwbvIxWp4g");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 16");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9piJ_-yqWsE");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 17");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "HGk00GqSi6E");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 18");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "U6OEiPU_5U4");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 19");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "QvJkU9-unQ4");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 20");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4Cx3nQsEwog");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 21");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "wVq5WB3V11I");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 22");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "DXZM5uQWPZs");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 23");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "cDi9unvBZ-0");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 24");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_Yo47GRJXr4");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 25");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "BJY4icL3_7Q");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 26");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "liFseuOpvpI");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 27");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "rmtpNYWhkJQ");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 28");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3TNhXekWb5I");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 29");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "g7fageJow4Y");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 30");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "uBw6ywZcFng");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 31");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vT2hOhtOd8c");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 32");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "M42YWln1Ovw");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 33");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Yx3sxawgQzk");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 34");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "IsQPIUiMggo");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 35");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jRh7nIHKI6Y");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 36");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jAIIzg5JsN8");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 37");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "fvu8yBSPqRQ");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 38");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "g75i-NJ5HcM");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 39");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Qw-r_X_g46M");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 40");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "EdVeirAOohU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 41");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "27g_1ht-AiI");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 42");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "fJ0cZKbGKg8");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 43");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "LS_FvUkCO8g");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 44");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_ewwFmc2yjo");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 45");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "rgjY8B07N3s");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 46");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "VbzQUiwqbq4");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 47");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Bxw47quym3s");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 48");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "S_r_uz09k80");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 49");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6IesXJi_vkM");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 50");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "16tCtbRuKHw");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 51");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "zYHf-Khs5vA");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 52");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "sA1IDMSEcSM");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 53");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8uXjBX0MtF0");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 54");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "sPtgINHYGWc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 55");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "EfcG7xi4d6Q");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 56");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "gxe9c2AwL98");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 57");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "km_JWdajx4o");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 58");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "V3FBGejALJw");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 59");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "U1TJ0dEqfrc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 60");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "VO2Vop31fCM");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 61");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9VHR-bhvvsc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 62");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "UJcEHLrY7tU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 63");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Qzpg_d8sPkg");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 64");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "D2SAp8bWSvI");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 65");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "dql5idwuYuo");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 66");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jIpVlgLaNlw");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 67");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "bIGf3AqLNdw");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 68");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6KHj3uUGltU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 69");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "T9pIZiAAFa0");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 70");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "0kfgMCg--t0");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 71");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1ywFMhdBCR0");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 72");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "dhuSOJrZctY");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 73");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "plp7wXxQ52o");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 74");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "g5cx_zDCUes");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 75");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "87uw12Xi9G4");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 76");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "EO7Du5kIDws");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 77");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "U6nNp3TpPpA");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 78");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "kJLtxEZAEMo");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 79");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "YeHful4gwMQ");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 80");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "TNpxlbTmsuU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 81");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3K4wCePbEc4");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 82");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xt-ZrR7vqP4");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 83");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tGlKZfMY0tU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 84");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ICCGbCe4D3c");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 85");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "eZqSknqTgZE");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 86");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "k_G225Hrsi4");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 87");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "p2L6THyQpSo");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 88");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "C2_BRiHa96w");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 89");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xbll2uBmFbE");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 90");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "EYLyv2752MA");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 91");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "d9ryO4UEF_I");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 92");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5spR6WhLqSA");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 93");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Yc81ffQFRqY");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 94");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5Fo4zWtyIwY");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 95");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "q2Shb5zEKl8");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 96");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "t-cZd3xM09M");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 97");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5ALmfent9yU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 98");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4EkCRmEQDjY");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 99");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "RbEMRKdWl0g");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 100");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8T9PCPQ69v8");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 101");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "g8bV1E6MHFE");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 102");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "aeMQ2J5bT3U");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 103");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "NUljN0ePYvc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 104");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "689wlv7_u1Y");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 105");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "n9_mUJOoWBk");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 106");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "UZb8LEbKRw0");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 107");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "479xFYrxvF8");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 108");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "O0D4Tvp6weo");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 109");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KvYI3U2U1Kw");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 110");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "yu7rZChCYQU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 111");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "mCvrydNJqE");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 112");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6VoM3A5VUho");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 113");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "C4AY1-q_9vk");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 114");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "oDFiI-490Hs");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 115");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Ob-ZOK7yVvs");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 116");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "VnAe91aBRLY");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 117");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "pnoMrSvTIMc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 118");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "mBqP31oKy3Y");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 119");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "fE60y6Yqof4");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 120");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6l-HPSPhQu0");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 121");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "LDlbC2hMUKU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 122");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "bP3D7uaGw9I");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 123");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "K9j-a1u6xrA");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 124");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5vGHVVz5xCQ");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 125");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jaULlI_PQkc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 126");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tZUQb7sKqEw");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 127");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ktRgsv8ZacM");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 128");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Sjst4TSH5Pc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 129");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "quBcsId5Srs");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 130");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "JuRVn3vD5XM");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 131");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_6PpjyqbXv0");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 132");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "yAdNFu_egTg");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 133");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "VC5LYrjl32U");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 134");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "0UQYXQikI88");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 135");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "RQInjsa9V9w");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 136");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8LppPj5-tmY");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 137");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "dUybwm3zH0Q");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 138");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "06EzrC7z_iU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 139");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "rNf3SQQEeho");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 140");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "C5p4tmAXbuc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 141");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_JHnO2uGbwk");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 142");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "olQF5JKzO9A");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 143");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "q1Bhf34Zdmg");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 144");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "hUv59SokUGM");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 145");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jv3iQOXkJhg");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 146");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "hxtGXt2fFc8");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 147");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "BME83IvG0JI");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 148");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "opsGJ-nzT94");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 149");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Ut2B7hZ3w_A");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 150");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "LANtwxl1mUU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 151");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "rSVAilKOcOk");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 152");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1K3eDapNH34");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 153");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9nxNmLqwhzE");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 154");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CAgX7DKoHSY");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 155");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "pRq3MxifSK0");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 156");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "aRW08OcLByI");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 157");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "gj5BOvNgiak");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 158");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "G7VriwyN9oU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 159");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Po5kwMFQZ90");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 160");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lPhsJnJpIDs");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 161");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Z_RiQSwHNbc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 162");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SyD6Yd-kUUo");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 163");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "asJfGoPN22o");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 164");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "PZaoIJEey2s");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 165");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "osgt8pOLR08");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 166");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "LRmLj99vtUk");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 167");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9jhjUoT1iyw");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 168");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CK27j0lI12Y");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 169");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ydZZaTIIrMY");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 170");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6RwXVmfQhK8");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 171");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "MHUEJjqSenw");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 172");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ooAVmiwgeqo");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 173");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "2zf_cVuBbZE");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 174");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "oQJaIaUiIws");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 175");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "OzyMMGhRBtg");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 176");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "s_gA70Wglfc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 177");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "QOD_NFpVE1k");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 178");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "IoFfIE2gTt8");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 179");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "yAUNApFXsOA");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 180");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Eipvi_yjZUQ");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 181");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "fp7GxLLzS94");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 182");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "e8sxzeX1x5A");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 183");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "XJKyQyd-z14");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 184");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "qDg7--UxjYc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 185");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "kgZUnZ6rkXI");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 186");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6cg4UVSuST0");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 187");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Z8hZoBEs6IA");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 188");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "K0GBxSwg_3I");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 189");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KU7HOO1tPY0");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 190");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "23a4iRCh3pI");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 191");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lHQTBxZV5Zo");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 192");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xIET0DcdOjw");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 193");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "fqsI-8KdTLE");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 194");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "c1AVE3l3UaE");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 195");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "BLvu1gSz1eY");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 196");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "r-qSIjZfP2k");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 197");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "QhgzGr_sFwI");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 198");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SOaztP1uMBY");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 199");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "gVJ3f9gCCCw");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 200");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "bZmZ6oUNffY");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 201");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SrSP_L9LQ_A");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 202");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5egjl3VE2lo");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 203");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SKeCO2rCDWU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 204");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "TDhHrCWqLGc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 205");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "964YfGrnYH8");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 206");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "iv6zJezi1IM");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 207");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "p-FPMxqPTI4");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 208");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "U32IRpsowd0");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 209");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "YRaOfJhyKg4");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 210");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "0M4uG5zefTc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 211");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "QHEf-G0awp4");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 212");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Ln0nB2uYxl0");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 213");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Nyirq1W_a5E");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 214");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "fdgS7vh9VIg");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 215");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "7BISb0qahAU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 216");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "qRhC4rrgKng");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 217");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "uK3P5IvYtis");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 218");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "gg3LtRHLUy8");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 219");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8new_fbXKAc");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 220");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4Pp7d-NLEEU");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 221");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "muW_g8zTdrk");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 222");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "niLui9eUelI");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 223");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "IRGfxm6Kilo");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 224");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "RmpNcqW1-ys");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 225");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9n1nqLvNVGY");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 226");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CqiX6YzJGAs");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 227");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "VCR8u2apstk");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 228");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Wxca8T8B6tY");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 229");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "IUEorwnUJaY");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 230");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CMywj3MPkHA");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 231");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "mGt-qIQg1_c");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 232");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vbPHb6kGGwg");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 233");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5In5RvQPv3A");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 234");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "26Yo89B3rQ0");
        hashMap.put("vdo_title", "Hamari Kahani | Episode 235");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);





    }

    //=======================================================
    //====================================================================
    //====================================================================

    TextView tvDate;
    LinearLayout layoutContainer;
    FloatingActionButton fabButton;
    RelativeLayout _rootLay;
    InterstitialAd mInterstitialAd;
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer myYoutubePlayer;
    MyPlaybackEventListener myPlaybackEventListener;
    LinearLayout layPlayer;
    ImageView imngClosePlayer, imgPlayPause, imgPrevious, imgNext;

    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;
    int PLAYING_NOW = 0;
    boolean playingVideo = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        tvDate = findViewById(R.id.tvDate);
        layoutContainer = findViewById(R.id.layoutContainer);
        fabButton = findViewById(R.id.fabButton);
        _rootLay = findViewById(R.id._rootLay);
        youTubePlayerView = findViewById(R.id.youTubePlayerView);
        layPlayer = findViewById(R.id.layPlayer);
        imngClosePlayer = findViewById(R.id.imngClosePlayer);
        imgPlayPause = findViewById(R.id.imgPlayPause);
        imgNext = findViewById(R.id.imgNext);
        imgPrevious = findViewById(R.id.imgPrevious);

        // Load Admob Ads
        loadFullscreenAd();


        if(isAppInstalled("com.google.android.youtube")){
            //init Youtube Player View
            youTubePlayerView.initialize("ABCD", MainActivity.this);
            myPlaybackEventListener = new MyPlaybackEventListener();

        }else{
            showYoutubeInsallDialog();
        }



        //Set Date For Cover Section
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
        formatter.setTimeZone(TimeZone.getDefault());
        Date date1 = new Date();
        String s_date = formatter.format(date1);
        tvDate.setText(s_date);


        //Calling addVideos method by which we will make a video list
        addVideos();
        makeListView();






        //Fab Button onClick
        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Check "+getString(R.string.app_name)+" app ♥ It's awesome! \n" + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });

        imngClosePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closePlayer();
                fabButton.setVisibility(View.VISIBLE);
                playingVideo = false;



            }
        });

        imgPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (v!=null && v.getTag()!=null){
                    String tag = v.getTag().toString();
                    if (tag.contains("PLAYING")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.pause();
                        else Toast.makeText(MainActivity.this, "Please wait...", Toast.LENGTH_LONG).show();

                    }else if (tag.contains("PAUSED")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.play();
                        else Toast.makeText(MainActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
                    }
                }


            }
        });

        imgNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playNextVideo();
            }
        });

        imgPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playPreviousVideo();
            }
        });





    } // End of onCreate Bundle





    private void makeListView(){

        ListView listView = new ListView( MainActivity.this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(150, 10);
        layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
        listView.setBackgroundColor(Color.WHITE);
        listView.setLayoutParams(layoutParams);

        //Adding ListView into our view
        layoutContainer.addView(listView);
        //------------
        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);
        //-----------


        try{
            setListViewHeightBasedOnChildren(listView);
        } catch(Exception e ){
            e.printStackTrace();
        }

        layoutContainer.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in));

    }

    ///==============================================




    //==============================================
    private void showInterstitial() {
        // Show the ad if it's ready.
        if (mInterstitialAd != null ) {
            mInterstitialAd.show(this);
        }
    }
    //============================================


    // loadFullscreenAd method starts here.....
    private void loadFullscreenAd(){

        //Requesting for a fullscreen Ad
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,getString(R.string.admob_INTERSTITIAL_UNIT_ID), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

                //Fullscreen callback || Requesting again when an ad is shown already
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        //User dismissed the previous ad. So we are requesting a new ad here
                        loadFullscreenAd();

                        if (playingVideo==true && myYoutubePlayer!=null && !myYoutubePlayer.isPlaying() ){

                            Handler handler = new Handler(Looper.getMainLooper());

                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {

                                    myYoutubePlayer.play();
                                    playingVideo = false;

                                }
                            }, 500);

                        }


                    }





                }); // FullScreen Callback Ends here


            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }





        });

    }

    // loadFullscreenAd method ENDS  here..... >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    ///==============================================
    ///==============================================


    ///==============================================
    ///==============================================










    ///==============================================
    ///==============================================


    private class MyAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        public MyAdapter(){
            this.inflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.video_item, parent, false);

            TextView tvTitle = convertView.findViewById(R.id.tvTitle);
            TextView tvDescription = convertView.findViewById(R.id.tvDescription);
            ImageView imgThumb = convertView.findViewById(R.id.imgThumb);
            RelativeLayout layItem = convertView.findViewById(R.id.layItem);

            HashMap<String, String> hashMap = arrayList.get(position);
            String vdo_id = hashMap.get("vdo_id");
            String vdo_title = hashMap.get("vdo_title");
            String vdo_desciption = hashMap.get("vdo_desciption");

            tvTitle.setText(vdo_title);
            tvDescription.setText(vdo_desciption);

            // Youtube thumnail link is like
            //https://i.ytimg.com/vi/<VIDEO ID>/0.jpg
            String thumb_link = "https://i.ytimg.com/vi/"+vdo_id+"/0.jpg";
            Picasso.get().
                    load(""+thumb_link)
                    .placeholder(R.mipmap.ic_launcher)
                    .into(imgThumb);

            layItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fabButton.setVisibility(View.GONE);

                    //Play Video
                    PLAYING_NOW = position;
                    playVideo(vdo_id);
                    showInterstitial();


                    //Use this code to show ad randomly
                    Random random  = new Random();
                    int myCount = random.nextInt(100-5)+5;
                    if (myCount%2==0){
                        //Show Fullscreen ad
                        showInterstitial();
                    }






                }
            });




            return convertView;
        }
    }



    //================================================
    private void playVideo(String video_id){

        if(myYoutubePlayer!=null){
            layPlayer.setVisibility(View.VISIBLE);
            layPlayer.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in));
            myYoutubePlayer.loadVideo(video_id);
            myYoutubePlayer.play();
            playingVideo = true;
        }else{
            Toast.makeText(MainActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
        }
    }
    //================================================
    private void closePlayer(){
        if(myYoutubePlayer!=null && myYoutubePlayer.isPlaying()) myYoutubePlayer.pause();
        layPlayer.setVisibility(View.GONE);
        layPlayer.clearAnimation();
    }







    //==============================================
    private final class MyPlaybackEventListener implements YouTubePlayer.PlaybackEventListener {
        public void onBuffering(boolean arg0) {
            //updateLog("onBuffering(): " + String.valueOf(arg0));
            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.buffer);
                imgPlayPause.setTag("BUFFERING");
            }
        }

        public void onPaused() {
            //updateLog("onPaused()");

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_play);
                imgPlayPause.setTag("PAUSED");
            }

            //Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_SHORT).show();
        }

        public void onPlaying() {
            //updateLog("onPlaying()");
            // Toast.makeText(getApplicationContext(), "Paying", Toast.LENGTH_SHORT).show();

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_pause);
                imgPlayPause.setTag("PLAYING");
            }

        }

        public void onSeekTo(int arg0) {
            //updateLog("onSeekTo(): " + String.valueOf(arg0));
        }

        public void onStopped() {

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_play);
            }

        }

    }

    //*******************************************************************



    //=================================================================




    private final class MyPlayerStateChangeListener implements YouTubePlayer.PlayerStateChangeListener {

        public void onAdStarted() {
            //updateLog("onAdStarted()");
        }

        public void onError(
                com.google.android.youtube.player.YouTubePlayer.ErrorReason arg0) {
            //updateLog("onError(): " + arg0.toString());
            Toast.makeText(getApplicationContext(), ""+arg0.toString(), Toast.LENGTH_SHORT).show();
            //Log.d("loveRana", ""+arg0.ordinal());

            /*
            if (arg0.toString().contains("NOT_PLAYABLE") && YOUTUBE_PLAYER ){
                webViewPlayer();
            }
            else if (arg0.toString().contains("INTERNAL_ERROR") && YOUTUBE_PLAYER ){
                webViewPlayer();
            }

             */



        }

        public void onLoaded(String arg0) {
            //updateLog("onLoaded(): " + arg0);
        }

        public void onLoading() {
            //updateLog("onLoading()");
        }

        public void onVideoEnded() {
            // Toast.makeText(getApplicationContext(), "ended", Toast.LENGTH_LONG).show();
            playNextVideo();


        }


        public void onVideoStarted() {
            //updateLog("onVideoStarted()");
        }

    }
    //==============================================================



//=================================================
    private void playNextVideo(){
        if(PLAYING_NOW >= (arrayList.size()-1))
            PLAYING_NOW = 0;
        else PLAYING_NOW++;

        HashMap<String, String> hashMap = arrayList.get(PLAYING_NOW);
        String vdo_id = hashMap.get("vdo_id");
        playVideo(vdo_id);
    }


    private void playPreviousVideo(){
        if(PLAYING_NOW > 0){
            PLAYING_NOW--;
            HashMap<String, String> hashMap = arrayList.get(PLAYING_NOW);
            String vdo_id = hashMap.get("vdo_id");
            playVideo(vdo_id);
        }else{
            Toast.makeText(MainActivity.this, "Playing the first video", Toast.LENGTH_LONG).show();
        }

    }






    ///==============================================
    ///==============================================
    //===================================================

    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(),
                View.MeasureSpec.AT_MOST);
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

    //==========================================================================
//==========================================================================





    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        myYoutubePlayer = youTubePlayer;
        myYoutubePlayer.setPlaybackEventListener(myPlaybackEventListener);

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        myYoutubePlayer = null;
    }




    ///====================================================
    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired
    private long mBackPressed;

    // When user click bakpress button this method is called
    @Override
    public void onBackPressed() {
        // When user press back button

        if (layPlayer.getVisibility()==View.GONE) {

            if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            } else {

                Toast.makeText(getBaseContext(), "Press again to exit",
                        Toast.LENGTH_SHORT).show();
            }

            mBackPressed = System.currentTimeMillis();

        } else{
            closePlayer();
        }


    } // end of onBackpressed method

    //#############################################################################################

    protected boolean isAppInstalled(String packageName) {
        Intent mIntent = getPackageManager().getLaunchIntentForPackage(packageName);
        if (mIntent != null) {
            return true;
        }
        else {
            return false;
        }
    }

    //=======================================================
    //method to show a dialog in android
    private void showYoutubeInsallDialog(){
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Install Youtube App");
        alertDialog.setMessage(getString(R.string.app_name)+" will not work if you don't have youtube official app installed on your device");
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Install NOW",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dialog.dismiss();
                        openStoreIntent("com.google.android.youtube");
                    }
                });

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Exit App",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //Exit App
                        if(Build.VERSION.SDK_INT>=16 && Build.VERSION.SDK_INT<21){
                            finishAffinity();
                        } else if(Build.VERSION.SDK_INT>=21){
                            finishAndRemoveTask();
                        }

                    }
                });

        alertDialog.setCancelable(false);
        alertDialog.show();
    }

    //===============================================================



    //=================================================
    ///==============================================
    ///==============================================
    ///==============================================
    //try to download youtube app from app stores
    private void openStoreIntent(String app_package){
        String url="";
        Intent storeintent=null;
        try {
            url = "market://details?id="+app_package;
            storeintent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            storeintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
            startActivity(storeintent);
        } catch ( final Exception e ) {
            url = "https://play.google.com/store/apps/details?id="+app_package;
            storeintent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            storeintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
            startActivity(storeintent);
        }

    }
    ///==============================================
    ///==============================================
    ///==============================================
    ///==============================================








}