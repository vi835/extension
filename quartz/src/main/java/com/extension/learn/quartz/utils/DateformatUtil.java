package com.extension.learn.quartz.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateformatUtil {
    public static final SimpleDateFormat DEFAULT_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String defaultFormat(Date date) {
        return DEFAULT_FORMAT.format(date);
    }

}
