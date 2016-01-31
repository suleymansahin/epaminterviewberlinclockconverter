package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.model.BerlinTime;
import com.ubs.opsit.interviews.model.Time;
import com.ubs.opsit.interviews.util.CommonUtil;
import com.ubs.opsit.interviews.util.ValidationUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by suleyman on 27.01.2016.
 */
public class BerlinTimeConverter implements TimeConverter {
    private final Logger logger = LoggerFactory.getLogger(BerlinTimeConverter.class);
    @Override
    public String convertTime(String aTime) {
        //null or empty check
        if(!ValidationUtil.checkNullOrEmpty(aTime)) {
            logger.error("input time cannot be null or empty");
            return null;
        } else if(!ValidationUtil.checkFormat(aTime)) {
            logger.error("check format is wrong");
            return null;
        }

        Time time = CommonUtil.convertTimeStringToTimeModel(aTime);
        BerlinTime berlinTime =CommonUtil.convertTimeToBerlinTime(time);

        return berlinTime.toString();
    }
}
