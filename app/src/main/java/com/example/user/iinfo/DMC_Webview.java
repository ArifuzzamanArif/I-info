package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DMC_Webview extends AppCompatActivity
{
    private WebView dmcWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dmc__webview);

        dmcWebView= findViewById(R.id.dmcWebView);

        WebSettings webSettings= dmcWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        dmcWebView.setWebViewClient(new WebViewClient());

        dmcWebView.loadUrl("http://www.dmc.gov.bd/");
    }


    @Override
    public void onBackPressed() {
        if (dmcWebView.canGoBack()){
            dmcWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}