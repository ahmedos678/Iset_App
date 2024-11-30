package com.example.secondapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Abscence extends AppCompatActivity {

    private TextView semestre1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_abscence);

        semestre1=findViewById(R.id.taux);
        semestre1.setOnClickListener(view -> {
            startActivity(new Intent(this,Semestre1.class));
        });
    }
}