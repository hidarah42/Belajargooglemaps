package com.example.hidarah42.sekeranjang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Sekeranjang extends AppCompatActivity {

    //variabel global
    private RecyclerView RV;
    private Recycleadapter RA;
    private RecyclerView.LayoutManager RL;
    private List<Data> listdata = new ArrayList<Data>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sekeranjang);

        //RV
        RV = (RecyclerView)findViewById(R.id.recyclenya);
        RV.setHasFixedSize(true);

        //RL
        RL = new LinearLayoutManager(this);
        RV.setLayoutManager(RL);

        //RA
        RA = new Recycleadapter(listdata);
        RV.setAdapter(RA);

        Data();
    }

    private void Data(){
        listdata.add(new Data (R.drawable.adroid,"Android"));
        listdata.add(new Data (R.drawable.iosicon,"Swift"));
        listdata.add(new Data (R.drawable.java,"Java"));
        listdata.add(new Data (R.drawable.tizenicon,"Tizen"));
        listdata.add(new Data (R.drawable.web,"Web"));

    }
}
