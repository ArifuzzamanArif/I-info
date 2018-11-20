package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Popular_Webview extends AppCompatActivity
{
    private WebView popularWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular__webview);

        popularWebView= findViewById(R.id.popularWebView);

        WebSettings webSettings= popularWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        popularWebView.setWebViewClient(new WebViewClient());

        popularWebView.loadUrl("http://www.pmch-bd.org/");
    }


    @Override
    public void onBackPressed() {
        if (popularWebView.canGoBack()){
            popularWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}