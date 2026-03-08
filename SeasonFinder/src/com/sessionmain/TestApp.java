package com.sessionmain;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sessionbean.Sessionfind;

public class TestApp {
	
	void main() {
		IO.println("Main class running");
		
		FileSystemXmlApplicationContext apx = new FileSystemXmlApplicationContext("src/com/sessionconfig/applicationContext.xml");
		
		
		Sessionfind obj =
				apx.getBean("prdict", Sessionfind.class);

		String result = obj.findSeason();
		IO.println("Session is:"+result);
		
		apx.close();
		
	}
}
