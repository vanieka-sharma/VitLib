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

import com.google.firebase.auth.FirebaseAuth;

public class AdminHome extends AppCompatActivity {
    Button add_book,add_cse,add_bio,add_mat,add_chy,fine,issue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
        Button logOut = findViewById(R.id.logOut);
        add_book = findViewById(R.id.addBook);
        add_cse = findViewById(R.id.add_cse);
        add_bio = findViewById(R.id.add_bio);
        add_mat = findViewById(R.id.add_mat);
        add_chy = findViewById(R.id.add_chy);
        fine = findViewById(R.id.fine);
        issue = findViewById(R.id.Issue_Book);
        logOut.setOnClickListener(v -> {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        });
        issue.setOnClickListener(v -> {
            Intent intent = new Intent(AdminHome.this,IssueBookToUser.class);
            startActivity(intent);
        });
        fine.setOnClickListener(v -> {
            Intent intent = new Intent(AdminHome.this,Fine.class);
            startActivity(intent);
        });
        add_bio.setOnClickListener(v -> {
            Intent intent = new Intent(AdminHome.this,AdminAddBio.class);
            startActivity(intent);
        });
        add_mat.setOnClickListener(v -> {
            Intent intent = new Intent(AdminHome.this,AdminAddMat.class);
            startActivity(intent);
        });
        add_chy.setOnClickListener(v -> {
            Intent intent = new Intent(AdminHome.this,AdminAddChy.class);
            startActivity(intent);
        });
        add_cse.setOnClickListener(v -> {
            Intent intent = new Intent(AdminHome.this,AdminAddCse.class);
            startActivity(intent);
        });
        add_book.setOnClickListener(v -> {
            Intent intent = new Intent(AdminHome.this,AdminAddBook.class);
            startActivity(intent);
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
                Intent i = new Intent(AdminHome.this,FAQs.class);
                startActivity(i);
            case R.id.contact:
                Intent in = new Intent(AdminHome.this,ContactUs.class);
                startActivity(in);
            case R.id.log_out:
                Intent intent = new Intent(AdminHome.this,MainActivity.class);
                startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}