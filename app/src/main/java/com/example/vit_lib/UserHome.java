package com.example.vit_lib;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;

public class UserHome extends AppCompatActivity {
    Button pdf,sam_paper,fine,profile,issue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
                pdf = findViewById(R.id.bookPdf);
                sam_paper = findViewById(R.id.sample_paper);
                fine = findViewById(R.id.fine);
                profile =findViewById(R.id.profile);
                issue = findViewById(R.id.issued_books);
        Button logOut1 = findViewById(R.id.logOut1);
        logOut1.setOnClickListener(v -> {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        });issue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHome.this,IssuedBooks.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHome.this,UserProfile.class);
                startActivity(intent);
            }
        });
        fine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHome.this,Fine.class);
                startActivity(intent);
            }
        });
        pdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHome.this,PdfOfBooks.class);
                startActivity(intent);
            }
        });
        sam_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHome.this,SamplePaper.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.FAQs:
                Intent i = new Intent(UserHome.this,FAQs.class);
                startActivity(i);
                return true;
            case R.id.contact:
                Intent in = new Intent(UserHome.this,ContactUs.class);
                startActivity(in);
                return true;
            case R.id.log_out:
                Intent intent = new Intent(UserHome.this,MainActivity.class);
                startActivity(intent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}