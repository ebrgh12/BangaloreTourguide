package com.example.android.bangaloretourguide;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
public class Temples extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturants);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create an array of locations
        ArrayList< Location> loc = new ArrayList<Location>();
        //For temple 1
        String tempinfo1 = getResources().getString(R.string.tempinfo1);
        String temp1 = getResources().getString(R.string.temp1);
        loc.add(new Location(tempinfo1, temp1, R.drawable.temp1));
        // For temple 2
        String tempinfo2 = getResources().getString(R.string.tempinfo2);
        String temp2 = getResources().getString(R.string.temp2);
        loc.add(new Location(tempinfo2, temp2, R.drawable.temp3));
        // Display using java( Set the rootview)
        LocationAdapter adapter = new LocationAdapter(this,loc);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
