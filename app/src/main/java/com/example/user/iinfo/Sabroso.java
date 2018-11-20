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

public class Sabroso extends AppCompatActivity
{
    private ScrollView sabrosoScrollView;
    private LinearLayout sabrosowebsite,sabrosofacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabroso);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sabrosoScrollView=findViewById(R.id.sabrosoScrollView);
        sabrosowebsite=findViewById(R.id.sabrosowebsite);
        sabrosofacebook=findViewById(R.id.sabrosofacebook);


        Animation sabrosoScrollAnimation= AnimationUtils.loadAnimation(Sabroso.this, R.anim.my_transition_2);
        sabrosoScrollView.setAnimation(sabrosoScrollAnimation);




        sabrosofacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sabrosofacebookIntent=new Intent(Sabroso.this, Sabroso_Webview.class);
                startActivity(sabrosofacebookIntent);

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