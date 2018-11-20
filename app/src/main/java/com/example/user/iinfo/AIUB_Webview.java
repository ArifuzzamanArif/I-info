package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AIUB_Webview extends AppCompatActivity
{
    private WebView aiubWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiub__webview);

        aiubWebView= findViewById(R.id.aiubWebView);

        WebSettings webSettings= aiubWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        aiubWebView.setWebViewClient(new WebViewClient());

        aiubWebView.loadUrl("http://www.aiub.edu/");
    }


    @Override
    public void onBackPressed() {
        if (aiubWebView.canGoBack()){
            aiubWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}