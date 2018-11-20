package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TakeOut_Webview extends AppCompatActivity
{
    private WebView takeoutWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_out__webview);

        takeoutWebView= findViewById(R.id.takeoutWebView);

        WebSettings webSettings= takeoutWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        takeoutWebView.setWebViewClient(new WebViewClient());

        takeoutWebView.loadUrl("https://www.facebook.com/bdtakeout");
    }


    @Override
    public void onBackPressed() {
        if (takeoutWebView.canGoBack()){
            takeoutWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}