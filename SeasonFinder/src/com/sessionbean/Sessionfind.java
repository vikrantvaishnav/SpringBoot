package com.sessionbean;

import java.time.LocalDate;

public class Sessionfind {
	private LocalDate date;
	
	public Sessionfind() {
		IO.println("Session Finder::0Param Constructor");
	}

	public void setDate(LocalDate date) {
		IO.println("Setting Date using Setter");
		this.date = date;
	}
	
	
	 public String findSeason()
	    {
		
		 int month = date.getMonthValue();
		 
		 if(month >= 3 && month <= 6)
	        {
	            return "Summer Season";
	        }
	        else if(month >= 7 && month <= 10)
	        {
	            return "Rainy Season";
	        }
	        else
	        {
	            return "Winter Season";
	        }
	
	}
	
	
}
