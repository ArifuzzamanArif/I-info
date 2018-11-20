package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class UAP_Webview extends AppCompatActivity
{
    private WebView uapWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uap__webview);

        uapWebView= findViewById(R.id.uapWebView);

        WebSettings webSettings= uapWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        uapWebView.setWebViewClient(new WebViewClient());

        uapWebView.loadUrl("http://www.uap-bd.edu/");
    }


    @Override
    public void onBackPressed() {
        if (uapWebView.canGoBack()){
            uapWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}