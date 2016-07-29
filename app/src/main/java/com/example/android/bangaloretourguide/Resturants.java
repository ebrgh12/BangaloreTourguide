package com.example.android.bangaloretourguide;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.ArrayList;
public class Resturants extends AppCompatActivity {
            @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_resturants);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            // Create an array of locations
            ArrayList< Location> loc = new ArrayList<Location>();
                //For resturant 1
                String restinfo1 = getResources().getString(R.string.restinfo1);
                String restname1 = getResources().getString(R.string.rest1);
                loc.add(new Location(restinfo1, restname1, R.drawable.res1));
                // For resturant 2
                String restinfo2 = getResources().getString(R.string.restinfo2);
                String restname2 = getResources().getString(R.string.rest2);
                loc.add(new Location(restinfo2, restname2, R.drawable.res3));
                // For resturant 3
                String restinfo3 = getResources().getString(R.string.restinfo3);
                String restname3 = getResources().getString(R.string.rest3);
                loc.add(new Location(restinfo3, restname3, R.drawable.res2));
             // Display using java( Set the rootview)
            LocationAdapter adapter = new LocationAdapter(this,loc);
            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(adapter);
        }
    }
