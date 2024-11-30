package com.example.secondapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignIn extends AppCompatActivity {

    private TextView signUp;
    private Button btnSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_in);

        signUp = findViewById(R.id.btn_signup_signin);
        btnSign = findViewById(R.id.btn_signin_signin);


        signUp.setOnClickListener(view -> {
            startActivity(new Intent(this,SignUp.class));
        });

        btnSign.setOnClickListener(view -> {
            startActivity(new Intent(this,MainActivity.class));
        });
    }


}