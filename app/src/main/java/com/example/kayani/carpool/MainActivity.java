package com.example.kayani.carpool;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText phoneNumber;
    public EditText name;
    public Button enterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        phoneNumber=(EditText)findViewById(R.id.phoneNumber);
        name=(EditText)findViewById(R.id.name);
        enterButton=(Button)findViewById(R.id.enterInfo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void goToSecondActivity(View view)
    {
        String number=phoneNumber.getText().toString();
        String userName=name.getText().toString();

        Log.d("number",number);
        Log.d("userName",userName);
        String sms="haha, try to send this";
        try{
            Log.d("did it send", "lolololol");

            SmsManager smsManager= SmsManager.getDefault();
            smsManager.sendTextMessage(number,null,sms,null,null);

        /**    Intent sendIntent= new Intent(Intent.ACTION_VIEW);
            sendIntent.putExtra("sms_body",sms);
            sendIntent.setType("vnd.android-dir/mms-sms");
            startActivity(sendIntent); **/
            Log.d("blah","kaya");



        }
        catch(Exception e){
            e.printStackTrace();
        }



        Intent intent= new Intent(this,SecondActivity.class);

        startActivity(intent);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
