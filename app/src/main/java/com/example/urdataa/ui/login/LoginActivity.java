package com.example.urdataa.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.urdataa.R;

import com.example.urdataa.ui.user.UserEventActivity;
import com.example.urdataa.utils.SharedPreferenceHelper;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    Button btn_login;

    TextInputLayout emailTIL, passwordTIL;

    private LoginViewModel viewModel;
    private SharedPreferenceHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_login);

        viewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        helper = SharedPreferenceHelper.getInstance(this);

        btn_login = findViewById(R.id.buttonlogin);

        emailTIL = findViewById(R.id.inputemail);
        passwordTIL = findViewById(R.id.inputpassword);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!emailTIL.getEditText().getText().toString().trim().isEmpty() && !passwordTIL.getEditText().getText().toString().trim().isEmpty()){
                    String email = emailTIL.getEditText().getText().toString().trim();
                    String password = passwordTIL.getEditText().getText().toString().trim();
                    viewModel.login(email,password).observe(LoginActivity.this, tokenResponse -> {
                        if (tokenResponse != null){
                            helper.saveAccessToken(tokenResponse.getAccessToken());
                            Intent intent = new Intent(LoginActivity.this, UserEventActivity.class);
                            startActivity(intent);
                            Toast.makeText(LoginActivity.this,"Success",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(LoginActivity.this, "Invalid Email Or Password", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });



    }
}
