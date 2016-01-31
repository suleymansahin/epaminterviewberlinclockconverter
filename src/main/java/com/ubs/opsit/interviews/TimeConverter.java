package com.ubs.opsit.interviews;

public interface TimeConverter {

    /**
     * This method convert time to berlin time
     * @param aTime is the time which is wanted to be converted.The format must be: hh:mm:ss
     * @return
     */
    String convertTime(String aTime);

}
