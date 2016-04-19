package com.example.kayani.carpool;

/**
 * Created by kayani on 4/12/16.
 */

//this is all the same location right now
public class FindRide {
    private QueueLL<Passenger>[][] passengerMatrix; // 7 rows 24 columns
    private QueueLL<Driver>[][] driverMatrix= new QueueLL[7][24];


    public FindRide(Passenger p){

        passengerMatrix= new QueueLL[7][24];
        for(int i=0;i<7;i++){
            for(int j=0;j<24;j++){
                passengerMatrix[i][j]= new QueueLL<Passenger>(); //initialize the 2d array
                driverMatrix[i][j]= new QueueLL<Driver>();
            }
        }
        int day=p.getDay();
        int hour=p.getHour();
        //row by column
        //row: hour
        //column: day
      /**  driverMatrix[day-18][hour-7].enqueue(new Driver(p.getLocation(),p.getDay(),p.getHour()));
        passengerMatrix[day-18][hour-7].enqueue(p); //add this to the queue

        if(driverMatrix[day-18][hour-7]!=null && passengerMatrix[day-18][hour-7]!=null){
            Log.d("Have we found a ride?","yes");


        } **/

    }

    public boolean existsRide(){
        return true;
    }







}
