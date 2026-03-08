package com.pack.sbeans;

import java.time.DayOfWeek;

public class WeekendChecker {

    private DateService dateService;

    // Setter Injection
    public void setDateService(DateService dateService) {
        this.dateService = dateService;
    }

    public void checkDay() {

        DayOfWeek day = dateService.getDayOfWeek();

        if(day == DayOfWeek.SATURDAY ||
           day == DayOfWeek.SUNDAY) {

            System.out.println("It's the Weekend!");
        }
        else {
            System.out.println("It's a Weekday.");
        }
    }
}
