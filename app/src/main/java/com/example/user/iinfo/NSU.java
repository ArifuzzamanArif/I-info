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

public class NSU extends AppCompatActivity
{
    private ScrollView nsuScrollView;
    private TextView nsu_moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nsu);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nsuScrollView=findViewById(R.id.nsuScrollView);
        nsu_moreInfo=findViewById(R.id.nsu_moreInfo);


        Animation nsuScrollAnimation= AnimationUtils.loadAnimation(NSU.this, R.anim.my_transition_2);
        nsuScrollView.setAnimation(nsuScrollAnimation);




        nsu_moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nsumoreinfoIntent=new Intent(NSU.this, NSU_Webview.class);
                startActivity(nsumoreinfoIntent);

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