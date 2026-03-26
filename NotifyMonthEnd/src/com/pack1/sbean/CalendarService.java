package com.pack1.sbean;

import java.time.LocalDate;

public class CalendarService {

	 public int getDate() {
	        return LocalDate.now().getDayOfMonth();
	    }
	
}
