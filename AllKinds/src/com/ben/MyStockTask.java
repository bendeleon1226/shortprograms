package com.ben;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class MyStockTask extends TimerTask {
	int ctr = 0;
	public void run(){
		ctr++;
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date1 = null;
		try{
			date1 = dateFormatter.parse("2016-07-04 02:27:00");
		} catch (Exception ex){
			System.out.println("Exception: " + ex.getMessage());
		}
		if(new Date().getTime() > date1.getTime()){
			cancel();
			System.exit(1);
		} else {
			System.out.println("Ben" + ctr);
		}
		
	}
}
