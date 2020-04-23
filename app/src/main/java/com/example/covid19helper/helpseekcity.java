package com.example.covid19helper;

import androidx.annotation.NonNull;
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

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class helpseekcity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    List<String> AndhraPradesh = new ArrayList<String>();
    List<String> Arunachalpradesh = new ArrayList<String>();
    List<String> Assam = new ArrayList<String>();
    List<String> Bihar = new ArrayList<String>();
    List<String> Chattisgarh = new ArrayList<String>();
    List<String> Goa = new ArrayList<String>();
    List<String> newdelhi = new ArrayList<String>();
    List<String> Gujrat = new ArrayList<String>();
    List<String> Haryana = new ArrayList<String>();
    List<String> HimachalPradesh = new ArrayList<String>();
    List<String> Jammuandkashmir = new ArrayList<String>();
    List<String> Jharkhand = new ArrayList<String>();
    List<String> Karnataka = new ArrayList<String>();
    List<String> Kerla = new ArrayList<String>();
    List<String> MadhyaPradesh = new ArrayList<String>();
    List<String> Maharashtra = new ArrayList<String>();
    List<String> Manipur = new ArrayList<String>();
    List<String> Meghalaya = new ArrayList<String>();
    List<String> Mizoram = new ArrayList<String>();
    List<String> Nagaland = new ArrayList<String>();
    List<String> Odisha = new ArrayList<String>();
    List<String> Punjab = new ArrayList<String>();
    List<String> Rajasthan = new ArrayList<String>();
    List<String> Sikkim = new ArrayList<String>();
    List<String> TamilNadu = new ArrayList<String>();
    List<String> Telangna = new ArrayList<String>();
    List<String> Tripura = new ArrayList<String>();
    List<String> Uttrakhand = new ArrayList<String>();
    List<String> UttarPradesh = new ArrayList<String>();
    List<String> WestBengal = new ArrayList<String>();
    private TextView helpseekcitytextv,helpseekcitytextv2;
    private Button helpseekcitybtn;
    private String item1="";
    private FirebaseAuth mAuth;
    private String city="";
    private String state="";
    private String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpseekcity);
        helpseekcitytextv=findViewById(R.id.helpseekcitytextv);
        helpseekcitytextv2=findViewById(R.id.helpseekcitytextv2);
        helpseekcitybtn=findViewById(R.id.helpseekcitybtn);
         city=getIntent().getStringExtra("selectedstate");
         type=getIntent().getStringExtra("type");
        final Spinner spinner = findViewById(R.id.spinner2);
        mAuth = FirebaseAuth.getInstance();

        state=getIntent().getStringExtra("selectedstate");
        Toast.makeText(helpseekcity.this,state,Toast.LENGTH_SHORT).show();

        //  Button button=(Button)findViewById(R.id.button);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements

        if(city.equals("Andhra Pradesh/आंध्र प्रदेश"))
        {addcityAndhrapradesh();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,AndhraPradesh);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Arunachal Pradesh/अरुणाचल प्रदेश"))
        {addcityArunachalpradesh();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Arunachalpradesh);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Assam/असम"))
        {addcityAssam();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Assam);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Bihar/ बिहार"))
        {addcityBihar();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Bihar);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Chhattisgarh/छत्तीसगढ़"))
        {addcityChattisgarh();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Chattisgarh);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("New Delhi/नई दिल्ली"))
        {addcityDelhi();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,newdelhi);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Goa/ गोवा"))
        {addcityGoa();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Goa);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Gujrat/गुजरात"))
        {addcityGujrat();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Gujrat);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Haryana/हरियाणा"))
        {addcityHaryana();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Haryana);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Himachal Pradesh/हिमाचल प्रदेश"))
        {addcityHimachaPradesh();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,HimachalPradesh);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Jammu and Kashmir/जम्मू और कश्मीर"))
        {addcityJammuandkashmir();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Jammuandkashmir);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Jharkhand/झारखंड"))
        {addcityJharkhand();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Jharkhand);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Karnataka/कर्नाटक"))
        {addcityKarnataka();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Karnataka);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Kerla/केरल"))
        {addcityKerla();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Kerla);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Madhya Pradesh/मध्य प्रदेश"))
        {addcityMadhyaPradesh();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,MadhyaPradesh);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Maharashtra/महाराष्ट्र"))
        {addcityMaharashtra();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Maharashtra);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Manipur/मणिपुर"))
        {addcityManipur();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Manipur);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Meghalaya/मेघालय"))
        {addcityMeghalaya();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Meghalaya);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Mizoram/मिजोरम"))
        {addcityMizoram();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Mizoram);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Nagaland/नगालैंड"))
        {addcityNagaland();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Nagaland);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Odisha/ओडिशा"))
        {addcityOdisha();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Odisha);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Punjab/पंजाब"))
        {addcityPunjab();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Punjab);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Rajasthan/राजस्थान"))
        {addcityRajasthan();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Rajasthan);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Sikkim/सिक्किम"))
        {addcitySikkim();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Sikkim);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Tamil Nadu/तमिलनाडु"))
        {addcityTamilNadu();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,TamilNadu);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Telangna/तेलंगाना"))
        {addcityTelangna();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Telangna);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Tripura/त्रिपुरा"))
        {addcityTripura();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Tripura);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Uttrakhand/उत्तराखंड"))
        {addcityUttrakhand();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,Uttrakhand);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("Utar Pradesh/उत्तर प्रदेश"))
        {addcityUttarPradesh();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,UttarPradesh);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        if(city.equals("West Bengal/पश्चिम बंगाल"))
        {addcityWestBengal();
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinnerlayout,WestBengal);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(dataAdapter);
        }
        helpseekcitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(item1.equals(""))
                {
                    Toast.makeText(helpseekcity.this,"Please choose your city/कृपया अपना शहर चुनें।",Toast.LENGTH_SHORT).show();
                }
                if(item1.equals("Please choose your city/कृपया अपना शहर चुनें।"))
                {
                    Toast.makeText(helpseekcity.this,"Please choose your city/कृपया अपना शहर चुनें।",Toast.LENGTH_SHORT).show();
                }
                else {
                    mAuth.signInAnonymously().addOnCompleteListener(helpseekcity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                            {
                                FirebaseUser user=mAuth.getCurrentUser();


                               // updateDetailsToFirebase(item1,city,task.getResult().getUser().getUid());
                                updateUI(task.getResult().getUser().getUid(),state,item1);
                            }
                            else
                            {
                                Toast.makeText(helpseekcity.this,"Unsuccesfull",Toast.LENGTH_LONG).show();
                            }
                        }
                    });
//                    Intent intent = new Intent(helpseekcity.this, helpseek.class);
//                    intent.putExtra("selectedcity",item1);
//                    intent.putExtra("state",city);
//                    startActivity(intent);
                }

            }
        });
    }

    private void addcityDelhi() {
        newdelhi.add("Delhi");
    }

    private void updateDetailsToFirebase(String city, String state, String uid) {
        HashMap<String,String> dataMap=new HashMap<>();
        dataMap.put("helpseekerstate",state);
        FirebaseDatabase.getInstance().getReference().child("helpseekers").child(state).child(city).push().setValue(dataMap);
    }

    private void updateUI(String uid ,String state,String city) {
        HashMap<String,String> dataMap=new HashMap<>();
        Toast.makeText(helpseekcity.this,city,Toast.LENGTH_LONG).show();
        dataMap.put("state",state);
        dataMap.put("city",city);
        dataMap.put("type",type);

        if(type.equals("helpseeker")) {
            Intent intent = new Intent(helpseekcity.this, helpseek.class);

            intent.putExtra("state", state);
            intent.putExtra("city", city);
            intent.putExtra("uid", uid);
            //  intent.putExtra("User",user.getUid());

            FirebaseDatabase database2 = FirebaseDatabase.getInstance();
            DatabaseReference myRef2 = database2.getReference().child("users").child(uid).child("data").push();

            myRef2.setValue(dataMap);
            startActivity(intent);
            finish();
        }
        if(type.equals("helper"))
        {
            Intent intent = new Intent(helpseekcity.this, helper.class);
dataMap.put("Registerationstatus","Not registered");
            intent.putExtra("state", state);
            intent.putExtra("city", city);
            intent.putExtra("uid", uid);
            //  intent.putExtra("User",user.getUid());
            FirebaseDatabase database2 = FirebaseDatabase.getInstance();
            DatabaseReference myRef2 = database2.getReference().child("users").child(uid).child("data").push();
            myRef2.setValue(dataMap);
            startActivity(intent);
            finish();
        }
        }

    private void addcityWestBengal() {
        WestBengal.add("Please choose your city/कृपया अपना शहर चुनें।");
        WestBengal.add("Alipore");
        WestBengal.add("Alipur Duar");
        WestBengal.add("Asansol");
        WestBengal.add("Baharampur");
        WestBengal.add("Bally");
        WestBengal.add("Balurghat");
        WestBengal.add("Bankura");
        WestBengal.add("Baranagar");
        WestBengal.add("Barasat");
        WestBengal.add("Barrackpore");
        WestBengal.add("Basirhat");
        WestBengal.add("Bhatpara");
        WestBengal.add("Bishnupur");
        WestBengal.add("Budge Budge");
        WestBengal.add("Burdwan");
        WestBengal.add("handernagore");
        WestBengal.add("Darjiling");
        WestBengal.add("Diamond Harbour");
        WestBengal.add("Dum Dum");
        WestBengal.add("Durgapur");
        WestBengal.add("Halisahar");
        WestBengal.add("Haora");
        WestBengal.add("Hugli");
        WestBengal.add("Ingraj Bazar");
        WestBengal.add("Jalpaiguri");
        WestBengal.add("Kalimpong");
        WestBengal.add("Kamarhati");
        WestBengal.add("Kanchrapar");
        WestBengal.add("Kharagpur");
        WestBengal.add("Koch Bihar");
        WestBengal.add("Kolkata");
        WestBengal.add("Krishnanagar");
        WestBengal.add("Malda");
        WestBengal.add("Midnapore");
        WestBengal.add("Murshidabad");
        WestBengal.add("Navadwip");
        WestBengal.add("Palashi");
        WestBengal.add("Panihati");
        WestBengal.add("Purulia");
        WestBengal.add("Raiganj");
        WestBengal.add("Santipur");
        WestBengal.add("Shantiniketan");
        WestBengal.add("Shrirampur");
        WestBengal.add("Siliguri");
        WestBengal.add("Siuri");
        WestBengal.add("Tamluk");
        WestBengal.add("Titagarh");
    }

    private void addcityUttarPradesh() {
        UttarPradesh.add("Please choose your city/कृपया अपना शहर चुनें।");
        UttarPradesh.add("Agra");
        UttarPradesh.add("Aligarh");
        UttarPradesh.add("Amroha");
        UttarPradesh.add("Ayodhya");
        UttarPradesh.add("Azamgarh");
        UttarPradesh.add("Bahraich");
        UttarPradesh.add("Ballia");
        UttarPradesh.add("Banda");
        UttarPradesh.add("Bara Banki");
        UttarPradesh.add("Bareilly");
        UttarPradesh.add("Basti");
        UttarPradesh.add("Bijnor");
        UttarPradesh.add("Bithur");
        UttarPradesh.add("Budaun");
        UttarPradesh.add("Bulandshahr");
        UttarPradesh.add("Deoria");
        UttarPradesh.add("Etah");
        UttarPradesh.add("Etawah");
        UttarPradesh.add("Faizabad");
        UttarPradesh.add("Farrukhabad-cum-Fatehgarh");
        UttarPradesh.add("Fatehpur");
        UttarPradesh.add("Fatehpur Sikri");
        UttarPradesh.add("Ghaziabad");
        UttarPradesh.add("Ghazipur");
        UttarPradesh.add("Gonda");
        UttarPradesh.add("Gorakhpur");
        UttarPradesh.add("Hamirpur");
        UttarPradesh.add("Hardoi");
        UttarPradesh.add("Hathras");
        UttarPradesh.add("Jalaun");
        UttarPradesh.add("Jaunpur");
        UttarPradesh.add("Jhansi");
        UttarPradesh.add("Kannauj");
        UttarPradesh.add("Kanpur");
        UttarPradesh.add("Lakhimpur");
        UttarPradesh.add("Lalitpur");
        UttarPradesh.add("Lucknow");
        UttarPradesh.add("Mainpuri");
        UttarPradesh.add("Mathura");
        UttarPradesh.add("Meerut");
        UttarPradesh.add("Mirzapur-Vindhyachal");
        UttarPradesh.add("Moradabad");
        UttarPradesh.add("Muzaffarnagar");
        UttarPradesh.add("Partapgarh");
        UttarPradesh.add("Pilibhit");
        UttarPradesh.add("Prayagraj");
        UttarPradesh.add("Rae Bareli");
        UttarPradesh.add("Rampur");
        UttarPradesh.add("Saharanpur");
        UttarPradesh.add("Sambhal");
        UttarPradesh.add("Shahjahanpur");
        UttarPradesh.add("Sitapur");
        UttarPradesh.add("Sultanpur");
        UttarPradesh.add("Tehri");
        UttarPradesh.add("Varanasi");
    }

    private void addcityUttrakhand() {
        Uttrakhand.add("Please choose your city/कृपया अपना शहर चुनें।");
        Uttrakhand.add("Almora");
        Uttrakhand.add("Dehra Dun");
        Uttrakhand.add("Haridwar");
        Uttrakhand.add("Mussoorie");
        Uttrakhand.add("Nainital");
        Uttrakhand.add("Pithoragarh");

    }

    private void addcityTripura() {
        Tripura.add("Please choose your city/कृपया अपना शहर चुनें।");
        Tripura.add("Agartala");

    }

    private void addcityTelangna() {
        Telangna.add("Please choose your city/कृपया अपना शहर चुनें।");
        Telangna.add("Hyderabad");
        Telangna.add("Karimnagar");
        Telangna.add("Khammam");
        Telangna.add("Mahbubnagar");
        Telangna.add("Nizamabad");
        Telangna.add("Sangareddi");
        Telangna.add("Warangal");

    }

    private void addcityTamilNadu() {
        TamilNadu.add("Please choose your city/कृपया अपना शहर चुनें।");
        TamilNadu.add("Arcot");
        TamilNadu.add("Chengalpattu");
        TamilNadu.add("Chennai");
        TamilNadu.add("Chidambaram");
        TamilNadu.add("Coimbatore");
        TamilNadu.add("Cuddalore");
        TamilNadu.add("Dharmapuri");
        TamilNadu.add("Dindigul");
        TamilNadu.add("Erode");
        TamilNadu.add("Kanchipuram");
        TamilNadu.add("Kanniyakumari");
        TamilNadu.add("Kodaikanal");
        TamilNadu.add("Kumbakonam");
        TamilNadu.add("Madurai");
        TamilNadu.add("Mamallapuram");
        TamilNadu.add("Nagappattinam");
        TamilNadu.add("Nagercoil");
        TamilNadu.add("Palayankottai");
        TamilNadu.add("Pudukkottai");
        TamilNadu.add("Rajapalaiyam");
        TamilNadu.add("Ramanathapuram");
        TamilNadu.add("Salem");
        TamilNadu.add("Thanjavur");
        TamilNadu.add("Tiruchchirappalli");
        TamilNadu.add("Tirunelveli");
        TamilNadu.add("Tiruppur");
        TamilNadu.add("Tuticorin");
        TamilNadu.add("Udhagamandalam");
        TamilNadu.add("Vellore");
    }

    private void addcitySikkim() {
        Sikkim.add("Please choose your city/कृपया अपना शहर चुनें।");
        Sikkim.add("Gangtok");
        Sikkim.add("Gyalsing");
        Sikkim.add("Lachung");
        Sikkim.add("Mangan");
    }

    private void addcityRajasthan() {
        Rajasthan.add("Please choose your city/कृपया अपना शहर चुनें।");
        Rajasthan.add("Abu");
        Rajasthan.add("Ajmer");
        Rajasthan.add("Alwar");
        Rajasthan.add("Amer");
        Rajasthan.add("Barmer");
        Rajasthan.add("Beawar");
        Rajasthan.add("Bharatpur");
        Rajasthan.add("Bhilwara");
        Rajasthan.add("Bikaner");
        Rajasthan.add("Bundi");
        Rajasthan.add("Chittaurgarh");
        Rajasthan.add("Churu");
        Rajasthan.add("Dhaulpur");
        Rajasthan.add("Dungarpur");
        Rajasthan.add("Ganganagar");
        Rajasthan.add("Hanumangarh");
        Rajasthan.add("Jaipur");
        Rajasthan.add("Jaisalmer");
        Rajasthan.add("Jalor");
        Rajasthan.add("Jhalawar");
        Rajasthan.add("Jhunjhunu");
        Rajasthan.add("Jodhpur");
        Rajasthan.add("Kishangarh");
        Rajasthan.add("Kota");
        Rajasthan.add("Merta");
        Rajasthan.add("Nagaur");
        Rajasthan.add("Nathdwara");
        Rajasthan.add("Pali");
        Rajasthan.add("Phalodi");
        Rajasthan.add("Pushkar");
        Rajasthan.add("Sawai Madhopur");
        Rajasthan.add("Shahpura");
        Rajasthan.add("Sikar");
        Rajasthan.add("Sirohi");
        Rajasthan.add("Tonk");
        Rajasthan.add("Udaipur");
    }

    private void addcityPunjab() {
        Punjab.add("Please choose your city/कृपया अपना शहर चुनें।");
        Punjab.add("Amritsar");
        Punjab.add("Batala");
        Punjab.add("Chandigarh");
        Punjab.add("Faridkot");
        Punjab.add("Firozpur");
        Punjab.add("Gurdaspur");
        Punjab.add("Hoshiarpur");
        Punjab.add("Jalandhar");
        Punjab.add("Kapurthala");
        Punjab.add("Ludhiana");
        Punjab.add("Nabha");
        Punjab.add("Patiala");
        Punjab.add("Rupnagar");
        Punjab.add("Sangrur");
    }

    private void addcityOdisha() {
        Odisha.add("Please choose your city/कृपया अपना शहर चुनें।");
        Odisha.add("Balangir");
        Odisha.add("Baleshwar");
        Odisha.add("Baripada");
        Odisha.add("Bhubaneshwar");
        Odisha.add("Brahmapur");
        Odisha.add("Cuttack");
        Odisha.add("Dhenkanal");
        Odisha.add("Keonjhar");
        Odisha.add("Konark");
        Odisha.add("Koraput");
        Odisha.add("Paradip");
        Odisha.add("Phulabani");
        Odisha.add("Puri");
        Odisha.add("Sambalpur");
        Odisha.add("Udayagiri");
    }

    private void addcityNagaland() {
        Nagaland.add("Please choose your city/कृपया अपना शहर चुनें।");
        Nagaland.add("Kohima");
        Nagaland.add("Mon");
        Nagaland.add("Phek");
        Nagaland.add("Wokha");
        Nagaland.add("Zunheboto");
    }

    private void addcityMizoram() {
        Mizoram.add("Please choose your city/कृपया अपना शहर चुनें।");
        Mizoram.add("Aizawl");
        Mizoram.add("Lunglei");
    }

    private void addcityMeghalaya() {
        Meghalaya.add("Please choose your city/कृपया अपना शहर चुनें।");
        Meghalaya.add("Cherrapunji");
        Meghalaya.add("Shillong");
    }

    private void addcityManipur() {
        Manipur.add("Please choose your city/कृपया अपना शहर चुनें।");
        Manipur.add("Imphal");
    }

    private void addcityMaharashtra() {
        Maharashtra.add("Please choose your city/कृपया अपना शहर चुनें।");
        Maharashtra.add("Ahmadnagar");
        Maharashtra.add("Akola");
        Maharashtra.add("Amravati");
        Maharashtra.add("Aurangabad");
        Maharashtra.add("Bhandara");
        Maharashtra.add("Bhusawal");
        Maharashtra.add("Bid");
        Maharashtra.add("Buldana");
        Maharashtra.add("Chandrapur");
        Maharashtra.add("Daulatabad");
        Maharashtra.add("Dhule");
        Maharashtra.add("Jalgaon");
        Maharashtra.add("Kalyan");
        Maharashtra.add("Karli");
        Maharashtra.add("Kolhapur");
        Maharashtra.add("Mahabaleshwar");
        Maharashtra.add("Malegaon");
        Maharashtra.add("Matheran");
        Maharashtra.add("Mumbai");
        Maharashtra.add("Nagpur");
        Maharashtra.add("Nanded");
        Maharashtra.add("Nashik");
        Maharashtra.add("Osmanabad");
        Maharashtra.add("Pandharpur");
        Maharashtra.add("Parbhani");
        Maharashtra.add("Pune");
        Maharashtra.add("Ratnagiri");
        Maharashtra.add("Sangli");
        Maharashtra.add("Satara");
        Maharashtra.add("Sevagram");
        Maharashtra.add("Solapur");
        Maharashtra.add("Thane");
        Maharashtra.add("Ulhasnagar");
        Maharashtra.add("Vasai-Virar");
        Maharashtra.add("Wardha");
        Maharashtra.add("Yavatmal");
    }

    private void addcityMadhyaPradesh() {
        MadhyaPradesh.add("Please choose your city/कृपया अपना शहर चुनें।");
        MadhyaPradesh.add("Balaghat");
        MadhyaPradesh.add("Barwani");
        MadhyaPradesh.add("Betul");
        MadhyaPradesh.add("Bharhut");
        MadhyaPradesh.add("Bhind");
        MadhyaPradesh.add("Bhojpur");
        MadhyaPradesh.add("Bhopal");
        MadhyaPradesh.add("Burhanpur");
        MadhyaPradesh.add("Chhatarpur");
        MadhyaPradesh.add("Chhindwara");
        MadhyaPradesh.add("Damoh");
        MadhyaPradesh.add("Datia");
        MadhyaPradesh.add("Dewas");
        MadhyaPradesh.add("Dhar");
        MadhyaPradesh.add("Guna");
        MadhyaPradesh.add("Gwalior");
        MadhyaPradesh.add("Hoshangabad");
        MadhyaPradesh.add("Indore");
        MadhyaPradesh.add("Itarsi");
        MadhyaPradesh.add("Jabalpur");
        MadhyaPradesh.add("Jhabua");
        MadhyaPradesh.add("Khajuraho");
        MadhyaPradesh.add("Khandwa");
        MadhyaPradesh.add("Khargon");
        MadhyaPradesh.add("Maheshwar");
        MadhyaPradesh.add("Mandla");
        MadhyaPradesh.add("Mandsaur");
        MadhyaPradesh.add("Mhow");
        MadhyaPradesh.add("Morena");
        MadhyaPradesh.add("Murwara");
        MadhyaPradesh.add("Narsimhapur");
        MadhyaPradesh.add("Narsinghgarh");
        MadhyaPradesh.add("Narwar");
        MadhyaPradesh.add("Neemuch");
        MadhyaPradesh.add("Nowgong");
        MadhyaPradesh.add("Orchha");
        MadhyaPradesh.add("Panna");
        MadhyaPradesh.add("Raisen");
        MadhyaPradesh.add("Rajgarh");
        MadhyaPradesh.add("Ratlam");
        MadhyaPradesh.add("Rewa");
        MadhyaPradesh.add("Sagar");
        MadhyaPradesh.add("Sarangpur");
        MadhyaPradesh.add("Satna");
        MadhyaPradesh.add("Sehore");
        MadhyaPradesh.add("Seoni");
        MadhyaPradesh.add("Shahdol");
        MadhyaPradesh.add("Shajapur");
        MadhyaPradesh.add("Sheopur");
        MadhyaPradesh.add("Shivpuri");
        MadhyaPradesh.add("Ujjain");
        MadhyaPradesh.add("Vidisha");
    }

    private void addcityKerla() {
        Kerla.add("Please choose your city/कृपया अपना शहर चुनें।");

        Kerla.add("Alappuzha");
        Kerla.add("Badagara");
        Kerla.add("Idukki");
        Kerla.add("Kannur");
        Kerla.add("Kochi");
        Kerla.add("Kollam");
        Kerla.add("Kottayam");
        Kerla.add("Kozhikode");
        Kerla.add("Mattancheri");
        Kerla.add("Palakkad");
        Kerla.add("Thalassery");
        Kerla.add("Thiruvananthapuram");
        Kerla.add("Thrissur");
    }

    private void addcityKarnataka() {
        Karnataka.add("Please choose your city/कृपया अपना शहर चुनें।");
        Karnataka.add("Badami");
        Karnataka.add("Ballari");
        Karnataka.add("Bangalore");
        Karnataka.add("Belgavi");
        Karnataka.add("Bhadravati");
        Karnataka.add("Bidar");
        Karnataka.add("Chikkamagaluru");
        Karnataka.add("Chitradurga");
        Karnataka.add("Davangere");
        Karnataka.add("Halebid");
        Karnataka.add("Hassan");
        Karnataka.add("Hubballi-Dharwad");
        Karnataka.add("Kalaburagi");
        Karnataka.add("Kolar");
        Karnataka.add("Madikeri");
        Karnataka.add("Mandya");
        Karnataka.add("Mangaluru");
        Karnataka.add("Mysuru");
        Karnataka.add("Raichur");
        Karnataka.add("Shivamogga");
        Karnataka.add("Shravanabelagola");
        Karnataka.add("Shrirangapattana");
        Karnataka.add("Tumkuru");
    }

    private void addcityJharkhand() {
        Jharkhand.add("Please choose your city/कृपया अपना शहर चुनें।");
        Jharkhand.add("Bokaro");
        Jharkhand.add("Chaibasa");
        Jharkhand.add("Deoghar");
        Jharkhand.add("Dhanbad");
        Jharkhand.add("Dumka");
        Jharkhand.add("Giridih");
        Jharkhand.add("Hazaribag");
        Jharkhand.add("Jamshedpur");
        Jharkhand.add("Jharia");
        Jharkhand.add("Rajmahal");
        Jharkhand.add("Ranchi");
        Jharkhand.add("Saraikela");
    }

    private void addcityJammuandkashmir() {
        Jammuandkashmir.add("Please choose your city/कृपया अपना शहर चुनें।");
        Jammuandkashmir.add("Anantnag");
        Jammuandkashmir.add("Baramula");
        Jammuandkashmir.add("Doda");
        Jammuandkashmir.add("Gulmarg");
        Jammuandkashmir.add("Jammu");
        Jammuandkashmir.add("Kathua");
        Jammuandkashmir.add("Leh");
        Jammuandkashmir.add("Punch");
        Jammuandkashmir.add("Rajauri");
        Jammuandkashmir.add("Srinagar");
        Jammuandkashmir.add("Udhampur");
    }

    private void addcityHimachaPradesh() {
        HimachalPradesh.add("Please choose your city/कृपया अपना शहर चुनें।");
        HimachalPradesh.add("Bilaspur");
        HimachalPradesh.add("Chamba");
        HimachalPradesh.add("Dalhousie");
        HimachalPradesh.add("Dharmshala");
        HimachalPradesh.add("Hamirpur");
        HimachalPradesh.add("Kangra");
        HimachalPradesh.add("Kullu");
        HimachalPradesh.add("Mandi");
        HimachalPradesh.add("Nahan");
        HimachalPradesh.add("Shimla");
        HimachalPradesh.add("Una");
    }

    private void addcityHaryana() {
        Haryana.add("Please choose your city/कृपया अपना शहर चुनें।");
        Haryana.add("Ambala");
        Haryana.add("Bhiwani");
        Haryana.add("Chandigarh");
        Haryana.add("Faridabad");
        Haryana.add("Firozpur Jhirka");
        Haryana.add("Gurgaon");
        Haryana.add("Hansi");
        Haryana.add("Hisar");
        Haryana.add("Jind");
        Haryana.add("Kaithal");
        Haryana.add("Karnal");
        Haryana.add("Kurukshetra");
        Haryana.add("Panipat");
        Haryana.add("Pehowa");
        Haryana.add("Rewari");
        Haryana.add("Rohtak");
        Haryana.add("Sirsa");
        Haryana.add("Sonipat");
    }

    private void addcityGujrat() {
        Gujrat.add("Please choose your city/कृपया अपना शहर चुनें।");
        Gujrat.add("Ahmadabad");
        Gujrat.add("Amreli");
        Gujrat.add("Bharuch");
        Gujrat.add("Bhavnagar");
        Gujrat.add("Bhuj");
        Gujrat.add("Dwarka");
        Gujrat.add("Gandhinagar");
        Gujrat.add("Godhra");
        Gujrat.add("Jamnagar");
        Gujrat.add("Junagadh");
        Gujrat.add("Kandla");
        Gujrat.add("Khambhat");
        Gujrat.add("Kheda");
        Gujrat.add("Mahesana");
        Gujrat.add("Morvi");
        Gujrat.add("Nadiad");
        Gujrat.add("Navsari");
        Gujrat.add("Okha");
        Gujrat.add("Palanpur");
        Gujrat.add("Patan");
        Gujrat.add("Porbandar");
        Gujrat.add("Rajkot");
        Gujrat.add("Surat");
        Gujrat.add("Surendranagar");
        Gujrat.add("Valsad");
        Gujrat.add("Veraval");
    }

    private void addcityGoa() {
        Goa.add("Please choose your city/कृपया अपना शहर चुनें।");
        Goa.add("Madagaon");
        Goa.add("Panaji");
    }

    private void addcityChattisgarh() {
        Chattisgarh.add("Please choose your city/कृपया अपना शहर चुनें।");
        Chattisgarh.add("Ambikapur");
        Chattisgarh.add("Bhilai");
        Chattisgarh.add("Bilaspur");
        Chattisgarh.add("Dhamtari");
        Chattisgarh.add("Durg");
        Chattisgarh.add("Jagdalpur");
        Chattisgarh.add("Raipur");
        Chattisgarh.add("Rajnandgaon");
    }

    private void addcityBihar() {
        Bihar.add("Please choose your city/कृपया अपना शहर चुनें।");
        Bihar.add("Ara");
        Bihar.add("Baruni");
        Bihar.add("Begusarai");
        Bihar.add("Bettiah");
        Bihar.add("Bhagalpur");
        Bihar.add("Bihar Sharif");
        Bihar.add("Bodh Gaya");
        Bihar.add("Buxar");
        Bihar.add("Chapra");
        Bihar.add("Darbhanga");
        Bihar.add("Dehri");
        Bihar.add("Dinapur Nizamat");
        Bihar.add("Gaya");
        Bihar.add("Hajipur");
        Bihar.add("Jamalpur");
        Bihar.add("Katihar");
        Bihar.add("Madhubani");
        Bihar.add("Motihari");
        Bihar.add("Munger");
        Bihar.add("Muzaffarpur");
        Bihar.add("Patna");
        Bihar.add("Purnia");
        Bihar.add("Pusa");
        Bihar.add("Saharsa");
        Bihar.add("Samastipur");
        Bihar.add("Sasaram");
        Bihar.add("Sitamarhi");
        Bihar.add("Siwan");
    }

    private void addcityAssam() {
        Assam.add("Please choose your city/कृपया अपना शहर चुनें।");
        Assam.add("Dhuburi");
        Assam.add("Dibrugarh");
        Assam.add("Dispur");
        Assam.add("Guwahati");
        Assam.add("Jorhat");
        Assam.add("Nagaon");
        Assam.add("Sibsagar");
        Assam.add("Silchar");
        Assam.add("Tezpur");
        Assam.add("Tinsukia");

    }

    private void addcityArunachalpradesh()
    {Arunachalpradesh.add("Please choose your city/कृपया अपना शहर चुनें।");
        Arunachalpradesh.add("Itanagar");
    }

    private void addcityAndhrapradesh() {
        AndhraPradesh.add("Please choose your city/कृपया अपना शहर चुनें।");
        AndhraPradesh.add("Adoni");
        AndhraPradesh.add("Amaravati");
        AndhraPradesh.add("Anantapur");
        AndhraPradesh.add("Chandragiri");
        AndhraPradesh.add("Chittoor");
        AndhraPradesh.add("Dowlaiswaram");
        AndhraPradesh.add("Eluru");
        AndhraPradesh.add("Guntur");
        AndhraPradesh.add("Kadapa");
        AndhraPradesh.add("Kakinada");
        AndhraPradesh.add("Kurnool");
        AndhraPradesh.add("Machilipatnam");
        AndhraPradesh.add("Nagarjunakoṇḍa");
        AndhraPradesh.add("Rajahmundry");
        AndhraPradesh.add("Srikakulam");
        AndhraPradesh.add("Tirupati");
        AndhraPradesh.add("Vijayawada");
        AndhraPradesh.add("Visakhapatnam");
        AndhraPradesh.add("Vizianagaram");
        AndhraPradesh.add("Yemmiganur");
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();
        item1=item;
        helpseekcitytextv.setText("You haved choosed "+item+" as your Current State"+
                " आपने  अपने  वर्तमान  राज्य  के  रूप  में "+item+" को चुना है")
        ;
        if(item.equals("Please choose your city/कृपया अपना शहर चुनें।"))
        {
            helpseekcitytextv.setVisibility(View.INVISIBLE);
            helpseekcitytextv2.setVisibility(View.INVISIBLE);
        }
        else
        {
            helpseekcitytextv.setVisibility(View.VISIBLE);
            helpseekcitytextv2.setVisibility(View.VISIBLE);
        }

        // Showing selected spinner item
      //  Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
    }

