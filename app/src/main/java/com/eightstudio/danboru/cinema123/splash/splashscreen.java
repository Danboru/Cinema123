package com.eightstudio.danboru.cinema123.splash;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.eightstudio.danboru.cinema123.Login;
import com.eightstudio.danboru.cinema123.MainActivity;
import com.eightstudio.danboru.cinema123.R;

public class splashscreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splashscreen);

       final Thread thread = new Thread(){

           @Override
           public void run(){

               try{

                   sleep(3000);
                   Intent jeda = new Intent(getBaseContext(), Login.class);
                   startActivity(jeda);
                   finish();

               }catch (Exception e){

                   e.printStackTrace();
               }
           }
       };

        thread.start();

    }
}
