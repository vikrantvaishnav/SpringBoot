package com.pack.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateService {

    public DayOfWeek getDayOfWeek() {
        return LocalDate.now().getDayOfWeek();
    }
}