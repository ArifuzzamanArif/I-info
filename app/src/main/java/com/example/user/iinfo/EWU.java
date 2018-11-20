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

public class EWU extends AppCompatActivity
{
    private ScrollView ewuScrollView;
    private TextView ewu_moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ewu);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ewuScrollView=findViewById(R.id.ewuScrollView);
        ewu_moreInfo=findViewById(R.id.ewu_moreInfo);


        Animation ewuScrollAnimation= AnimationUtils.loadAnimation(EWU.this, R.anim.my_transition_2);
        ewuScrollView.setAnimation(ewuScrollAnimation);




        ewu_moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ewumoreinfoIntent=new Intent(EWU.this, EWU_Webview.class);
                startActivity(ewumoreinfoIntent);

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