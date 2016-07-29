package com.example.android.bangaloretourguide;
import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
    /**
     * Created by giris on 7/15/2016.
     */
    public class LocationAdapter extends ArrayAdapter<Location> {
        public LocationAdapter(Activity context, ArrayList<Location> loc) {
            // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
            // the second argument is used when the ArrayAdapter is populating a single TextView.
            // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
            // going to use this second argument, so it can be any value. Here, we used 0.
            super(context, 0, loc);
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            }
            // Get the  object located at this position in the list
            Location locationobject = getItem(position);
            // Find the TextView in the list_item.xml layout with the ID version_name
            TextView locTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
            // Get the version name from the current  object and
            // set this text on the name TextView
            locTextView.setText(locationobject.getDefaultdetails());
            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
            // Get the version number from the current  object and
            // set this text on the number TextView
            defaultTextView.setText(locationobject.getDefaultlocation());
            // Find the ImageView in the list_item.xml layout with the ID list_item_icon
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
            // Get the image resource ID from the current  object and
            // set the image to iconView
            // Check if an image is provided for this word or not
            if (locationobject.hasImage()) {
                // If an image is available, display the provided image based on the resource ID
                imageView.setImageResource(locationobject.getmImageResourceId());
                // Make sure the view is visible
                imageView.setVisibility(View.VISIBLE);
            } else {
                // Otherwise hide the ImageView (set visibility to GONE)
                imageView.setVisibility(View.GONE);
            }
            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView
            return listItemView;
        }
    }
