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

public class Restaurant_List extends AppCompatActivity
{
    private ScrollView resraurantScrollView;
    private LinearLayout barbqView, sabrosoView,nandosView,takeoutView,handiView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant__list);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        resraurantScrollView=findViewById(R.id.resraurantScrollView);

        barbqView=findViewById(R.id.barbqView);
        sabrosoView=findViewById(R.id.sabrosoView);
        nandosView=findViewById(R.id.nandosView);
        takeoutView=findViewById(R.id.takeoutView);
        handiView=findViewById(R.id.handiView);



        Animation restaurantListAnimation1= AnimationUtils.loadAnimation(Restaurant_List.this, R.anim.my_transition_4);
        Animation restaurantListAnimation2= AnimationUtils.loadAnimation(Restaurant_List.this, R.anim.my_transition_5);

        barbqView.setAnimation(restaurantListAnimation1);
        sabrosoView.setAnimation(restaurantListAnimation2);
        nandosView.setAnimation(restaurantListAnimation1);
        takeoutView.setAnimation(restaurantListAnimation2);
        handiView.setAnimation(restaurantListAnimation1);



        barbqView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent barbqviewIntent=new Intent(Restaurant_List.this, Bar_B_Q.class);
                startActivity(barbqviewIntent);

            }
        });

        sabrosoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sabrosoviewIntent=new Intent(Restaurant_List.this, Sabroso.class);
                startActivity(sabrosoviewIntent);

            }
        });

        nandosView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nandosviewIntent=new Intent(Restaurant_List.this, Nandos.class);
                startActivity(nandosviewIntent);

            }
        });

        takeoutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent takeoutviewIntent=new Intent(Restaurant_List.this, TakeOut.class);
                startActivity(takeoutviewIntent);

            }
        });

        handiView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent handiviewIntent=new Intent(Restaurant_List.this, Handi.class);
                startActivity(handiviewIntent);

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