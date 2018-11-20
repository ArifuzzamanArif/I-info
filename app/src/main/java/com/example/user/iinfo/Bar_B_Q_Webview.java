package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Bar_B_Q_Webview extends AppCompatActivity
{
    private WebView barbqWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar__b__q__webview);

        barbqWebView= findViewById(R.id.barbqWebView);

        WebSettings webSettings= barbqWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        barbqWebView.setWebViewClient(new WebViewClient());

        barbqWebView.loadUrl("https://www.facebook.com/barbqtonight.dhk/");
    }


    @Override
    public void onBackPressed() {
        if (barbqWebView.canGoBack()){
            barbqWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}