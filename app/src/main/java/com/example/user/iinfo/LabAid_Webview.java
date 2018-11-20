package com.example.user.iinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LabAid_Webview extends AppCompatActivity
{
    private WebView labaidWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_aid__webview);

        labaidWebView= findViewById(R.id.labaidWebView);

        WebSettings webSettings= labaidWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        labaidWebView.setWebViewClient(new WebViewClient());

        labaidWebView.loadUrl("http://labaidgroup.com/specialized");
    }


    @Override
    public void onBackPressed() {
        if (labaidWebView.canGoBack()){
            labaidWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}