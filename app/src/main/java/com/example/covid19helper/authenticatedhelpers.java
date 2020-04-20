package com.example.covid19helper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class authenticatedhelpers extends AppCompatActivity {
private EditText ahnameedittext,ahphoneedittext;
private Button ahregisterbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authenticatedhelpers);
        ahnameedittext=findViewById(R.id.ahnameedittext);
        ahphoneedittext=findViewById(R.id.ahphoneedittext);
        ahregisterbtn=findViewById(R.id.ahregisterbtn);
        final String city=getIntent().getStringExtra("city");
        final String state=getIntent().getStringExtra("state");
        final String uid=getIntent().getStringExtra("uid");
        ahregisterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ahnameedittext.getText().toString().equals("")||ahphoneedittext.getText().toString().equals("")) {
                    Toast.makeText(authenticatedhelpers.this, "Please fill above details", Toast.LENGTH_SHORT).show();
                }
                    else {
                 final DatabaseReference myref=   FirebaseDatabase.getInstance().getReference("users").child(uid).child("data");
                 myref.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            if(dataSnapshot.exists())
                            {
                                for(DataSnapshot datas:dataSnapshot.getChildren())
                                {
                                    String key=datas.getKey();
                                    String registrationstatus=datas.child("Registerationstatus").getValue().toString();
                                    if(registrationstatus.equals("Not registered")) {
                                        updateData();
                                        myref.child(key).child("Registerationstatus").setValue("registred");
                                        Toast.makeText(authenticatedhelpers.this,ahnameedittext.getText().toString(),Toast.LENGTH_SHORT).show();


                                    }else
                                        Toast.makeText(authenticatedhelpers.this,"userregistered",Toast.LENGTH_SHORT).show();


                                }
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });

                }
            }
        });
    }

    private void updateData() {
        FirebaseDatabase database2 = FirebaseDatabase.getInstance();
        DatabaseReference myRef2 = database2.getReference().child("everytimehelperdetail").child(getIntent().getStringExtra("state")).child(getIntent().getStringExtra("city")).
                child(getIntent().getStringExtra("uid")).child("data").push();
        HashMap<String,String> dataMap=new HashMap<>();
        dataMap.put("Name",ahnameedittext.getText().toString());
        dataMap.put("Phone",ahphoneedittext.getText().toString());
        myRef2.setValue(dataMap);
    }


}
