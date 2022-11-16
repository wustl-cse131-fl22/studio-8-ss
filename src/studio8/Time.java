package studio8;

import java.util.Objects;

public class Time {
	
	private int hour;
	private int minute;
	private boolean military;
	
	/**
	 * 
	 * @param hour Hour (0-24)
	 * @param minute Minute (0-59)
	 */
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
		
		if(hour > 12) {
			military = true;
		}
	}
	
	public String toString() {
		if(military == true) {
			return (this.hour - 12) + ":" + this.minute + "pm";
		}
		else if(hour == 12) {
			return this.hour + ":" + this.minute + "pm";
		}
		else {
			return this.hour + ":" + this.minute + "am";
		}
		
	}
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(hour, military, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && military == other.military && minute == other.minute;
	}

	public static void main(String[] args) {
		
		Time time = new Time(12, 21);
		Time time2 = new Time(20, 43);
		Time time3 = new Time(8, 43);
		
		System.out.println(time);
		System.out.println(time2);
		
		System.out.println(time.equals(time2));
		System.out.println(time3.equals(time2));
 
    	
    }

}