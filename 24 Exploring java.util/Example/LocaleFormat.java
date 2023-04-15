// Demonstrate a formatting difference based on locale.
import java.util.*;

class LocaleFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter usFmt = new Formatter(Locale.US);
		Formatter germanFmt = new Formatter(Locale.GERMAN);
		double n = 1234657.24;
		
		usFmt.format("English: %,.2f",n);
		System.out.println(usFmt);
		usFmt.close();
		
		germanFmt.format("German: %,.2f",n);
		System.out.println(germanFmt);
		germanFmt.close();
	}

}
