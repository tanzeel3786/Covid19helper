package com.example.covid19helper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class Authenticatedhelpersnumber extends AppCompatActivity {

    private ListView ahnlistview;
    private List<String> numberlist;
    private TextView ahntextv;
    private String name="",phone="",total="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authenticatedhelpersnumber);
        ahnlistview=findViewById(R.id.ahnlistview);
        numberlist=new ArrayList<>();
        ahntextv=findViewById(R.id.ahntextv);
        final String city=getIntent().getStringExtra("city");
        final String state=getIntent().getStringExtra("state");
        final String uid=getIntent().getStringExtra("uid");
        ahntextv.setText("Helpers in "+city+"  "  +city+"  में मददगार");
        FirebaseDatabase.getInstance().getReference().child("everytimehelperdetail").child(state).child(city).addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                if(dataSnapshot.exists()) {
                    for (DataSnapshot snapshot : dataSnapshot.child("data").getChildren())
                    {
                      name=(String) snapshot.child("Name").getValue();
                      phone=(String) snapshot.child("Phone").getValue();
                      total="Helper name/सहायक का नाम: "+name+"            Phone Number/फ़ोन नंबर :"+phone;
                    }
                    numberlist.add(total);
                    ahntextv.setText("Helpers in "+city+"  "  +city+"  में मददगार");
                    final ArrayAdapter<String> adapter = new ArrayAdapter<String>(Authenticatedhelpersnumber.this,android.R.layout.simple_list_item_1,numberlist);
                    ahnlistview.setAdapter(adapter);
                }

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

    }
}
