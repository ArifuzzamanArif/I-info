package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class IUB_Webview extends AppCompatActivity
{
    private WebView iubWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iub__webview);

        iubWebView= findViewById(R.id.iubWebView);

        WebSettings webSettings= iubWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        iubWebView.setWebViewClient(new WebViewClient());

        iubWebView.loadUrl("http://www.iub.edu.bd/");
    }


    @Override
    public void onBackPressed() {
        if (iubWebView.canGoBack()){
            iubWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}