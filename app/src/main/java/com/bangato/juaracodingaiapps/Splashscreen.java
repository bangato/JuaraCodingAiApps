package com.bangato.juaracodingaiapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splashscreen extends AppCompatActivity {


    static int TIMEOUT_MILLIS = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);



            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {

                    Intent i = new Intent(Splashscreen.this, MainActivity.class);
                    startActivity(i);

                    // close this activity
                    finish();
                }
            }, TIMEOUT_MILLIS);
        }
    }