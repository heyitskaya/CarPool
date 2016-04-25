package com.example.kayani.carpool;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

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

        TextView tv=(TextView)findViewById(R.id.textView);
        Typeface face=Typeface.createFromAsset(getAssets(),"Lobster.ttf");
        tv.setTypeface(face);

        TextView tv2=(TextView)findViewById(R.id.textView2);
        Typeface face2=Typeface.createFromAsset(getAssets(),"Lobster.ttf");
        tv2.setTypeface(face);
        enterButton=(Button)findViewById(R.id.enterInfo);
        enterButton.setTypeface(Typeface.createFromAsset(getAssets(),"Lobster.ttf"));
      //  writeToFile();
        Log.d("in onCreate()","");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void writeToFile(){
        Log.d("trying to write stuff","");
        String filename = "fuckoff";
        String string = "Hello world!";
        FileOutputStream outputStream;
        try {
            Log.d("In try","");
            outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(string.getBytes());
            outputStream.close();
        } catch (Exception e) {
            Log.d("In catch","");
            Log.d("Exception was found ","");
            e.printStackTrace();
        }
    }

    public void goToSecondActivity(View view)
    {

        String number=phoneNumber.getText().toString();
        String userName=name.getText().toString();
        String message="Kaya is the best";
        Log.d("number",number);
        Log.d("userName",userName);
        try{
            FileOutputStream fou= openFileOutput("zico.txt",MODE_WORLD_READABLE);
            OutputStreamWriter osw= new OutputStreamWriter(fou);
            try{
                osw.write(message);
                osw.flush();
                osw.close();
                Toast.makeText(getBaseContext(),"data saved",Toast.LENGTH_LONG).show();

            }
            catch(Exception e){

                e.printStackTrace();
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        //String sms="haha, try to send this";
       /**try{
            Log.d("did it send", "lolololol");

            SmsManager smsManager= SmsManager.getDefault();
            smsManager.sendTextMessage(number,null,sms,null,null);


            Log.d("blah","kaya");



        }
        catch(Exception e){
            e.printStackTrace();
        }  **/
        writeToFile();



        Intent intent= new Intent(this,SecondActivity.class);

        startActivity(intent);
    }

    public void readFile(){

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
