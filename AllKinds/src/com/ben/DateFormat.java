package com.ben;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			System.out.println(dateFormat.format(new Date()));
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			cal.add(Calendar.MINUTE, 540);//9 hours
			cal.getTime();
		} catch (Exception ex){
			System.out.println("Something went wrong: " + ex.getMessage());
		}
		

	}

}
