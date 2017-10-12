package com.example.hidarah42.sekeranjang;

import android.content.Intent;
import android.support.v7.view.CollapsibleActionView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hidarah42 on 10/10/17.
 */

class RecyleHolder extends RecyclerView.ViewHolder{
    public ImageView Gambar;
    public TextView Deskripsi;

    public RecyleHolder(View itemView) {
        super(itemView);
        Gambar = (ImageView)itemView.findViewById(R.id.gambarnya);
        Deskripsi = (TextView)itemView.findViewById(R.id.deskripsinya);
    }

}

public class Recycleadapter extends RecyclerView.Adapter<RecyleHolder>{

    private List<Data> Listdata = new ArrayList<>();

    public Recycleadapter(List<Data>Listdata){
        this.Listdata = Listdata;
    }

    @Override
    public RecyleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemview = inflater.inflate(R.layout.item,parent,false);
        return  new RecyleHolder(itemview);
    }

    @Override
    public void onBindViewHolder(RecyleHolder holder, int position) {
        holder.Gambar.setImageResource(Listdata.get(position).getData_image());
        holder.Deskripsi.setText(Listdata.get(position).getData_deskripsi());
    }

    @Override
    public int getItemCount() {
        return Listdata.size();
    }
}
