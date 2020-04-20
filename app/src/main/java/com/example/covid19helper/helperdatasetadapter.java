package com.example.covid19helper;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class helperdatasetadapter extends RecyclerView.Adapter<helperdatasetadapter.MyViewholder> {
    Context mContext;
    List<helperdataset> mData;

    public helperdatasetadapter(Context mContext, List<helperdataset> mData) {
        this.mContext = mContext;
        this.mData = mData;

    }

    @NonNull
    @Override
    public helperdatasetadapter.MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view= LayoutInflater.from(mContext).inflate(R.layout.helperrowlayout,parent,false);
        helperdatasetadapter.MyViewholder myViewholder=new helperdatasetadapter.MyViewholder(view);
        return myViewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull helperdatasetadapter.MyViewholder holder, final int position) {
        holder.problemtextv.setText(mData.get(position).getProblem());
        holder.addresstextv.setText(mData.get(position).getAddress());
        holder.phonetextv.setText(mData.get(position).getPhone());



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    public static class MyViewholder extends RecyclerView.ViewHolder{
        private TextView problemtextv,addresstextv,phonetextv;
       // private Button viewdetailsbtn;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            problemtextv=itemView.findViewById(R.id.problemtextv);
            addresstextv=itemView.findViewById(R.id.addresstextv);
            phonetextv=itemView.findViewById(R.id.phonetextv);



        }
    }
}
