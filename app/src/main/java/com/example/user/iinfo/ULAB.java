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

public class ULAB extends AppCompatActivity
{
    private ScrollView ulabScrollView;
    private TextView ulab_moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulab);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ulabScrollView=findViewById(R.id.ulabScrollView);
        ulab_moreInfo=findViewById(R.id.ulab_moreInfo);


        Animation ulabScrollAnimation= AnimationUtils.loadAnimation(ULAB.this, R.anim.my_transition_2);
        ulabScrollView.setAnimation(ulabScrollAnimation);




        ulab_moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ulabmoreinfoIntent=new Intent(ULAB.this, ULAB_Webview.class);
                startActivity(ulabmoreinfoIntent);

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