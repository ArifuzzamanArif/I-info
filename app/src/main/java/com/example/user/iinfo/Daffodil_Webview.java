package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Daffodil_Webview extends AppCompatActivity
{
    private WebView daffodilWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daffodil__webview);

        daffodilWebView= findViewById(R.id.daffodilWebView);

        WebSettings webSettings= daffodilWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        daffodilWebView.setWebViewClient(new WebViewClient());

        daffodilWebView.loadUrl("https://daffodilvarsity.edu.bd/");
    }


    @Override
    public void onBackPressed() {
        if (daffodilWebView.canGoBack()){
            daffodilWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}