package studio8;

import java.util.LinkedList;

public class Calendar {
	
	private LinkedList<Appointment> cal;
	
	public Calendar(Appointment appt)
	{
		cal.add(appt);
	}
	
	public static void main(String[] args)
	{
		Time time = new Time(12, 21);
		Date date = new Date(3, 4, 2009, true);
		Appointment appt = new Appointment(date, time);
		Time time2 = new Time(11, 21);
		Date date2 = new Date(2, 4, 2009, true);
		Appointment appt2 = new Appointment(date2, time2);
		
		LinkedList<Appointment> cal = new LinkedList<Appointment>();
		cal.add(appt);
		cal.add(appt2);
		System.out.println(cal);
	}

}
