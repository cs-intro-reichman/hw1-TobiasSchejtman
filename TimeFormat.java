// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		boolean PM = hours >= 12;
		if (hours > 12) {
            hours -= 12;
		}
	
		String period = PM ? "PM" : "AM";
		String fixMinutes = minutes < 10 ? "0" + minutes : "" + minutes;

		System.out.println(hours + ":" + fixMinutes + " " + period);

	  
	}
}
