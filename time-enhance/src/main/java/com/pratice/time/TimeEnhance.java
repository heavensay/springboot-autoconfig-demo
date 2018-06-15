package com.pratice.time;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@ConfigurationProperties(prefix = "time.format")
public class TimeEnhance {

    private String defaultDataFormat ="yyyy-MM-dd HH:mm:ss";

    public String getFormatTime(Timestamp time){
        DateFormat format = new SimpleDateFormat(defaultDataFormat);
        return format.format(time);
    }

    public void setDefaultDataFormat(String defaultDataFormat) {
        this.defaultDataFormat = defaultDataFormat;
    }
}
