package com.example.calender;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;

/**
 * @author zhouhd
 * @since 2021/8/4 11:11
 **/
@SpringBootTest
@Slf4j
public class CalenderTest {
    @Test
    public void testOne(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        int hour = calendar.get(Calendar.HOUR);
        log.debug("hourOfDay:{} hour:{}",hourOfDay,hour);
    }
}
