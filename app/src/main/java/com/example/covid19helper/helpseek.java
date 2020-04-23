package com.example.covid19helper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

public class helpseek extends AppCompatActivity {
private EditText problemedittext,addressedittext,nameedittext;
private Button seekhelpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpseek);
        final String city=getIntent().getStringExtra("city");
        final String state=getIntent().getStringExtra("state");
        final String uid=getIntent().getStringExtra("uid");

        problemedittext=findViewById(R.id.problemedittext);
        addressedittext=findViewById(R.id.addressedittext);
        nameedittext=findViewById(R.id.nameedittext);
        seekhelpbtn=findViewById(R.id.seekhelpbtn);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+5:30"));
        Date currentLocalTime = cal.getTime();
        DateFormat date = new SimpleDateFormat("HH:mm");
// you can get seconds by adding  "...:ss" to it
        date.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));

        final String localTime = date.format(currentLocalTime);
        FirebaseDatabase.getInstance().getReference().child("helpseekersstate").child(state).child(city).child(uid).addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                if(dataSnapshot.exists())
                {
                 //   Toast.makeText(helpseek.this,"problem there",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(helpseek.this,helpseekafteractivity.class);

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
        seekhelpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> dataMap=new HashMap<>();
                dataMap.put("name",nameedittext.getText().toString());
                dataMap.put("problem",problemedittext.getText().toString());
                dataMap.put("address",addressedittext.getText().toString());
                dataMap.put("time",localTime);
                dataMap.put("helpstatus","helpwaiting");
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference().child("helpseekersstate").child(state).child(city).child(uid).child("problem").push();
                myRef.setValue(dataMap);
             //
                //
                //   seekhelpbtn.setText("Please wait");

            }
        });
  //      Toast.makeText(helpseek.this,city,Toast.LENGTH_LONG).show();
     //  Toast.makeText(helpseek.this,state,Toast.LENGTH_LONG).show();

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionsmenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                startActivity(new Intent(this, aboutapp.class));
                return true;
            case R.id.govthelplinenos:
                Intent intent=new Intent(helpseek.this,govthelplinenumbers.class);
                intent.putExtra("state",getIntent().getStringExtra("state"));

                startActivity(intent);
                return true;
            case R.id.authenticatedhelpersnos:
                Intent intent1=new Intent(helpseek.this,Authenticatedhelpersnumber.class);
                intent1.putExtra("state",getIntent().getStringExtra("state"));
                intent1.putExtra("city",getIntent().getStringExtra("city"));
                startActivity(intent1);

                return true;
            case R.id.newshelpseek:
                startActivity(new Intent(this, news.class));
            default:
                return super.onOptionsItemSelected(item);
        }
//respond to menu item selection
    }
}
