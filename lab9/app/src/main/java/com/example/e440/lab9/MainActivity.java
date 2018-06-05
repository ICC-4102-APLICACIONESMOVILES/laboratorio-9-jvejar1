package com.example.e440.lab9;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.webView = findViewById(R.id.web_view);
        String url="http://demo.tutorialzine.com/2012/04/mobile-touch-gallery/";


        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl(url);
        WebAppInterface webAppInterface=new WebAppInterface(this);
        webView.addJavascriptInterface(webAppInterface,"android");
        

        /*   webView.setWebChromeClient(new WebChromeClient(){

            public void onConsoleMessage(String message,int lineNumber, String sourceID) {
                Log.d("MyApp",message+"--From line "+lineNumber+" of "+sourceID);
            }
        });*/


    }

    @Override
    public void onBackPressed() {
        Log.d("App","Back pressed");
        if (webView.canGoBack()) {
            webView.goBack();
        }
    }


}
