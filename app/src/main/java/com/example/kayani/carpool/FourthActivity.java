package com.example.kayani.carpool;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TimePicker;
@TargetApi(23)
/** for picking out a time**/
public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
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

        Intent intent=getIntent();
    }

    public void goToFifthActivity(View view){
        TimePicker timePicker= (TimePicker) findViewById(R.id.timePicker);
        PassengerData.setTime(timePicker.getHour());
        Log.d("hour chosen", Integer.toString(PassengerData.getTime()));
        Intent intent= new Intent(this,FifthActivity.class);
        startActivity(intent);
    }

}
