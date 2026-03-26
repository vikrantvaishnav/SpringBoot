package com.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wda")
public class WeekDayAnalyzer {
	private LocalDate date;
	
	public WeekDayAnalyzer() {
		IO.println("0 Param Constructor");
	}
	
	@Autowired
	public void setDate(LocalDate date) {
		IO.println("Set Date");
		this.date = date;
	}
	
	public String showMesage(String user) {
		int wno = date.getDayOfWeek().getValue();
		
		if(wno >=1 && wno<=5) {
			return "Happy Working Day: "+user;
			
		}
		else {
			return "Happy WeekEnd: "+user;
		}
	}
}
