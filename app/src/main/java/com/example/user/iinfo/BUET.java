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

public class BUET extends AppCompatActivity
{
    private ScrollView buetScrollView;
    private TextView buet_moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buet);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buetScrollView=findViewById(R.id.buetScrollView);
        buet_moreInfo=findViewById(R.id.buet_moreInfo);


        Animation buetScrollAnimation= AnimationUtils.loadAnimation(BUET.this, R.anim.my_transition_2);
        buetScrollView.setAnimation(buetScrollAnimation);




        buet_moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent buetmoreinfoIntent=new Intent(BUET.this, BUET_Webview.class);
                startActivity(buetmoreinfoIntent);

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