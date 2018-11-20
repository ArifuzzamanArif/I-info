package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Dhaka_University_Webview extends AppCompatActivity
{
    private WebView duWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__university__webview);

        duWebView= findViewById(R.id.duWebView);

        WebSettings webSettings= duWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        duWebView.setWebViewClient(new WebViewClient());

        duWebView.loadUrl("http://www.du.ac.bd/");
    }


    @Override
    public void onBackPressed() {
        if (duWebView.canGoBack()){
            duWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}