package com.example.jatinderkumar.googleapp7;

import java.util.Date;

/**
 * Created by Jatinder Kumar on 04-03-2018.
 */

public class EarthQuake {
    String place;
    double magnitude;
    Long timeInMilliseconds;
    String url;

    public EarthQuake(String place, double magnitude,long timeInMilliseconds,String url) {
        this.place = place;
        this.magnitude = magnitude;
        this.timeInMilliseconds = timeInMilliseconds;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getPlace() {
        return place;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public Long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }
}
