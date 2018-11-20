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

public class Bar_B_Q extends AppCompatActivity
{
    private ScrollView barbqScrollView;
    private LinearLayout barbqwebsite,barbqfacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar__b__q);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        barbqScrollView=findViewById(R.id.barbqScrollView);
        barbqwebsite=findViewById(R.id.barbqwebsite);
        barbqfacebook=findViewById(R.id.barbqfacebook);


        Animation barbqScrollAnimation= AnimationUtils.loadAnimation(Bar_B_Q.this, R.anim.my_transition_2);
        barbqScrollView.setAnimation(barbqScrollAnimation);




        barbqfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent barbqfacebookIntent=new Intent(Bar_B_Q.this, Bar_B_Q_Webview.class);
                startActivity(barbqfacebookIntent);

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