package com.ubs.opsit.interviews.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by suleyman on 27.01.2016.
 */
public class ValidationUtil {
    /**
     * Check the input is null or empty
     * @param time will be checked
     * @return false if time is null or empty
     */

    private final static Logger logger = LoggerFactory.getLogger(ValidationUtil.class);
    public static boolean checkNullOrEmpty(String time) {
        logger.info("checkNullOrEmpty is called");
        if(time == null || time.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkFormat(String aTime) {
        logger.info("checkFormat is called");
        String[] timeArray = aTime.split(":");
        if(timeArray.length != 3) {
            logger.error("format must be hh:mm:ss, so size must be 3 but size is " + timeArray.length );
            return false;
        }

        int hour = 0;
        int min = 0;
        int sec = 0;

        try {
            hour = Integer.parseInt(timeArray[0]);
            if(hour < 0 || hour > 24) {
                logger.error("hour part must be between 0 and 23");
                return false;
            }
        }catch (Exception e) {
            logger.error("hour part must be integer");
            return false;
        }

        try {
            min = Integer.parseInt(timeArray[1]);
            if(min < 0 || hour > 59) {
                logger.error("minute part must be between 0 and 59");
                return false;
            }
        }catch (Exception e) {
            logger.error("minute part must be integer");
            return false;
        }

        try {
            sec = Integer.parseInt(timeArray[2]);
            if(sec < 0 || hour > 24) {
                logger.error("second part must be between 0 and 59");
                return false;
            }
        }catch (Exception e) {
            logger.error("second part must be integer");
            return false;
        }

        return true;
    }
}
