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

public class Nandos extends AppCompatActivity
{
    private ScrollView nandosScrollView;
    private LinearLayout nandoswebsite,nandosfacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nandos);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nandosScrollView=findViewById(R.id.nandosScrollView);
        nandoswebsite=findViewById(R.id.nandoswebsite);
        nandosfacebook=findViewById(R.id.nandosfacebook);


        Animation nandosScrollAnimation= AnimationUtils.loadAnimation(Nandos.this, R.anim.my_transition_2);
        nandosScrollView.setAnimation(nandosScrollAnimation);




        nandoswebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nandoswebsiteIntent=new Intent(Nandos.this, Nandos_Websiteview.class);
                startActivity(nandoswebsiteIntent);

            }
        });

        nandosfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nandosfacebookIntent=new Intent(Nandos.this, Nandos_Facebookview.class);
                startActivity(nandosfacebookIntent);

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