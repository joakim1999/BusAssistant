package com.joapet99.busassistant.framework;

import android.os.SystemClock;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Joakim on 22.08.2016.
 */
public class Bus {
    String busNumber;
    BusTable timeTable;
    int worstCase = -1;
    int averageCase = -1;
    int bestCase = -1;
    int walkToHome = -1;

    public Bus(String busNumber, BusTable timeTable){
        this.busNumber = busNumber;
        this.timeTable = timeTable;
    }

    public int estimateRoute(boolean walkHome){
        Calendar cal = Calendar.getInstance();
        String currentTime = cal.get(Calendar.HOUR_OF_DAY) + "" + cal.get(Calendar.MINUTE);
        System.out.println("{{ time:" + currentTime);
        System.out.println("{{ nextBus:" + timeTable.getNextBusTime(Integer.valueOf(currentTime)));
        /*TODO*/ return timeTable.getNextBusTime(Integer.valueOf(currentTime));
    }
}
