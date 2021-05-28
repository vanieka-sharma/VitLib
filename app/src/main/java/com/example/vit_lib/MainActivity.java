package com.example.vit_lib;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button lb,rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lb = findViewById(R.id.loginButton);
        rb = findViewById(R.id.registerButton);
        lb.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,login.class);
            startActivity(intent);
        });
        rb.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,register.class);
            startActivity(intent);
        });
    }

}