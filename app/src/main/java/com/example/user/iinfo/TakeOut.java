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

public class TakeOut extends AppCompatActivity
{
    private ScrollView takeoutScrollView;
    private LinearLayout takeoutwebsite,takeoutfacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_out);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        takeoutScrollView=findViewById(R.id.takeoutScrollView);
        takeoutwebsite=findViewById(R.id.takeoutwebsite);
        takeoutfacebook=findViewById(R.id.takeoutfacebook);


        Animation takeoutScrollAnimation= AnimationUtils.loadAnimation(TakeOut.this, R.anim.my_transition_2);
        takeoutScrollView.setAnimation(takeoutScrollAnimation);




        takeoutfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent takeoutfacebookIntent=new Intent(TakeOut.this, TakeOut_Webview.class);
                startActivity(takeoutfacebookIntent);

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