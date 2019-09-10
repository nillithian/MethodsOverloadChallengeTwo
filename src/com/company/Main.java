package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(getDurationString(55555555));


    }

    public static String getDurationString (int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59) ) {
            return "Invalid Value";
        } else {
            int hours = minutes / 60;
            int minutesrest = minutes % 60;


            return hours + " hh " + minutesrest + " mm " + seconds + " ss ";

        }

    }

    public static String getDurationString (int seconds) {
        if ( seconds < 0) {
            return "Invalid Value";
        }
        else {

            int minutes = seconds / 60;
            int secondsrest = seconds % 60;

            return getDurationString(minutes, secondsrest);
        }
    }
}
