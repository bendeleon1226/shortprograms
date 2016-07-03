package com.ben;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class MyStockTaskTest {

	public static void main(String[] args) throws ParseException {
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = dateFormatter.parse("2016-07-04 02:26:00");
		
		Timer timer = new Timer();
		
		//timer.schedule(new MyStockTask(), date, 10000);
		timer.scheduleAtFixedRate(new MyStockTask(), date, 10000);
	}

}
