package com.github.mateusgabi.date;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class DateHelperTest {

    @Test
    public void should_format_date() {

        Date day0 = new Date(0l);

        // "dd-MM-yyyy"
        Assert.assertEquals(DateHelper.format(day0, DateHelper.FORMAT_DATE), "31-12-1969");

        // "h:mm a"
        Assert.assertEquals(DateHelper.format(day0, DateHelper.FORMAT_TIME), "8:00 PM");

        // "h:mm:ss a"
        Assert.assertEquals(DateHelper.format(day0, DateHelper.FORMAT_TIME_SEC), "8:00:00 PM");

        // "dd-MM-yyyy h:mm a"
        Assert.assertEquals(DateHelper.format(day0, DateHelper.FORMAT_DATE_TIME), "31-12-1969 8:00 PM");

        // "dd-MM-yyyy h:mm:ss a"
        Assert.assertEquals(DateHelper.format(day0, DateHelper.FORMAT_DATE_TIME_SEC), "31-12-1969 8:00:00 PM");

        // "H:mm:ss"
        Assert.assertEquals(DateHelper.format(day0, DateHelper.FORMAT_POSTGRES_TIME), "20:00:00");

        // "yyyy-MM-dd"
        Assert.assertEquals(DateHelper.format(day0, DateHelper.FORMAT_POSTGRES_DATE), "1969-12-31");

        // "yyyy-MM-dd H:mm:ss"
        Assert.assertEquals(DateHelper.format(day0, DateHelper.FORMAT_POSTGRES_TIMESTAMP), "1969-12-31 20:00:00");


    }

}