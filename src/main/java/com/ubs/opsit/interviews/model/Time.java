package com.ubs.opsit.interviews.model;

/**
 * Created by suleyman on 27.01.2016.
 * Time class represents the normal time
 */
public class Time {
    private int hour;
    private int min;
    private int sec;

    /**
     * Default constructor
     */
    public Time(){

    };

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
}
