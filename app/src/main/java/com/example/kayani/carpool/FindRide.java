package com.example.kayani.carpool;
/**
 * Created by kayani on 4/12/16.
 */

public class FindRide {
    private QueueLL<Passenger>[][] passengerMatrix; // 7 rows 24 columns

    public FindRide(Passenger p){
        passengerMatrix= new QueueLL[7][24];
        for(int i=0;i<7;i++){
            for(int j=0;j<24;j++){
                passengerMatrix[i][j]= new QueueLL<Passenger>(); //initialize the 2d array
            }
        }
        int day=p.getDay();
        int hour=p.getHour();
        //row by column
        //row: hour
        //column: day


    }







}
