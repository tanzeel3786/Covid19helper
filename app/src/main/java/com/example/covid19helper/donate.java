package com.example.covid19helper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class donate extends AppCompatActivity {
private ListView donatelistview;
private List<String> numberlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
         donatelistview=findViewById(R.id.donatelistview);
         numberlist=new ArrayList<>();
        FirebaseDatabase.getInstance().getReference().child("donate").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                String donate=(String) dataSnapshot.getValue();
                numberlist.add(donate);
                final ArrayAdapter<String> adapter = new ArrayAdapter<String>(donate.this,android.R.layout.simple_list_item_1,numberlist);
                donatelistview.setAdapter(adapter);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(donate.this,android.R.layout.simple_list_item_1,numberlist);
        donatelistview.setAdapter(adapter);
    }
}
