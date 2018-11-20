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

public class IUB extends AppCompatActivity
{
    private ScrollView iubScrollView;
    private TextView iub_moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iub);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        iubScrollView=findViewById(R.id.iubScrollView);
        iub_moreInfo=findViewById(R.id.iub_moreInfo);


        Animation iubScrollAnimation= AnimationUtils.loadAnimation(IUB.this, R.anim.my_transition_2);
        iubScrollView.setAnimation(iubScrollAnimation);




        iub_moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iubmoreinfoIntent=new Intent(IUB.this, IUB_Webview.class);
                startActivity(iubmoreinfoIntent);

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