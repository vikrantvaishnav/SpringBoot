package com.sbeans;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

    // Field Injection — @Autowired
    @Autowired
    private LocalDate localDate;

    public SeasonFinder() {
        System.out.println("SeasonFinder: 0-param constructor called");
    }

    public void findSeason() {
        int month = localDate.getMonthValue();

        System.out.println("------------------------------");
        System.out.println("Date   : " + localDate);
        System.out.println("Month  : " + localDate.getMonth()
                            + " (" + month + ")");

        String season;
        if (month >= 3 && month <= 6)
            season = "SUMMER ☀️";
        else if (month >= 7 && month <= 10)
            season = "RAINY 🌧️";
        else
            season = "WINTER ❄️";

        System.out.println("Season : " + season);
        System.out.println("------------------------------");
    }
}