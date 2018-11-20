package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BUET_Webview extends AppCompatActivity
{
    private WebView buetWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buet__webview);

        buetWebView= findViewById(R.id.buetWebView);

        WebSettings webSettings= buetWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        buetWebView.setWebViewClient(new WebViewClient());

        buetWebView.loadUrl("http://www.buet.ac.bd/");
    }


    @Override
    public void onBackPressed() {
        if (buetWebView.canGoBack()){
            buetWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}