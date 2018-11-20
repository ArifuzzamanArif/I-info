package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Nandos_Facebookview extends AppCompatActivity
{
    private WebView nandosfacebookView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nandos__facebookview);

        nandosfacebookView= findViewById(R.id.nandosfacebookView);

        WebSettings webSettings= nandosfacebookView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        nandosfacebookView.setWebViewClient(new WebViewClient());

        nandosfacebookView.loadUrl("https://www.facebook.com/Nandosbd/");
    }


    @Override
    public void onBackPressed() {
        if (nandosfacebookView.canGoBack()){
            nandosfacebookView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}