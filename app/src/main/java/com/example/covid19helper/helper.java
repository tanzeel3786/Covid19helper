package com.example.covid19helper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class helper extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<helperdataset> helperDatasetList;
    private TextView helpertextv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper);
        helpertextv=findViewById(R.id.helpertextv);
        recyclerView=findViewById(R.id.helperrecyclerview);
        final String city=getIntent().getStringExtra("city");
        final String state=getIntent().getStringExtra("state");
        final String uid=getIntent().getStringExtra("uid");
        helperDatasetList=new ArrayList<>();

//Toast.makeText(helper.this,city,Toast.LENGTH_SHORT).show();
       // Toast.makeText(helper.this,state,Toast.LENGTH_SHORT).show();
       FirebaseDatabase.getInstance().getReference().child("helpseekersstate").child(state).child(city).addChildEventListener(new ChildEventListener() {
           @Override
           public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
               for(DataSnapshot snapshot:dataSnapshot.getChildren()) {
                   String address="Address :",phone="Phone :",problem="Problem :";
                   for (DataSnapshot snapshot1:snapshot.getChildren())
                   {    problem="Problem :"+(String) snapshot1.child("problem").getValue();
                        address ="Address :"+ (String) snapshot1.child("address").getValue();
                        phone ="Phone :"+ (String) snapshot1.child("name").getValue();

                   }
                   helpertextv.setText("Problems in "+city);
                   helperDatasetList.add(new helperdataset(problem, address, phone));
                   helperdatasetadapter helperdatasetadapter = new helperdatasetadapter(helper.this, helperDatasetList);
                   GridLayoutManager gridLayoutManager = new GridLayoutManager(helper.this, 1);
                   gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                   recyclerView.setLayoutManager(gridLayoutManager);
                   recyclerView.setAdapter(helperdatasetadapter);
                   helperdatasetadapter.notifyDataSetChanged();

                   Toast.makeText(helper.this, dataSnapshot.getChildrenCount() + "" +
                           "", Toast.LENGTH_LONG).show();

                   //  helperDatasetList.add(new helperdataset("big problem","new add","34455"));

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

//        String problem=(String) dataSnapshot1.child("problem").child("problem").getValue();
//        String address=(String) dataSnapshot1.child("problem").child("address").getValue();
//        String phone=(String) dataSnapshot1.child("problem").child("name").getValue();
//        Toast.makeText(helper.this,dataSnapshot.getChildrenCount()+"",Toast.LENGTH_SHORT).show();


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionsmenu2, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                startActivity(new Intent(this, aboutapp.class));
                return true;
            case R.id.govthelplinenos:
                Intent intent=new Intent(helper.this,govthelplinenumbers.class);
                intent.putExtra("state",getIntent().getStringExtra("state"));
                startActivity(intent);
                return true;
            case R.id.becomeauthenticatedhelper:
                Intent intent1=new Intent(this,authenticatedhelpers.class);
                intent1.putExtra("state",getIntent().getStringExtra("state"));
                intent1.putExtra("city",getIntent().getStringExtra("city"));
                intent1.putExtra("uid",getIntent().getStringExtra("uid"));

                startActivity(intent1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
//respond to menu item selection
    }
      //  helperDatasetList.add(new helperdataset("big problem","new add","34455"));

    }

