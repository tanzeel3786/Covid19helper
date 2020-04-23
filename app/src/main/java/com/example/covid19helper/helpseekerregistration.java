package com.example.covid19helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

public class helpseekerregistration extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
private TextView helpseektextv,helpseektextv2;
private Button helpseekbtn;
private String item1="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpseekerregistration);
helpseektextv=findViewById(R.id.helpseektextv);
helpseektextv2=findViewById(R.id.helpseektextv2);
helpseekbtn=findViewById(R.id.helpseekbtn);
      //  B User=getIntent().getExtras();
        final String type=getIntent().getStringExtra("type");
Spinner spinner = (Spinner) findViewById(R.id.spinner);
        //Toast.makeText(helpseekerregistration.this,userid,Toast.LENGTH_LONG).show();

        spinner.setOnItemSelectedListener(this);
        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Choose your State/अपना राज्य चुनें।");
        categories.add("Andhra Pradesh/आंध्र प्रदेश");
        categories.add("Arunachal Pradesh/अरुणाचल प्रदेश");
        categories.add("Assam/असम");
        categories.add("Bihar/ बिहार");
        categories.add("Chhattisgarh/छत्तीसगढ़");
        categories.add("Goa/ गोवा");
        categories.add("Gujrat/गुजरात");
        categories.add("New Delhi/नई दिल्ली");
        categories.add("Haryana/हरियाणा");
        categories.add("Himachal Pradesh/हिमाचल प्रदेश");
        categories.add("Jammu and Kashmir/जम्मू और कश्मीर");
        categories.add("Jharkhand/झारखंड");
        categories.add("Karnataka/कर्नाटक");
        categories.add("Kerla/केरल");
        categories.add("Madhya Pradesh/मध्य प्रदेश");
        categories.add("Maharashtra/महाराष्ट्र");
        categories.add("Manipur/मणिपुर");
        categories.add("Meghalaya/मेघालय");
        categories.add("Mizoram/मिजोरम");
        categories.add("Nagaland/नगालैंड");
        categories.add("Odisha/ओडिशा");
        categories.add("Punjab/पंजाब");
        categories.add("Rajasthan/राजस्थान");
        categories.add("Sikkim/सिक्किम");
        categories.add("Tamil Nadu/तमिलनाडु");
        categories.add("Telangna/तेलंगाना");
        categories.add("Tripura/त्रिपुरा");
        categories.add("Uttrakhand/उत्तराखंड");
        categories.add("Utar Pradesh/उत्तर प्रदेश");
        categories.add("West Bengal/पश्चिम बंगाल");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,R.layout.spinnerlayout,categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        helpseekbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(item1.equals(""))
                {
                    Toast.makeText(helpseekerregistration.this,"Please Choose the State",Toast.LENGTH_SHORT).show();
                }
                if(item1.equals("Choose your State/अपना राज्य चुनें।"))
                {
                    Toast.makeText(helpseekerregistration.this,"Please Choose the State",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(helpseekerregistration.this, helpseekcity.class);
                    intent.putExtra("selectedstate",item1);
                    intent.putExtra("type",type);
                    startActivity(intent);
                    finish();
                }
            }
        });



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();
        item1=item;
         helpseektextv.setText("You haved choosed "+item+" as your Current State"+
                 " आपने  अपने  वर्तमान  राज्य  के  रूप  में "+item+" को चुना है");
         if(item.equals("Choose your State/अपना राज्य चुनें।"))
         {
             helpseektextv.setVisibility(View.INVISIBLE);
             helpseektextv2.setVisibility(View.INVISIBLE);
         }
         else
         {
             helpseektextv.setVisibility(View.VISIBLE);
             helpseektextv2.setVisibility(View.VISIBLE);
         }

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

}

