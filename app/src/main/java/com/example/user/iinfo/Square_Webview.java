package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Square_Webview extends AppCompatActivity
{
    private WebView squareWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square__webview);

        squareWebView= findViewById(R.id.squareWebView);

        WebSettings webSettings= squareWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        squareWebView.setWebViewClient(new WebViewClient());

        squareWebView.loadUrl("https://www.squarehospital.com/");
    }


    @Override
    public void onBackPressed() {
        if (squareWebView.canGoBack()){
            squareWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}