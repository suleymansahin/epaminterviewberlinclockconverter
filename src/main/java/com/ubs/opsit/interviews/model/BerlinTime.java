package com.ubs.opsit.interviews.model;

import org.apache.commons.lang.text.StrBuilder;

/**
 * Created by suleyman on 27.01.2016.
 * BerlinTime class represents the berlin time
 */
public class BerlinTime {
    private String secondsRow;
    private String firstHourRow;
    private String secondHourRow;
    private String firstMinuteRow;
    private String secondMinuteRow;

    public BerlinTime(String secondRow, String firstHourRow, String secondHourRow, String firstMinuteRow, String secondMinuteRow) {
        this.secondsRow = secondRow;
        this.firstHourRow = firstHourRow;
        this.secondHourRow = secondHourRow;
        this.firstMinuteRow = firstMinuteRow;
        this.secondMinuteRow = secondMinuteRow;
    }

    public String getSecondRow() {
        return secondsRow;
    }

    public void setSecondRow(String secondRow) {
        this.secondsRow = secondRow;
    }

    public String getFirstHourRow() {
        return firstHourRow;
    }

    public void setFirstHourRow(String firstHourRow) {
        this.firstHourRow = firstHourRow;
    }

    public String getSecondHourRow() {
        return secondHourRow;
    }

    public void setSecondHourRow(String secondHourRow) {
        this.secondHourRow = secondHourRow;
    }

    public String getFirstMinuteRow() {
        return firstMinuteRow;
    }

    public void setFirstMinuteRow(String firstMinuteRow) {
        this.firstMinuteRow = firstMinuteRow;
    }

    public String getSecondMinuteRow() {
        return secondMinuteRow;
    }

    public void setSecondMinuteRow(String secondMinuteRow) {
        this.secondMinuteRow = secondMinuteRow;
    }

    @Override
    public String toString() {
        return new StrBuilder().appendWithSeparators(new String[]{ secondsRow, firstHourRow, secondHourRow, firstMinuteRow, secondMinuteRow },System.lineSeparator()).toString();
    }
}
