package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Sabroso_Webview extends AppCompatActivity
{
    private WebView sabrosoWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabroso__webview);

        sabrosoWebView= findViewById(R.id.sabrosoWebView);

        WebSettings webSettings= sabrosoWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        sabrosoWebView.setWebViewClient(new WebViewClient());

        sabrosoWebView.loadUrl("https://www.facebook.com/Sabroso.live/");
    }


    @Override
    public void onBackPressed() {
        if (sabrosoWebView.canGoBack()){
            sabrosoWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}