// Demonstrate isLeapYear().
import java.util.*;

class LeapYearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar calendar = new GregorianCalendar();
		
		int year = calendar.get(Calendar.YEAR);
		
		System.out.print(year);
		
		if(calendar.isLeapYear(year)) {
			System.out.println(" is a leap year");
		}
		else {
			System.out.println(" is not a leap year");
		}
	}

}
