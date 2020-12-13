package com.example.urdataa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    private Button buttonadmin;
    private Button buttonlecturer;
    private Button buttonguest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonadmin = findViewById(R.id.buttonloginadmin);
        buttonlecturer = findViewById(R.id.buttonloginlecturer);
        buttonguest = findViewById(R.id.buttonguest);

        buttonadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });
        buttonlecturer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });
        buttonguest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });
    }

        public void openMain(){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
    }
}