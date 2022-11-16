package studio8;

import java.util.Objects;

public class Appointment {
	
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	public String toString() {
		return "You have an appointment on " + this.date + " at " + this.time;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time time = new Time(12, 21);
		Date date = new Date(3, 4, 2009, true);
		Appointment appt = new Appointment(date, time);
		System.out.println(appt);
	}

}