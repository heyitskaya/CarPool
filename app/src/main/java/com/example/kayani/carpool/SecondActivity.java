package com.example.kayani.carpool;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/** select a location**/
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent= getIntent();
        TextView tv=(TextView)findViewById(R.id.textView3);
        Typeface face=Typeface.createFromAsset(getAssets(),"Lobster.ttf");
        tv.setTypeface(face);

    }
    public void goToThirdActivity(View view)
    {
        String passengerInfo="";
        Button bradleyButton= (Button) findViewById(R.id.bradleyButton);
        Button loganButton=(Button) findViewById(R.id.loganButton);
        switch(view.getId())
        {
            case R.id.bradleyButton:
                passengerInfo+="Bradley, ";
                PassengerData.setLocation("Bradley");
                break;
            case R.id.loganButton:
                passengerInfo+="Logan, ";
                PassengerData.setLocation("Logan");
                break;
        }
        //create the intent

        Log.d("location ", PassengerData.getLocation().toString());
        Intent secondIntent= new Intent(this,ThirdActivity.class);
        //start the intent
        startActivity(secondIntent);
    }

}
