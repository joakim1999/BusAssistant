package com.joapet99.busassistant;

import java.util.ArrayList;

/**
 * Created by Joakim on 18.08.2016.
 */
public class Route {
    String busNumber;
    String additional;
    int bestCase;
    int worstCase;
    int average;
    ArrayList<Integer> durations;
    long startTime;

    public void setBusNumber(String busNumber){
        this.busNumber = busNumber;
    }

    public String getBusNumber(){
        return this.busNumber;
    }

    public void setAdditional(String additional){
        this.additional = additional;
    }

    public String getAdditional(){
        return this.additional;
    }

    public void startTimer(){
        startTime = System.currentTimeMillis();
    }

    public void stopTimer(){
        int duration = (int)((System.currentTimeMillis() - startTime)/1000);
        durations.add(duration);
        if(duration < bestCase){
            bestCase = duration;
        }
        if(duration > worstCase){
            worstCase = duration;
        }

        calculateAverage();
    }

    public void calculateAverage(){
        int sum = 0;
        for(Integer i : durations){
            sum += i;
        }
        average = sum/durations.size();
    }
}
