package com.example.vit_lib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SamplePaper extends AppCompatActivity {
    Button cse,bio,mat,chy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_paper);
        cse = findViewById(R.id.button2);
        bio = findViewById(R.id.button1);
        mat = findViewById(R.id.button3);
        chy = findViewById(R.id.button4);

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SamplePaper.this,CseSamplePapers.class);
                startActivity(intent);
            }
        });
        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SamplePaper.this,BioSamplePapers.class);
                startActivity(intent);
            }
        });
        mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SamplePaper.this,MatSamplePapers.class);
                startActivity(intent);
            }
        });
        chy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SamplePaper.this,ChySamplePapers.class);
                startActivity(intent);
            }
        });
    }

}