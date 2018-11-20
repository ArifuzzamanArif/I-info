package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Nandos_Websiteview extends AppCompatActivity
{
    private WebView nandoswebsiteView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nandos__websiteview);

        nandoswebsiteView= findViewById(R.id.nandoswebsiteView);

        WebSettings webSettings= nandoswebsiteView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        nandoswebsiteView.setWebViewClient(new WebViewClient());

        nandoswebsiteView.loadUrl("https://www.nandos.com.bd/");
    }


    @Override
    public void onBackPressed() {
        if (nandoswebsiteView.canGoBack()){
            nandoswebsiteView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}