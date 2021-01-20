package com.example.urdataa.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.urdataa.R;

public class SplashScreen extends AppCompatActivity {
    private static int splash_time_out = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeintent = new Intent (SplashScreen.this, LoginActivity.class);
                startActivity(homeintent);
                finish();
            }
        },splash_time_out);
    }
}