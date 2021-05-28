package com.example.vit_lib;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Fine extends AppCompatActivity implements ValueEventListener {
TextView textView;
private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
private DatabaseReference databaseReference = firebaseDatabase.getReference();
private DatabaseReference firstDatabase = databaseReference.child("fine");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fine);
        textView = findViewById(R.id.fine_amount);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {
        if (snapshot.getValue(String.class) != null){
            String key = snapshot.getKey();
            if(key.equals("fine")){
                String fine = snapshot.getValue(String.class);
                textView.setText(fine);
            }
        }

    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }
    @Override
    protected void onStart(){
        super.onStart();
        firstDatabase.addValueEventListener(this);
    }
}