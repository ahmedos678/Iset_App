package com.example.secondapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FirstActivity extends AppCompatActivity {

    private Button log,sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_first);
        log=findViewById(R.id.log);
        sign=findViewById(R.id.sign);

        SharedPreferences preferences = getSharedPreferences("checkBoxRemember", MODE_PRIVATE);
        boolean isChecked = preferences.getBoolean("rememberMe", false);

        if (isChecked) {
            startActivity(new Intent(this, Profile.class));
        }

        log.setOnClickListener(view -> {
            Intent intent =new Intent(this,SignIn.class);
            startActivity(intent);
        });

        sign.setOnClickListener(view -> {
            Intent intent =new Intent(this,SignUp.class);
            startActivity(intent);
        });
    }
}