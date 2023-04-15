// Use relative indexes to simplify the
// creation of a custom date and time format.
import java.util.*;

class RelativeIndexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fmt = new Formatter();
		GregorianCalendar calendar = new GregorianCalendar();
		
		fmt.format("Today is day %te of %<tB, %<tY",calendar);
		
		System.out.println(fmt);
		
		fmt.close();
		
	}

}
