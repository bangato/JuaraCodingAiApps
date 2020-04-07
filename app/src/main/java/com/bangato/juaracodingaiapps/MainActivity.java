package com.bangato.juaracodingaiapps;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

//    WebView webView;
//    Spinner sp;
//    ArrayAdapter<String> adapter;
//
//    String dua[] = new String[]{"PENDAFTARAN", "ABOUT US", "PERSYARATAN"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


//        webView = (WebView) findViewById(R.id.webview);
//        webView.loadUrl("https://daunbg.com/filebuatupload/pendaftaran.html");
//
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Chat.class);
                startActivity(i);
            }
        });


        CardView pendaftaran = findViewById(R.id.pendaftaran);
        pendaftaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Activity_pendaftaran.class);
                startActivity(i);
            }
        });

        CardView persyaratan = findViewById(R.id.persyaratan);
        persyaratan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Activity_persyaratan.class);
                startActivity(i);
            }
        });

        CardView about_us = findViewById(R.id.about_us);
        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Activity_aboutus.class);
                startActivity(i);
            }
        });

        CardView sylabus = findViewById(R.id.sylabus);
        sylabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Activity_sylabus.class);
                startActivity(i);
            }
        });

//        CardView map = findViewById(R.id.maps);
//        map.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, Activity_tentang.class);
//                startActivity(i);
//            }
//        });

//
////        sp = (Spinner) findViewById(R.id.spinner);
//
//        adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_spinner_item, dua);
//        sp.setAdapter(adapter);
//
//        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            public void onItemSelected(AdapterView<?> parent, View view,
//                                       int position, long id) {
//                String nilai = parent.getSelectedItem().toString();
//
//                if (nilai.equals("PENDAFTARAN")) {
//                    webView.loadUrl("https://daunbg.com/filebuatupload/pendaftaran.html");
//                } else if (nilai.equals("ABOUT US")) {
//                    webView.loadUrl("https://daunbg.com/filebuatupload/aboutus.html");
//                } else if (nilai.equals("PERSYARATAN")) {
//                    webView.loadUrl("https://daunbg.com/filebuatupload/bootcamppersyaratan.html");
//                }
//            }
//
//            public void onNothingSelected(AdapterView<?> arg0) {
//                // TODO Auto-generated method stub
//            }
//        });
//
//    }




    }
}