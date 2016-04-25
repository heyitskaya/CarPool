package com.example.kayani.carpool;

import java.util.Date;

/**
 * Created by kayani on 4/12/16.
 */
public final class PassengerData {
    private static String location;
    private static int time;
    private static Date date;
    private static int day;
    private static int currentDay;

    public static String getLocation(){
        return location;
    }

    public static void setLocation(String locationToSet){
        location=locationToSet;
    }

    public static int getTime(){
        return time;
    }

    public static void setTime(int timeToSet){
        time=timeToSet;
    }

    public static Date getDate(){
        return date;
    }

    public static void setDate(Date dateToSet){
        date=dateToSet;
    }

    public static void setDay(int dayToSet){
        day=dayToSet;
    }

    public static int getDay(){
        return day;
    }

    public static void setCurrentDay(int currentDayToSet){
        currentDay=currentDayToSet;

    }

    public static int getCurrentDay(){
        return currentDay;
    }

}
