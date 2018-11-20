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

public class BRACK extends AppCompatActivity
{
    private ScrollView brackScrollView;
    private TextView brack_moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brack);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        brackScrollView=findViewById(R.id.brackScrollView);
        brack_moreInfo=findViewById(R.id.brack_moreInfo);


        Animation bracScrollAnimation= AnimationUtils.loadAnimation(BRACK.this, R.anim.my_transition_2);
        brackScrollView.setAnimation(bracScrollAnimation);




        brack_moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent barckmoreinfoIntent=new Intent(BRACK.this, BRACK_Webview.class);
                startActivity(barckmoreinfoIntent);

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