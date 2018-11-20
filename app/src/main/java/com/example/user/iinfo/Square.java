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
import android.widget.TextView;

public class Square extends AppCompatActivity
{
    private ScrollView squareScrollView;
    private LinearLayout squareWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);


        squareScrollView=findViewById(R.id.squareScrollView);
        squareWebsite=findViewById(R.id.squareWebsite);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Animation squareScrollAnimation= AnimationUtils.loadAnimation(Square.this, R.anim.my_transition_2);
        squareScrollView.setAnimation(squareScrollAnimation);




        squareWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent squarewebsiteIntent=new Intent(Square.this, Square_Webview.class);
                startActivity(squarewebsiteIntent);

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