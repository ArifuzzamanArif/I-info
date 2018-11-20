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

public class UAP extends AppCompatActivity
{
    private ScrollView uapScrollView;
    private TextView uap_moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uap);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        uapScrollView=findViewById(R.id.uapScrollView);
        uap_moreInfo=findViewById(R.id.uap_moreInfo);


        Animation uapScrollAnimation= AnimationUtils.loadAnimation(UAP.this, R.anim.my_transition_2);
        uapScrollView.setAnimation(uapScrollAnimation);




        uap_moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent uapmoreinfoIntent=new Intent(UAP.this, UAP_Webview.class);
                startActivity(uapmoreinfoIntent);

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