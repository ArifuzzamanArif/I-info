package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BRACK_Webview extends AppCompatActivity
{
    private WebView brackWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brack__webview);

        brackWebView= findViewById(R.id.brackWebView);

        WebSettings webSettings= brackWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        brackWebView.setWebViewClient(new WebViewClient());

        brackWebView.loadUrl("https://www.bracu.ac.bd");
    }


    @Override
    public void onBackPressed() {
        if (brackWebView.canGoBack()){
            brackWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}