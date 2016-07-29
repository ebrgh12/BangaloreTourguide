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
public class Transport extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturants);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create an array of locations
        ArrayList< Location> loc = new ArrayList<Location>();
        //For resturant 1
        String transpinfo1 = getResources().getString(R.string.transpinfo1);
        String transp1 = getResources().getString(R.string.transp1);
        loc.add(new Location(transpinfo1, transp1));
        // Display using java( Set the rootview)
        LocationAdapter adapter = new LocationAdapter(this,loc);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
