package com.example.user.iinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;
import android.widget.TextView;

public class Dhaka_University extends AppCompatActivity
{
    private ScrollView duScrollView;
    private TextView du_moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__university);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        duScrollView=findViewById(R.id.duScrollView);
        du_moreInfo=findViewById(R.id.du_moreInfo);


        Animation duScrollAnimation= AnimationUtils.loadAnimation(Dhaka_University.this, R.anim.my_transition_2);
        duScrollView.setAnimation(duScrollAnimation);




        du_moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dumoreinfoIntent=new Intent(Dhaka_University.this, Dhaka_University_Webview.class);
                startActivity(dumoreinfoIntent);

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
