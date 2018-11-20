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

public class IbnSina extends AppCompatActivity
{
    private ScrollView ibnsinaScrollView;
    private LinearLayout ibnsinaWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibn_sina);

        ibnsinaScrollView=findViewById(R.id.ibnsinaScrollView);
        ibnsinaWebsite=findViewById(R.id.ibnsinaWebsite);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Animation ibnsinaScrollAnimation= AnimationUtils.loadAnimation(IbnSina.this, R.anim.my_transition_2);
        ibnsinaScrollView.setAnimation(ibnsinaScrollAnimation);




        ibnsinaWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ibnsinawebsiteIntent=new Intent(IbnSina.this, IbnSina_Webview.class);
                startActivity(ibnsinawebsiteIntent);

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