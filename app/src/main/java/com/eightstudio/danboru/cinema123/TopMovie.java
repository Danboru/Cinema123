package com.eightstudio.danboru.cinema123;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

public class TopMovie extends Activity {

    ListView lv;
    int[] cover_film_resource = {

            R.drawable.alien,
            R.drawable.batman,
            R.drawable.castle,
            R.drawable.deadpool,
            R.drawable.gardian,
            R.drawable.ghandi,
            R.drawable.grave,
            R.drawable.hachi,
            R.drawable.annable,
            R.drawable.badmom,
            R.drawable.beyond,
            R.drawable.conjuring,
            R.drawable.dory,
            R.drawable.ghost,
            R.drawable.iceage,
            R.drawable.jason,
            R.drawable.koala,
            R.drawable.lightout,
            R.drawable.nerve,
            R.drawable.pets,
            R.drawable.suicide,
            R.drawable.tarzan,
            R.drawable.ant,
            R.drawable.avengers,
            R.drawable.sponge
    };


    String[] judul_file_resource;
    String[] rating_film_resource;

    MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_top_movie);


        judul_file_resource = getResources().getStringArray(R.array.nama_file);
        rating_film_resource = getResources().getStringArray(R.array.rating_filem);


        lv = (ListView) findViewById(R.id.listnya_guys);
        adapter = new MovieAdapter(getApplicationContext(), R.layout.edited_list);

        lv.setAdapter(adapter);

        int i = 0;
        for(String title : judul_file_resource) {

            MovieDataProvider provider = new MovieDataProvider(cover_film_resource[i], title , rating_film_resource[i]);
            adapter.add(provider);

            i++;

        }

    }

    }
