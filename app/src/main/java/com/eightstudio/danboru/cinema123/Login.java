package com.eightstudio.danboru.cinema123;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

public class Login extends Activity {

    Button login;
    LinearLayout awal,akhir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.loginButton);
        awal = (LinearLayout) findViewById(R.id.awal);
        akhir  = (LinearLayout) findViewById(R.id.akhir);

        ValueAnimator animasi = ValueAnimator.ofFloat(0f, 1f);

        animasi.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {

                akhir.setAlpha((Float) animation.getAnimatedValue());

            }
        });

        animasi.setDuration(9000);
        animasi.setRepeatMode(ValueAnimator.REVERSE);
        animasi.setRepeatCount(-1);
        animasi.start();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);

            }
        });


    }
}
