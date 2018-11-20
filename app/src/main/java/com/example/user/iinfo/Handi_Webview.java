package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Handi_Webview extends AppCompatActivity
{
    private WebView handiWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handi__webview);

        handiWebView= findViewById(R.id.handiWebView);

        WebSettings webSettings= handiWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        handiWebView.setWebViewClient(new WebViewClient());

        handiWebView.loadUrl("https://www.facebook.com/handibd/");
    }


    @Override
    public void onBackPressed() {
        if (handiWebView.canGoBack()){
            handiWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}