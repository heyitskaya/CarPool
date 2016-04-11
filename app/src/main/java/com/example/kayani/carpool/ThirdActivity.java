package com.example.kayani.carpool;
//import android.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;

import java.util.Calendar;


//right now this is only for people going to bradley
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

        DatePicker datePicker=(DatePicker) findViewById(R.id.datePicker);
       // datePicker.setMaxDate();
        int day= datePicker.getDayOfMonth();
        int month=datePicker.getMonth();
        int year=datePicker.getYear();

        System.out.println("day "+day);
        System.out.println("month "+month);
        System.out.println("year "+year);




    }
    public void goToFourthActivity(View view ){
        Intent thirdIntent= new Intent(this, FourthActivity.class);
        startActivity(thirdIntent);

    }


}
