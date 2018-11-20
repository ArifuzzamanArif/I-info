package com.example.user.iinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class Splash_Screen extends AppCompatActivity
{
    private ImageView splashImageView;
    private TextView splashTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        splashImageView= findViewById(R.id.splashImageView);
        splashTextView= findViewById(R.id.splashTextView);

       //Animation for image
        Animation splashanimation1= AnimationUtils.loadAnimation(Splash_Screen.this, R.anim.my_transition);
        splashImageView.setAnimation(splashanimation1);

        //Animation for Text
        Animation splashanimation2= AnimationUtils.loadAnimation(Splash_Screen.this, R.anim.my_transition_2);
        splashTextView.setAnimation(splashanimation2);



        final Intent splashintent= new Intent(Splash_Screen.this, MainActivity.class);

        Thread mythread= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(splashintent);
                    finish();
                }
            }
        });

                mythread.start();
    }
}
