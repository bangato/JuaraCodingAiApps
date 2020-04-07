package com.bangato.juaracodingaiapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class Activity_pendaftaran extends AppCompatActivity {

    WebView webView;
//    Spinner sp;
//    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_pendaftaran);

        webView = (WebView) findViewById(R.id.webview);

//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
        
        webView.loadUrl("https://daunbg.com/filebuatupload/pendaftaran.html");



    }
}
