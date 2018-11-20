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

public class Hospital_List extends AppCompatActivity
{
    private ScrollView hospitalScrollView;
    private LinearLayout squareView, ibnSinaView,cityView,labaidView,appolloView,popularView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital__list);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        hospitalScrollView=findViewById(R.id.hospitalScrollView);

        squareView=findViewById(R.id.squareView);
        ibnSinaView=findViewById(R.id.ibnSinaView);
        cityView=findViewById(R.id.cityView);
        labaidView=findViewById(R.id.labaidView);
        appolloView=findViewById(R.id.appolloView);
        popularView=findViewById(R.id.popularView);



        Animation universityListAnimation1= AnimationUtils.loadAnimation(Hospital_List.this, R.anim.my_transition_4);
        Animation universityListAnimation2= AnimationUtils.loadAnimation(Hospital_List.this, R.anim.my_transition_5);

        squareView.setAnimation(universityListAnimation1);
        ibnSinaView.setAnimation(universityListAnimation2);
        cityView.setAnimation(universityListAnimation1);
        labaidView.setAnimation(universityListAnimation2);
        appolloView.setAnimation(universityListAnimation1);
        popularView.setAnimation(universityListAnimation2);



        squareView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent squareviewIntent=new Intent(Hospital_List.this, Square.class);
                startActivity(squareviewIntent);

            }
        });

        ibnSinaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ibnsinaviewIntent=new Intent(Hospital_List.this, IbnSina.class);
                startActivity(ibnsinaviewIntent);

            }
        });

        cityView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cityviewIntent=new Intent(Hospital_List.this, CityHospital.class);
                startActivity(cityviewIntent);

            }
        });

        labaidView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent labaidviewIntent=new Intent(Hospital_List.this, LabAid.class);
                startActivity(labaidviewIntent);

            }
        });

        appolloView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent appolloviewIntent=new Intent(Hospital_List.this, Appollo.class);
                startActivity(appolloviewIntent);

            }
        });

        popularView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent popularviewIntent=new Intent(Hospital_List.this, Popular.class);
                startActivity(popularviewIntent);

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