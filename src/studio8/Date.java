package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	/**
	 * 
	 * @param month Month of date
	 * @param day Numerical day within month (1-31)
	 * @param year Four digit year
	 * @param holiday Whether or not the date is a holiday
	 */
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}
	
	public String toString() {
		
		if (this.holiday == true) {
			return this.month + "/" + this.day + "/" + this.year; // + " is a holiday";
		}
		else {
			return this.month + "/" + this.day + "/" + this.year; // + " is not a holiday";
		}
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
    	Date date = new Date(3, 2, 2022, true);
    	System.out.println(date);
    	
    	Date date2 = new Date(3, 2, 2022, false);
    	System.out.println(date2);
    	System.out.println(date.equals(date2));
    	
    	Date date3 = new Date(9, 4, 2007, false);
    	Date date4 = new Date(12, 25, 2005, true);
    	Date date5 = new Date(11, 26, 2017, true);
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(date);
    	list.add(date2);
    	list.add(date3);
    	list.add(date4);
    	list.add(date5);
    	System.out.println(list);
    	
    	HashSet<Date> list2 = new HashSet<Date>();
    	list2.add(date);
    	list2.add(date2);
    	list2.add(date3);
    	list2.add(date4);
    	list2.add(date5);
    	System.out.println(list2);
    }

}
