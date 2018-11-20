package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CityHospital_Webview extends AppCompatActivity
{
    private WebView cityWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_hospital__webview);

        cityWebView= findViewById(R.id.cityWebView);

        WebSettings webSettings= cityWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        cityWebView.setWebViewClient(new WebViewClient());

        cityWebView.loadUrl("https://www.cityhospitalbd.com/");
    }


    @Override
    public void onBackPressed() {
        if (cityWebView.canGoBack()){
            cityWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}