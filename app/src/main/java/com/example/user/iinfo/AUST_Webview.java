package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AUST_Webview extends AppCompatActivity
{
    private WebView austWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aust__webview);

        austWebView= findViewById(R.id.austWebView);

        WebSettings webSettings= austWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        austWebView.setWebViewClient(new WebViewClient());

        austWebView.loadUrl("http://www.aust.edu/");
    }


    @Override
    public void onBackPressed() {
        if (austWebView.canGoBack()){
            austWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}