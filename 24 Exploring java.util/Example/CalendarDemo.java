// Demonstrate GregorianCalendar.
import java.util.*;

class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar calendar = new GregorianCalendar();
		
		System.out.print("Date: ");
		System.out.print(calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,Locale.getDefault()));
		System.out.print(" " + calendar.getDisplayName(Calendar.MONTH,Calendar.LONG,Locale.getDefault()));
		System.out.print(" " + calendar.get(Calendar.DATE) + " , ");
		System.out.println(calendar.get(Calendar.YEAR));
		
		System.out.print("Time: ");
		System.out.print(calendar.get(Calendar.HOUR) + ":");
		System.out.print(calendar.get(Calendar.MINUTE) + ":");
		System.out.print(calendar.get(Calendar.SECOND));
		
		int am = calendar.get(Calendar.AM_PM);
		
		if(am  == Calendar.AM) {
			System.out.println(" AM");
		}
		else {
			System.out.println(" PM");
		}
		
		calendar.set(Calendar.HOUR,10);
		calendar.set(Calendar.AM_PM,Calendar.PM);
		calendar.set(Calendar.MINUTE,29);
		calendar.set(Calendar.SECOND,22);
		System.out.print("Updated time: ");
		System.out.print(calendar.get(Calendar.HOUR) + ":");
		System.out.print(calendar.get(Calendar.MINUTE) + ":");
		System.out.print(calendar.get(Calendar.SECOND));
		
		am = calendar.get(Calendar.AM_PM);
		
		if(am  == Calendar.AM) {
			System.out.println(" AM");
		}
		else {
			System.out.println(" PM");
		}
		
	}

}
