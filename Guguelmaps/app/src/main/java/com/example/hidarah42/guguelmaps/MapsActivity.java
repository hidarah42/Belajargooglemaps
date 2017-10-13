package com.example.hidarah42.guguelmaps;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private String Datanya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                if(marker != null && marker.getTitle().equals("Depok")){
                    Datanya = "Depok";
                    Intent i = new Intent(MapsActivity.this,MainActivity.class);
                    i.putExtra("Datanya",Datanya);
                    startActivity(i);
                }

                if (marker != null && marker.getTitle().equals("Palembang")){
                    Datanya = "Palembang";
                    Intent i = new Intent(MapsActivity.this,MainActivity.class);
                    i.putExtra("Datanya",Datanya);
                    startActivity(i);
                }
                if (marker != null && marker.getTitle().equals("Jakarta")){
                    Datanya = "Jakarta";
                    Intent i = new Intent(MapsActivity.this,MainActivity.class);
                    i.putExtra("Datanya",Datanya);
                    startActivity(i);
                }
                if (marker != null && marker.getTitle().equals("Penang")){
                    Datanya = "Penang";
                    Intent i = new Intent(MapsActivity.this,MainActivity.class);
                    i.putExtra("Datanya",Datanya);
                    startActivity(i);
                }
                if (marker != null && marker.getTitle().equals("Zurich")){
                    Datanya = "Zurich";
                    Intent i = new Intent(MapsActivity.this,MainActivity.class);
                    i.putExtra("Datanya",Datanya);
                    startActivity(i);
                }
            }
        });


        //Palembang
        LatLng Palembang = new LatLng(-2.990934,104.756554);
        mMap.addMarker(new MarkerOptions().position(Palembang).title("Palembang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Palembang));

        //Jakarta
        LatLng Jakarta = new LatLng(-6.1751,106.8650);
        mMap.addMarker(new MarkerOptions().position(Jakarta).title("Jakarta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Jakarta));

        //Penang
        LatLng Penang = new LatLng(5.4163,100.3328);
        mMap.addMarker(new MarkerOptions().position(Penang).title("Penang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Penang));

        //Zurich
        LatLng Zurich = new LatLng(47.3769,8.5417);
        mMap.addMarker(new MarkerOptions().position(Zurich).title("Zurich"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Zurich));
    }
}
