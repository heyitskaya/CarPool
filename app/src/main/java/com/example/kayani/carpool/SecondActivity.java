package com.example.kayani.carpool;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

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
    }
    public void goToThirdActivity(View view)
    {
        Button bradleyButton= (Button) findViewById(R.id.bradleyButton);
        Button loganButton=(Button) findViewById(R.id.loganButton);
        switch(view.getId())
        {
            case R.id.bradleyButton:
                SaveData.WriteToFile("The location we are trying to go to is Bradley");
                PassengerData.setLocation("Bradley");
                break;
            case R.id.loganButton:
                SaveData.WriteToFile("The location we are trying to go to is Logan");
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
