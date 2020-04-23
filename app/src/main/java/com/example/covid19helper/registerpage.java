package com.example.covid19helper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class registerpage extends AppCompatActivity {
private Button registehelpseekerbtn,helperbtn;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpage);
        registehelpseekerbtn=findViewById(R.id.registerhelpseekerbtn);
        helperbtn=findViewById(R.id.helperbtn);
        mAuth = FirebaseAuth.getInstance();
        registehelpseekerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              updateUI();
            }
        });
        helperbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateUI2();
            }
        });

    }

    private void updateUI2() {
        Intent intent=new Intent(registerpage.this,helpseekerregistration.class);
        intent.putExtra("type","helper");
        startActivity(intent);
        finish();
    }

    private void updateUI() {
        Intent intent=new Intent(registerpage.this,helpseekerregistration.class);
        intent.putExtra("type","helpseeker");
        startActivity(intent);
        finish();
    }
}
