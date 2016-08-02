package com.eightstudio.danboru.cinema123;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TabHost;


public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        Resources ressources = getResources();
        TabHost tabHost = getTabHost();

        //untuk topMovie
        Intent intentAndroid = new Intent().setClass(this, TopMovie.class);
        TabHost.TabSpec tabSpecAndroid = tabHost
                .newTabSpec("Top Movie")
                .setIndicator("", ressources.getDrawable(R.drawable.icon_set_1))
                .setContent(intentAndroid);


        //menambah Movie
        Intent intentApple = new Intent().setClass(this, NewProductActivity.class);
        TabHost.TabSpec tabSpecApple = tabHost
                .newTabSpec("Add Movie")
                .setIndicator("", ressources.getDrawable(R.drawable.icon_set_2))
                .setContent(intentApple);


        //all Movie
        Intent intentWindows = new Intent().setClass(this, AllProductsActivity.class);
        TabHost.TabSpec tabSpecWindows = tabHost
                .newTabSpec("Windows")
                .setIndicator("", ressources.getDrawable(R.drawable.icon_set_3))
                .setContent(intentWindows);


        //update dan delete movie
        Intent intentBerry = new Intent().setClass(this, EditProductActivity.class);
        TabHost.TabSpec tabSpecBerry = tabHost
                .newTabSpec("Berry")
                .setIndicator("", ressources.getDrawable(R.drawable.icon_set_4))
                .setContent(intentBerry);

        // menambahkan semua tab
        tabHost.addTab(tabSpecAndroid);
        tabHost.addTab(tabSpecApple);
        tabHost.addTab(tabSpecWindows);
        tabHost.addTab(tabSpecBerry);

        //set Windows tab sebagai default (di mulai dari 0)
        tabHost.setCurrentTab(0);
    }

}
