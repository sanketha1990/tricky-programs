package com.tricky.programmer;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderProgram {

	public static void main(String args[]) {
		fetchCalenderBasedOnInput(100);
		subtractDays(-10);
	}
	
	

	private static void fetchCalenderBasedOnInput(int days) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		// Getting current date
		Calendar cal = Calendar.getInstance();
		// Displaying current date in the desired format
		System.out.println("Current Date: " + sdf.format(cal.getTime()));

		// Number of Days to add
		cal.add(Calendar.DAY_OF_MONTH, days);
		// Date after adding the days to the current date
		String newDate = sdf.format(cal.getTime());
		// Displaying the new Date after addition of Days to current date
		System.out.println("Date after Addition: " + newDate);
	}
	
	public static void subtractDays(int number) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal=Calendar.getInstance();
		System.out.println("Cal ="+cal.getTime());
		cal.add(Calendar.DAY_OF_MONTH,number);
	
		System.out.println(sdf.format(cal.getTime()));
	}
}
