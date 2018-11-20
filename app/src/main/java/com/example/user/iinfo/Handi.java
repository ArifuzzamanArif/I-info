package com.example.user.iinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Handi extends AppCompatActivity
{
    private ScrollView handiScrollView;
    private LinearLayout handiwebsite,handifacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handi);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        handiScrollView=findViewById(R.id.handiScrollView);
        handiwebsite=findViewById(R.id.handiwebsite);
        handifacebook=findViewById(R.id.handifacebook);


        Animation handiScrollAnimation= AnimationUtils.loadAnimation(Handi.this, R.anim.my_transition_2);
        handiScrollView.setAnimation(handiScrollAnimation);




        handifacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent handifacebookIntent=new Intent(Handi.this, Handi_Webview.class);
                startActivity(handifacebookIntent);

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}