package com.example.user.iinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Appollo extends AppCompatActivity
{
    private ScrollView appolloScrollView;
    private LinearLayout appolloWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appollo);

        appolloScrollView=findViewById(R.id.appolloScrollView);
        appolloWebsite=findViewById(R.id.appolloWebsite);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Animation appolloScrollAnimation= AnimationUtils.loadAnimation(Appollo.this, R.anim.my_transition_2);
        appolloScrollView.setAnimation(appolloScrollAnimation);




        appolloWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent appollowebsiteIntent=new Intent(Appollo.this, Appollo_Webview.class);
                startActivity(appollowebsiteIntent);

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