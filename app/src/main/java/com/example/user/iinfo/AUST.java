package com.example.user.iinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;
import android.widget.TextView;

public class AUST extends AppCompatActivity
{
    private ScrollView austScrollView;
    private TextView aust_moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aust);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        austScrollView=findViewById(R.id.austScrollView);
        aust_moreInfo=findViewById(R.id.aust_moreInfo);


        Animation austScrollAnimation= AnimationUtils.loadAnimation(AUST.this, R.anim.my_transition_2);
        austScrollView.setAnimation(austScrollAnimation);




        aust_moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent austmoreinfoIntent=new Intent(AUST.this, AUST_Webview.class);
                startActivity(austmoreinfoIntent);

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