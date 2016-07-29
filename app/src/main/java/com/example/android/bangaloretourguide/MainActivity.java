package com.example.android.bangaloretourguide;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button a1;
    Button a2;
    Button a3;
    Button a4;
    Intent intent1;
    Intent intent2;
    Intent intent3;
    Intent intent4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //This is the code for onclick of the Resturant button
        a1 = (Button) findViewById(R.id.restbutton);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                intent1 = new Intent(v.getContext(), Resturants.class);
                startActivity(intent1);
            }
        });
        // This is the equivalent code for onclick of the shopping
        a2 = (Button) findViewById(R.id.shopbutton);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                intent2 = new Intent(v.getContext(), Shopping.class);
                startActivity(intent2);
            }
        });
                //This is the code for onclick of the temple button
        a3 = (Button) findViewById(R.id.templebuttons);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                intent3 = new Intent(v.getContext(), Temples.class);
                startActivity(intent3);
            }
        });
        //This is the code for onclick of the transport button
        a4 = (Button) findViewById(R.id.transportbutton);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                intent4 = new Intent(v.getContext(), Transport.class);
                startActivity(intent4);
            }
        });
          }
}
