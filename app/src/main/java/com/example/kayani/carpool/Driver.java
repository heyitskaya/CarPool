package com.example.kayani.carpool;

/**
 * Created by kayani on 4/12/16.
 */
//this is the exact same as the passenger class but for drivers
public class Driver {
    private String location;
    private int day;
    private int hour;


    public Driver(String locationInput, int dayInput, int hourInput ){
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
