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

public class University_List extends AppCompatActivity
{
    private ScrollView universityScrollView;
    private LinearLayout duView, dmcView,buetView,nsuView,aiubView,austView,ewuView, brackView,
            uapView, daffodilView, iubView, ulabView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university__list);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        universityScrollView=findViewById(R.id.universityScrollView);

        duView=findViewById(R.id.duView);
        dmcView=findViewById(R.id.dmcView);
        buetView=findViewById(R.id.buetView);
        nsuView=findViewById(R.id.nsuView);
        aiubView=findViewById(R.id.aiubView);
        austView=findViewById(R.id.austView);
        ewuView=findViewById(R.id.ewuView);
        brackView=findViewById(R.id.brackView);
        uapView=findViewById(R.id.uapView);
        daffodilView=findViewById(R.id.daffodilView);
        iubView=findViewById(R.id.iubView);
        ulabView=findViewById(R.id.ulabView);



        Animation universityListAnimation1= AnimationUtils.loadAnimation(University_List.this, R.anim.my_transition_4);
        Animation universityListAnimation2= AnimationUtils.loadAnimation(University_List.this, R.anim.my_transition_5);

        duView.setAnimation(universityListAnimation1);
        dmcView.setAnimation(universityListAnimation2);
        buetView.setAnimation(universityListAnimation1);
        nsuView.setAnimation(universityListAnimation2);
        aiubView.setAnimation(universityListAnimation1);
        austView.setAnimation(universityListAnimation2);
        ewuView.setAnimation(universityListAnimation1);
        brackView.setAnimation(universityListAnimation2);
        uapView.setAnimation(universityListAnimation1);
        daffodilView.setAnimation(universityListAnimation2);
        iubView.setAnimation(universityListAnimation1);
        ulabView.setAnimation(universityListAnimation2);




        duView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent duviewIntent=new Intent(University_List.this, Dhaka_University.class);
                startActivity(duviewIntent);

            }
        });

        dmcView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dmcviewIntent=new Intent(University_List.this, DMC.class);
                startActivity(dmcviewIntent);

            }
        });

        buetView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent buetviewIntent=new Intent(University_List.this, BUET.class);
                startActivity(buetviewIntent);

            }
        });

        nsuView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nsuviewIntent=new Intent(University_List.this, NSU.class);
                startActivity(nsuviewIntent);

            }
        });

        aiubView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent aiubviewIntent=new Intent(University_List.this, AIUB.class);
                startActivity(aiubviewIntent);

            }
        });

        austView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent austviewIntent=new Intent(University_List.this, AUST.class);
                startActivity(austviewIntent);

            }
        });

        ewuView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ewuviewIntent=new Intent(University_List.this, EWU.class);
                startActivity(ewuviewIntent);

            }
        });

        brackView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent brackviewIntent=new Intent(University_List.this, BRACK.class);
                startActivity(brackviewIntent);

            }
        });

        uapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent uapviewIntent=new Intent(University_List.this, UAP.class);
                startActivity(uapviewIntent);

            }
        });

        daffodilView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent daffodilviewIntent=new Intent(University_List.this, Daffodil.class);
                startActivity(daffodilviewIntent);

            }
        });

        iubView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iubviewIntent=new Intent(University_List.this, IUB.class);
                startActivity(iubviewIntent);

            }
        });

        ulabView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ulabviewIntent=new Intent(University_List.this, ULAB.class);
                startActivity(ulabviewIntent);

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