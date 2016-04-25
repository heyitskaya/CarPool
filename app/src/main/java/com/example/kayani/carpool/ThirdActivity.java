package com.example.kayani.carpool;
//import android.app.DialogFragment;

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
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;


//day of flight
public class ThirdActivity extends AppCompatActivity {
    Calendar calender=Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
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
        Intent secondIntent=getIntent();

    /**    DatePicker datePicker=(DatePicker) findViewById(R.id.datePicker);
       // datePicker.setMaxDate();
        int day= datePicker.getDayOfMonth();
        Log.d("The day of month is ",Integer.toString(day));

        PassengerData.setDay(day);

        int month=datePicker.getMonth();
        int year=datePicker.getYear();



        System.out.println("month "+month);
        System.out.println("year "+year); **/
        DatePicker datePicker=(DatePicker) findViewById(R.id.datePicker);
        PassengerData.setCurrentDay(datePicker.getDayOfMonth());
        Log.d("currentDay is ",Integer.toString(PassengerData.getCurrentDay()));
        TextView tv=(TextView)findViewById(R.id.textView4);
        Typeface face=Typeface.createFromAsset(getAssets(),"Lobster.ttf");
        tv.setTypeface(face);
        Button enterButton= (Button) findViewById(R.id.dayEnterButton);
        enterButton.setTypeface(Typeface.createFromAsset(getAssets(),"Lobster.ttf"));





    }
    public void goToFourthActivity(View view ){
        DatePicker datePicker=(DatePicker) findViewById(R.id.datePicker);
        int day=datePicker.getDayOfMonth();
        PassengerData.setDay(day);

        // I think it is picking the right date here
        Log.d("day kkkkkk", Integer.toString(PassengerData.getDay()));
        Intent thirdIntent= new Intent(this, FourthActivity.class);
        startActivity(thirdIntent);

    }


}
