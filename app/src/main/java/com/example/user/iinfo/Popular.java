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

public class Popular extends AppCompatActivity
{
    private ScrollView popularScrollView;
    private LinearLayout popularWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);


        popularScrollView=findViewById(R.id.popularScrollView);
        popularWebsite=findViewById(R.id.popularWebsite);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Animation popularScrollAnimation= AnimationUtils.loadAnimation(Popular.this, R.anim.my_transition_2);
        popularScrollView.setAnimation(popularScrollAnimation);




        popularWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent popularwebsiteIntent=new Intent(Popular.this, Popular_Webview.class);
                startActivity(popularwebsiteIntent);

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