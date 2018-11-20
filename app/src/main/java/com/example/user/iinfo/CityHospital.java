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

public class CityHospital extends AppCompatActivity
{
    private ScrollView cityScrollView;
    private LinearLayout cityWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_hospital);



        cityScrollView=findViewById(R.id.cityScrollView);
        cityWebsite=findViewById(R.id.cityWebsite);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Animation cityScrollAnimation= AnimationUtils.loadAnimation(CityHospital.this, R.anim.my_transition_2);
        cityScrollView.setAnimation(cityScrollAnimation);




        cityWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent citywebsiteIntent=new Intent(CityHospital.this, CityHospital_Webview.class);
                startActivity(citywebsiteIntent);

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