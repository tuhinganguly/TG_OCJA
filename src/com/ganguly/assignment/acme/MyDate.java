package com.ganguly.assignment.acme;

/**
 * @author tganguly
 *
 */
public class MyDate {
	int month, day, year;
	
	/**
	 * Default Constructor
	 */
	public MyDate() {
		
	}
	
	{
		month=1;
		day=1;
		year=2000;
	}
	
	/**
	 * Overloaded Constructor
	 * @param m
	 * @param d
	 * @param y
	 */
	public MyDate(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}
	
	/* This method returns the Date set by the main method
	 * 
	 */
	public String toString() {
		return Integer.toString(month)+"/"+Integer.toString(day)+"/"+Integer.toString(year);
	}
	
	/**
	 * This method sets the date
	 */
	public void setDate(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}
}
