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

public class Daffodil extends AppCompatActivity
{
    private ScrollView daffodilScrollView;
    private TextView daffodil_moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daffodil);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        daffodilScrollView=findViewById(R.id.daffodilScrollView);
        daffodil_moreInfo=findViewById(R.id.daffodil_moreInfo);


        Animation daffodilScrollAnimation= AnimationUtils.loadAnimation(Daffodil.this, R.anim.my_transition_2);
        daffodilScrollView.setAnimation(daffodilScrollAnimation);




        daffodil_moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent daffodilmoreinfoIntent=new Intent(Daffodil.this, Daffodil_Webview.class);
                startActivity(daffodilmoreinfoIntent);

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