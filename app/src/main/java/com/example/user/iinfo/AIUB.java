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

public class AIUB extends AppCompatActivity
{
    private ScrollView aiubScrollView;
    private TextView aiub_moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiub);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        aiubScrollView=findViewById(R.id.aiubScrollView);
        aiub_moreInfo=findViewById(R.id.aiub_moreInfo);


        Animation aiubScrollAnimation= AnimationUtils.loadAnimation(AIUB.this, R.anim.my_transition_2);
        aiubScrollView.setAnimation(aiubScrollAnimation);




        aiub_moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent aiubmoreinfoIntent=new Intent(AIUB.this, AIUB_Webview.class);
                startActivity(aiubmoreinfoIntent);

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