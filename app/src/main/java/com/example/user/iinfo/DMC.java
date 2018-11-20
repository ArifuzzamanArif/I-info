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

public class DMC extends AppCompatActivity
{
    private ScrollView dmcScrollView;
    private TextView dmc_moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dmc);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dmcScrollView=findViewById(R.id.dmcScrollView);
        dmc_moreInfo=findViewById(R.id.dmc_moreInfo);


        Animation dmcScrollAnimation= AnimationUtils.loadAnimation(DMC.this, R.anim.my_transition_2);
        dmcScrollView.setAnimation(dmcScrollAnimation);




        dmc_moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dmcmoreinfoIntent=new Intent(DMC.this, DMC_Webview.class);
                startActivity(dmcmoreinfoIntent);

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
