package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Appollo_Webview extends AppCompatActivity
{
    private WebView appolloWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appollo__webview);


        appolloWebView= findViewById(R.id.appolloWebView);

        WebSettings webSettings= appolloWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        appolloWebView.setWebViewClient(new WebViewClient());

        appolloWebView.loadUrl("http://www.apollodhaka.com/");
    }


    @Override
    public void onBackPressed() {
        if (appolloWebView.canGoBack()){
            appolloWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}