package com.ubs.opsit.interviews.util;

import com.ubs.opsit.interviews.model.BerlinTime;
import com.ubs.opsit.interviews.model.Time;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by suleyman on 27.01.2016.
 */
public class CommonUtil {
    /***
     * Convert string time to Time model
     * @param time's format is hh:mm:ss
     * @return time model if  anything goes wrong return null
     */
    private final static Logger logger = LoggerFactory.getLogger(CommonUtil.class);

    /**
     *  This method convert string time to Time model
     * @param time is converted to Time model.Its format hh:mm:ss
     * @return Time model
     */
    public static Time convertTimeStringToTimeModel(String time) {
        logger.info("convertTimeStringToTimeModel is called");
        Time timeObj = new Time();
        String[] strings = time.split(":");
        timeObj.setHour(Integer.parseInt(strings[0]));
        timeObj.setMin(Integer.parseInt(strings[1]));
        timeObj.setSec(Integer.parseInt(strings[2]));
        return  timeObj;
    }

    /**
     *  This method converts Time model to BerlinTime model
     * @param time is converted to BerlinTime model. Time is Time model
     * @return BerlinTime
     */
    public static BerlinTime convertTimeToBerlinTime(Time time) {
        logger.info("convertTimeToBerlinTime is called");
        String secondsRow = time.getSec()%2==0 ? "Y" : "O";
        String hourFirstRow = generateFirstHourRow(time.getHour());
        String hourSecondRow = generateSecondHourRow(time.getHour());
        String firstMinuteRow = generateFirstMinuteRow(time.getMin());
        String secondMinuteRow = generateSecondMinuteRow(time.getMin());
        BerlinTime berlinTime = new BerlinTime(secondsRow,hourFirstRow,hourSecondRow,firstMinuteRow,secondMinuteRow );


        return berlinTime;
    }

    private static String generateSecondMinuteRow(int min) {
        logger.info("generateSecondMinuteRow is called");
        int numberOfYellowLight = min % 5;
        String result = generateRow("Y", numberOfYellowLight, 4);
        return result;
    }

    private static String generateFirstMinuteRow(int min) {
        logger.info("generateSecondMinuteRow is called");
        int numberOfYellowLight = min / 5;
        String result = generateRow("Y", numberOfYellowLight, 11);
        //result[2] =  ""
        char[] resultChars = result.toCharArray();
        if(resultChars[2] == 'Y') resultChars[2] = 'R';
        if(resultChars[5] == 'Y') resultChars[5] = 'R';
        if(resultChars[8] == 'Y') resultChars[8] = 'R';

        result = String.valueOf(resultChars);
        return result;
    }

    private static String generateSecondHourRow(int hour) {
        logger.info("generateSecondMinuteRow is called");
        int numberOfRedLight = hour % 5;
        return generateRow("R", numberOfRedLight, 4);
    }

    private static String generateFirstHourRow(int hour) {
        logger.info("generateSecondMinuteRow is called");
        int numberOfRedLight = hour / 5;
        return generateRow("R", numberOfRedLight, 4);
    }

    private static String generateRow(String light, int times, int length){
        logger.info("generateSecondMinuteRow is called");
        return StringUtils.repeat(light, times) + StringUtils.repeat("O", length - times);
    }
}
