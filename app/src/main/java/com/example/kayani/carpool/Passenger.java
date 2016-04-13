package com.example.kayani.carpool;

/**
 * Created by kayani on 4/12/16.
 */
public class Passenger {

    private String location;
    private int day;
    private int hour;


    public Passenger(String locationInput, int dayInput, int hourInput ){
        location=locationInput;
        day=dayInput;
        hour=hourInput;
    }

    public String getLocation(){
        return location;
    }

    public int getDay(){
        return day;
    }

    public int getHour(){
        return hour;
    }

}
