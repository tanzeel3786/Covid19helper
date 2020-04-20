package com.example.covid19helper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class govthelplinenumbers extends AppCompatActivity {
private ListView govtlistview;
private List<String> numberlist;
private TextView govttextv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_govthelplinenumbers);
        String state=getIntent().getStringExtra("state");
        govttextv=findViewById(R.id.govttextv);
        numberlist=new ArrayList<>();
        Toast.makeText(govthelplinenumbers.this,getIntent().getStringExtra("state"),Toast.LENGTH_SHORT).show();
        govtlistview=findViewById(R.id.govtlistview);
        if(state.equals("Bihar/ बिहार"))
        {govttextv.setText("Helpline number for "+state+" State");
            addbiharnumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Andhra Pradesh/आंध्र प्रदेश"))
        {govttextv.setText("Helpline number for "+state+" State");
            addAndhrapradeshnumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Arunachal Pradesh/अरुणाचल प्रदेश"))
        {govttextv.setText("Helpline number for "+state+" State");
            addArunachlPradeshnumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Assam/असम"))
        {govttextv.setText("Helpline number for "+state+" State");
            addAssamnumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Chhattisgarh/छत्तीसगढ़"))
        {govttextv.setText("Helpline number for "+state+" State");
            addChattisgarhnumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Goa/ गोवा"))
        {govttextv.setText("Helpline number for "+state+" State");
            addGoanumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Gujrat/गुजरात"))
        {govttextv.setText("Helpline number for "+state+" State");
            addGujratnumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Haryana/हरियाणा"))
        {govttextv.setText("Helpline number for "+state+" State");
            addHaryananumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("New Delhi/नई दिल्ली"))
        {govttextv.setText("Helpline number for "+state+" State");
            addDelhinumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Himachal Pradesh/हिमाचल प्रदेश"))
        {govttextv.setText("Helpline number for "+state+" State");
            addHimachalPradeshnumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Jammu and Kashmir/जम्मू और कश्मीर"))
        {govttextv.setText("Helpline number for "+state+" State");
            addJammuandkashmirnumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Jharkhand/झारखंड"))
        {govttextv.setText("Helpline number for "+state+" State");
            addJharkhandnumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Karnataka/कर्नाटक"))
        {govttextv.setText("Helpline number for "+state+" State");
            addKarnatakanumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Kerla/केरल"))
        {govttextv.setText("Helpline number for "+state+" State");
            addkerlanumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Madhya Pradesh/मध्य प्रदेश"))
        {govttextv.setText("Helpline number for "+state+" State");
            addMadhyaPradeshnumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Maharashtra/महाराष्ट्र"))
        {govttextv.setText("Helpline number for "+state+" State");
            addMaharashtraumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Manipur/मणिपुर"))
        {govttextv.setText("Helpline number for "+state+" State");
            addManipurumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Meghalaya/मेघालय"))
        {govttextv.setText("Helpline number for "+state+" State");
            addMeghalayanumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Mizoram/मिजोरम"))
        {govttextv.setText("Helpline number for "+state+" State");
            addMizoramnumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Nagaland/नगालैंड"))
        {govttextv.setText("Helpline number for "+state+" State");
            addNagalandnaumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Odisha/ओडिशा"))
        {govttextv.setText("Helpline number for "+state+" State");
            addOdishanaumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Punjab/पंजाब"))
        {govttextv.setText("Helpline number for "+state+" State");
            addPunjabnaumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Rajasthan/राजस्थान"))
        {govttextv.setText("Helpline number for "+state+" State");
            addRajasthannaumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Sikkim/सिक्किम"))
        {govttextv.setText("Helpline number for "+state+" State");
            addSikkimnaumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Tamil Nadu/तमिलनाडु"))
        {govttextv.setText("Helpline number for "+state+" State");
            addTamilNadunaumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Telangna/तेलंगाना"))
        {govttextv.setText("Helpline number for "+state+" State");
            addTelangananaumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Tripura/त्रिपुरा"))
        {govttextv.setText("Helpline number for "+state+" State");
            addTripuranaumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Uttrakhand/उत्तराखंड"))
        {govttextv.setText("Helpline number for "+state+" State");
            addUttrakhandnaumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("Utar Pradesh/उत्तर प्रदेश"))
        {govttextv.setText("Helpline number for "+state+" State");
            addUttrpradeshnaumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
        if(state.equals("West Bengal/पश्चिम बंगाल"))
        {govttextv.setText("Helpline number for "+state+" State");
            addwestbengalnaumber();
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(govthelplinenumbers.this,android.R.layout.simple_list_item_1,numberlist);
            govtlistview.setAdapter(adapter);
        }
    }

    private void addwestbengalnaumber() {
        numberlist.add("Helpline Number :033-23571085");
        numberlist.add("Helpline Number :03323571083");
        numberlist.add("Helpline Number :03323573636");
    }


    private void addUttrpradeshnaumber() {
        numberlist.add("Helpline Number :9415467934");
    }

    private void addUttrakhandnaumber() {
        numberlist.add("Almora Mr Manoj Panday - 9412436406");
        numberlist.add("Bageshwar - Mr Hemant Kumar - 7248776718");
        numberlist.add("Chamoli - Dr Uma Rawat - 9410134056");
        numberlist.add("Champawat - Dr RP Khanduri - 9412975537");
        numberlist.add("Dehradun - Dr NK Tyagi - 6397143634");
        numberlist.add("Haridwar - Dr Komal - 8178050442");
        numberlist.add("Nainital - Dr Ajay Sharma - 9412120155");
        numberlist.add("Pauri Garhwal - Dr Ashish Gusain - 9456615079");
        numberlist.add("Pithoragarh - Dr Usha Gunkayal - 9837992600");
        numberlist.add("Rudraprayag - Dr JS Negi - 7534902802");
        numberlist.add("Tehri Garhwal - Dr Meenu Rawat - NA");
        numberlist.add("Uddham Singh Nagar - Dr DK Joshi - 94124392999");
        numberlist.add("Uttarkashi - Dr CS Rawat - 8650670770");
        
    }

    private void addTripuranaumber() {
        numberlist.add("Helpline Number :0381-2416045");

    }


    private void addTelangananaumber() {
        numberlist.add("Helpline Number :23450624");
        numberlist.add("Helpline Number :040-23450735");

    }

    private void addTamilNadunaumber() {
        numberlist.add("Helpline Number :044 25671383");
        numberlist.add("Helpline Number :044 256 71764");

    }

    private void addSikkimnaumber() {
        numberlist.add("District Control Room ( East) - 204995");
        numberlist.add("District Control Room (South)- 264442/263722");
        numberlist.add("District Control Room ( West)- 250999/250633");
        numberlist.add("District Control Room ( North)- 234538");

    }

    private void addRajasthannaumber() {
        numberlist.add("Helpline Number :0141-2225624");
    }

    private void addPunjabnaumber() {
        numberlist.add("Helpline Number :0172-2710116");
        numberlist.add("Helpline Number :0172- 2720153");
    }

    private void addOdishanaumber() {
        numberlist.add("Helpline Number :0674-2392115");

    }

    private void addNagalandnaumber(){
        numberlist.add("Helpline Number :7005435243");
        numberlist.add("Helpline Number :9856071745");
        numberlist.add("Helpline Number :7005539653");
        numberlist.add("Helpline Number :1070");

    }

    private void addMizoramnumber() {
        numberlist.add("Helpline Number :102");
        numberlist.add("Helpline Number :0389-2323336");
        numberlist.add("Helpline Number :2318336");
    }

    private void addMeghalayanumber() {
        numberlist.add("State Surveillance Unit 9366090748");
        numberlist.add("East Khasi Hills 7085281316");
        numberlist.add("West Khasi Hills & South West Khasi Hills 9485395373");
        numberlist.add("West Jaintia Hills & East Jaintia Hills 6009693315");
        numberlist.add("West Garo Hills & South West Garo Hills 9864939334");
        numberlist.add("Ri Bhoi 8787520449");
        numberlist.add("East Garo Hills & North Garo Hills 9485113132");
        numberlist.add("South Garo Hills 7085100406");
    }

    private void addManipurumber() {
        numberlist.add("Helpline Number :1800 345 3818");
    }

    private void addMaharashtraumber() {
        numberlist.add("Helpline Number: 020-26127394");
    }

    private void addMadhyaPradeshnumber() {
        numberlist.add("Helpline Number :0755-2527177");
    }

    private void addkerlanumber() {
        numberlist.add("Helpline Number :9846100100");
    }

    private void addKarnatakanumber() {
        numberlist.add("Helpline Number :104");
        numberlist.add("Helpline Number :08046848600");
        numberlist.add("Helpline Number :08066692000");
    }

    private void addJharkhandnumber() {
        numberlist.add("Helpline Numbers: 06512261000");
        numberlist.add("Helpline Numbers: 06512261002");
        numberlist.add("Helpline Numbers: 9955837425");
    }

    private void addJammuandkashmirnumber() {
        numberlist.add("Jammu :01912520982");
        numberlist.add("Kashmir 0194-2440283");

    }

    private void addHimachalPradeshnumber() {
        numberlist.add("Helpline Number :104");
    }

    private void addDelhinumber() {
        numberlist.add("Helpline Number :1031");
    }

    private void addHaryananumber() {
        numberlist.add("Ambala - DCR - 108,LL - 01712550580,01712530400; Mobile - 7496854623, 9729179275");
        numberlist.add("Bhiwani - DCR - 108; LL - 01664242110;Charkhi Dadri - DCR - 1950; LL - 01250222555;");
        numberlist.add("Faridabad - DCR - 1950; LL - 01292221000, 2298500;");
        numberlist.add("Fatehabad - DCR -01667230018; LL - 230201, 230442");
        numberlist.add("Gurugram - DCR - 1950, 108 (Ambulance); LL - 01242322412; Mobile - 9953618102");
        numberlist.add("Hisar - DCR - 1950; LL - 01662231137; Mobile - 7027830252");
        numberlist.add("Jhajjar - DCR - 01251253118;");
        numberlist.add("Jind - DCR - 01681245206");
        numberlist.add("Kaithal - DCR - 01746224235, 224240; Mobile - 9896317010, 9996937500");
        numberlist.add("Karnal - DCR - 01842272201; Mobile - 9817701572");
        numberlist.add("Kurukshetra - DCR - 01744259285; LL - 220271, 220270, 227777; Mobile - 7027854102");
        numberlist.add("Mahendargarh - DCR - 01282251202, 250391; Mobile - 930675476");
        numberlist.add("Mewat/Nuh - DCR - 1950; LL - 01267274600; Mobile - 9254333102, 7027855102");
        numberlist.add("Palwal - DCR - 01275298052, 01275240022; LL - 248901");
        numberlist.add("Panchkula - DCR - 108; LL - 01722573901, 2590000 ");
        numberlist.add("Panipat - DCR - 0180264255, 108; Mobile - 7029826981 (Fleet Manager), 9813103036 (District Nodal Officer)");
        numberlist.add("Rewari - DCR - 01274225145");
        numberlist.add("Rohtak - DCR - 01262244163, 01262281031; Mobile - 9463090380, 7027816559");
        numberlist.add("Sirsa - DCR - 01666248882; Mobile - 9812300947");
        numberlist.add("Sonipat - DCR - 01302231932, 2221500, 2218407;");
        numberlist.add("Yamunanagar - DCR - 01732237801; Mobile - 7027972089");
    }

    private void addGujratnumber() {
        numberlist.add("Helpline Number :1070");
        numberlist.add("Helpline Number : 51900");
    }

    private void addGoanumber() {
        numberlist.add("8322794100- North Goa");
        numberlist.add("8322225083- South Goa");
    }

    private void addChattisgarhnumber() {
        numberlist.add("Number :104");
        numberlist.add("Raipur helpline 100, 07714287199, 9479191099");
    }

    private void addAssamnumber() {
        numberlist.add("Phone Number :+91-11-23978043");
        numberlist.add("Phone Number :0866-2410978");

    }

    private void addArunachlPradeshnumber() {
        numberlist.add("Phone Number :0360-2292725");
    }

    private void addAndhrapradeshnumber() {
        numberlist.add("Phone Number :6913347770");
    }

    private void addbiharnumber() {
        numberlist.add("Landline Number :06312222253");
        numberlist.add("Landline Number :06312222259");
        numberlist.add("WhatsappNumber :8987277860");

    }
}
