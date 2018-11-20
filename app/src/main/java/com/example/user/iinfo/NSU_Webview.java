package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NSU_Webview extends AppCompatActivity
{
    private WebView nsuWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nsu__webview);

        nsuWebView= findViewById(R.id.nsuWebView);

        WebSettings webSettings= nsuWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        nsuWebView.setWebViewClient(new WebViewClient());

        nsuWebView.loadUrl("http://www.northsouth.edu/");
    }


    @Override
    public void onBackPressed() {
        if (nsuWebView.canGoBack()){
            nsuWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}