package epam.challange;

public class TimeConversion {
	
	public static String timeConversion(String s) {
		if(s == null) return null;
		String result = "";
		String amOrPm = s.substring(s.length()-2);
		String time = s.substring(0,s.length()-2);
		String hours = s.substring(0,2);
		Integer hoursInt = Integer.parseInt(hours);
		if(amOrPm.equals("AM") && hours.equals("12")) return "00:" + time.substring(3);
		if(amOrPm.equals("AM") && !hours.equals("12")) return time;
		if(amOrPm.equals("PM") && hours.equals("12")) return time;
		if(amOrPm.equals("PM") && !hours.equals("12")) {
			hoursInt+=12;
			return hoursInt.toString()+":"+time.substring(3);
		}
		return null;
	}
	
	

	public static void main(String[] args) {
		String[] times = {"07:05:45PM", "12:00:00AM", "12:00:00PM","05:05:45PM","11:59:59PM", "07:15:37AM", "07:15:37PM"};
		for(String s: times) System.out.println(s + " -> " + timeConversion(s));
		System.out.println(timeConversion(null));
	}

}
