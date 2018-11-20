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

public class LabAid extends AppCompatActivity
{
    private ScrollView labaidScrollView;
    private LinearLayout labaidWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_aid);

        labaidScrollView=findViewById(R.id.labaidScrollView);
        labaidWebsite=findViewById(R.id.labaidWebsite);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Animation labaidScrollAnimation= AnimationUtils.loadAnimation(LabAid.this, R.anim.my_transition_2);
        labaidScrollView.setAnimation(labaidScrollAnimation);




        labaidWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent labaidwebsiteIntent=new Intent(LabAid.this, LabAid_Webview.class);
                startActivity(labaidwebsiteIntent);

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