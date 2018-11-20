package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ULAB_Webview extends AppCompatActivity
{
    private WebView ulabWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulab__webview);

        ulabWebView= findViewById(R.id.ulabWebView);

        WebSettings webSettings= ulabWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        ulabWebView.setWebViewClient(new WebViewClient());

        ulabWebView.loadUrl("https://ulab.edu.bd/");
    }


    @Override
    public void onBackPressed() {
        if (ulabWebView.canGoBack()){
            ulabWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}