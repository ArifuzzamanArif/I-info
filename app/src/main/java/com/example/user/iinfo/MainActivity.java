package com.example.user.iinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    private CardView universityCardView, hospitalCardView, restaurantCardView,travelsCardView, bankingCardView;
    private ImageView universityImageView,hospitalImageView,restaurantImageView, travelsImageView, bankingImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        universityCardView=findViewById(R.id.universityCardView);
        hospitalCardView= findViewById(R.id.hospitalCardView);
        restaurantCardView= findViewById(R.id.restaurantCardView);
        travelsCardView= findViewById(R.id.travelsCardView);
        bankingCardView= findViewById(R.id.bankingCardView);

        //From top to bottom//
        Animation homepageAnimation1= AnimationUtils.loadAnimation(MainActivity.this, R.anim.my_transition_3);

        //Bottom to top//
        Animation homepageAnimation2= AnimationUtils.loadAnimation(MainActivity.this, R.anim.my_transition_2);

        //From left to right//
        Animation homepageAnimation3= AnimationUtils.loadAnimation(MainActivity.this, R.anim.my_transition_4);

        //From right to left//
        Animation homepageAnimation4= AnimationUtils.loadAnimation(MainActivity.this, R.anim.my_transition_5);

        universityCardView.setAnimation(homepageAnimation1);
        hospitalCardView.setAnimation(homepageAnimation1);

        restaurantCardView.setAnimation(homepageAnimation3);
        travelsCardView.setAnimation(homepageAnimation4);

        bankingCardView.setAnimation(homepageAnimation2);


        //Set OnClick Listener//

        universityCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent universityIntent= new Intent(MainActivity.this, University_List.class);

                startActivity(universityIntent);
            }
        });

        hospitalCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hospitalIntent= new Intent(MainActivity.this, Hospital_List.class);

                startActivity(hospitalIntent);
            }
        });

        restaurantCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantIntent= new Intent(MainActivity.this, Restaurant_List.class);

                startActivity(restaurantIntent);
            }
        });

        travelsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent travelsIntent= new Intent(MainActivity.this, Travels_List.class);

                startActivity(travelsIntent);
            }
        });

        bankingCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent banksIntent= new Intent(MainActivity.this, Banks_List.class);

                startActivity(banksIntent);
            }
        });
    }
}
