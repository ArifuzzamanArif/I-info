package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class IbnSina_Webview extends AppCompatActivity
{
    private WebView ibnsinaWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibn_sina__webview);


        ibnsinaWebView= findViewById(R.id.ibnsinaWebView);

        WebSettings webSettings= ibnsinaWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        ibnsinaWebView.setWebViewClient(new WebViewClient());

        ibnsinaWebView.loadUrl("https://www.ibnsinatrust.com/index.php");
    }


    @Override
    public void onBackPressed() {
        if (ibnsinaWebView.canGoBack()){
            ibnsinaWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}