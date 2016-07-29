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
public class Shopping extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturants);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create an array of locations
        ArrayList< Location> loc = new ArrayList<Location>();
        // For the display of shopping mall 3
        String description3 = getResources().getString(R.string.description3);
        String mallname3 = getResources().getString(R.string.mallname3);
        loc.add(new Location(description3, mallname3, R.drawable.shop3));
        // For the display of shopping mall 1
        String description1 = getResources().getString(R.string.description1);
        String mallname1 = getResources().getString(R.string.mallname1);
        loc.add(new Location(description1, mallname1, R.drawable.shop2));
        // For the display of shopping mall 2
        String description2 = getResources().getString(R.string.description2);
        String mallname2 = getResources().getString(R.string.mallname2);
        loc.add(new Location(description2, mallname2, R.drawable.shop3));
        LocationAdapter adapter = new LocationAdapter(this,loc);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
