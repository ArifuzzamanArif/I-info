package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EWU_Webview extends AppCompatActivity
{
    private WebView ewuWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ewu__webview);

        ewuWebView= findViewById(R.id.ewuWebView);

        WebSettings webSettings= ewuWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        ewuWebView.setWebViewClient(new WebViewClient());

        ewuWebView.loadUrl("http://www.ewubd.edu/");
    }


    @Override
    public void onBackPressed() {
        if (ewuWebView.canGoBack()){
            ewuWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}