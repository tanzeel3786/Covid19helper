package com.example.covid19helper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
              FirebaseAuth mAuth;
              private String state="";
              private TextView mainacttextv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
           mAuth = FirebaseAuth.getInstance();
          mainacttextv=findViewById(R.id.mainacttextv);



    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
     //   FirebaseApp.initializeApp(MainActivity.this);
        if(connectionistrue()) {
            mAuth = FirebaseAuth.getInstance();
            final FirebaseUser currentUser = mAuth.getCurrentUser();
            if (currentUser != null) {

                FirebaseDatabase.getInstance().getReference().child("users").child(currentUser.getUid()).child("data").addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        String city = (String) dataSnapshot.child("city").getValue();
                        String state = (String) dataSnapshot.child("state").getValue();
                        String type = (String) dataSnapshot.child("type").getValue();
                        if (type.equals("helper")) {
                            Intent intent = new Intent(MainActivity.this, helper.class);
                            intent.putExtra("city", city);
                            intent.putExtra("state", state);
                            intent.putExtra("uid", currentUser.getUid());
                            startActivity(intent);
                            finish();
                        }
                        if (type.equals("helpseeker")) {
                            Intent intent = new Intent(MainActivity.this, helpseek.class);
                            intent.putExtra("city", city);
                            intent.putExtra("state", state);
                            intent.putExtra("uid", currentUser.getUid());
                            startActivity(intent);
                            finish();
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
//            FirebaseDatabase database = FirebaseDatabase.getInstance();
//            DatabaseReference myRef = database.getReference().child("helpseekusers").child(currentUser.getUid()).child("data");
//            myRef.addValueEventListener(new ValueEventListener() {
//                @Override
//                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                    city=(String) dataSnapshot.child("state").getValue();
//                }
//
//                @Override
//                public void onCancelled(@NonNull DatabaseError databaseError) {
//
//                }
//            });


            } else {
                Intent intent = new Intent(MainActivity.this, registerpage.class);
                startActivity(intent);
                finish();
            }
        }
        else
        {mainacttextv.setText("Please turn on your internet/कृपया अपना इंटरनेट चालू करें ");
        mainacttextv.setVisibility(View.VISIBLE);
            Toast.makeText(MainActivity.this,"Please turn on your internet",Toast.LENGTH_SHORT).show();
        }
    }

    private boolean connectionistrue() {
        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            connected = true;
        }
        else
            connected = false;
        return connected;
    }
}
