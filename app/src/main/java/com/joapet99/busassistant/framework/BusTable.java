package com.joapet99.busassistant.framework;

/**
 * Created by Joakim on 22.08.2016.
 */
public enum BusTable {
    BUS02(new int[]{540,600,640,700,740,810,840,910,940,1010,1040,1110,1140,1210,
                    1240,1310,1340,1410,1440,1510,1540,1610,1640,1710,1740,1840,
                    1940,2040,2140},17);

    int[] times;
    int estimate;
    BusTable(int[] times, int estimate) {
        this.times = times;
        this.estimate = estimate;
    }

    public int[] getTimes() {
        return times;
    }

    public int getEstimate() {
        return estimate;
    }

    public int getNextBusTime(int currentTime){
        for(int i : times){
            if(i > currentTime){
                return i;
            }
        }
        return getTimes()[0];
    }
}
