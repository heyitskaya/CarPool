package com.example.kayani.carpool;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.io.FileOutputStream;

//import java

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
        TextView tv=(TextView)findViewById(R.id.textView5);
        Typeface face=Typeface.createFromAsset(getAssets(),"Lobster.ttf");
        tv.setTypeface(face);
       // Log.d("writeToFile ","trying to write to a file");
      //  writeToFile();

    }

    public void goToFifthActivity(View view){

        Passenger currentPassenger= new Passenger(PassengerData.getLocation(),PassengerData.getDay(), PassengerData.getTime());

        TimePicker timePicker= (TimePicker) findViewById(R.id.timePicker);
        PassengerData.setTime(timePicker.getHour());
        Log.d("time of departure ",Integer.toString(PassengerData.getTime()));

        FindRide findRide= new FindRide(currentPassenger);
        Log.d("do you have a ride",String.valueOf(findRide.existsRide()));

        if(findRide.existsRide()){
           

            Intent intent= new Intent(this,FifthActivity.class);
            startActivity(intent);
        }

      //  SaveData.writeToFile("lololol, try to write this");
      /**  else{
            Intent intent= new Intent(this,RideNotFound.class);
            startActivity(intent);
            Log.d("No ride to be found","No ride to be found");
        } **/




    }

    public void writeToFile(){
        //from android studio
        /**   String filename="kayalolz";
         File file= new File(context.getFilesDir(),filename); **/

        String filename = "myfile";
        String string = "Hello world!";
        FileOutputStream outputStream;

        try {
            outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(string.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        /**
        String text = "bla bla";
        FileWriter writer=null;
        try {
            File file = new File("CarPool/app/src/main/kayalol.txt"); // proposed method
            if(!file.exists())
                file.createNewFile();

            writer = new FileWriter(file);


            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } **/

     /**   Log.d("in the method ","");
       String fileName="lol";
        String outputString= "Me trying to write to a file";
        //write to a file
        try{
            Log.d("in try","");
            FileOutputStream outputStream= openFileOutput(fileName,Context.MODE_PRIVATE );
            outputStream.write(outputString.getBytes());
            outputStream.close();
            Log.d("after try","");

        }
        catch(Exception e){
            Log.d("in catch","");
            Log.d("file not found ", "");
            e.printStackTrace();
        }

    }**/
     /**   String filename = "mysecondfile";
        String outputString = "Hello world!";
        File myDir = getFilesDir();

        try {
            File secondFile = new File("/Users/kayani/Desktop/CarPool", filename);
            if (secondFile.getParentFile().mkdirs()) {
                secondFile.createNewFile();
                FileOutputStream fos = new FileOutputStream(secondFile);

                fos.write(outputString.getBytes());
                fos.flush();
                fos.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } **/
       /** Log.d("IBM","lolz");
        String fileName = "fuckyoubitch";
        String content = "hello world";

        FileOutputStream outputStream = null;
        try {
            outputStream = openFileOutput(fileName, Context.MODE_PRIVATE);
            outputStream.write(content.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } **/

        /**    try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("config.txt", Context.MODE_PRIVATE));
                outputStreamWriter.write(data);
                outputStreamWriter.close();
            }
            catch (IOException e) {
                Log.e("Exception", "File write failed: " + e.toString());
            }
**/
      /**  String filename = "fuckyou";
        String string = "Hello world!";
        FileOutputStream outputStream;

        try {
            outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(string.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        } **/


    //}

   /** public void readFromFile(){
        String str="";
        StringBuffer buf= new StringBuffer();
        try{
            AssetManager assetManager= getAssets();
            InputStream inputStream =assetManager.open("lol.txt");
            BufferedReader reader= new BufferedReader(new InputStreamReader(inputStream));
            if(inputStream!=null){
                while((str=reader.readLine())!=null){
                    Log.d("output ",str);
                    buf.append(str+ "\n");
                }
            }
            inputStream.close();
        }
        catch(Exception e){
            e.printStackTrace();

        }



    } **/



}
