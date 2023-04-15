// Formatting date and time.
import java.util.*;

class TimeDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fmt = new Formatter();
		GregorianCalendar calendar = new GregorianCalendar();
		
		fmt.format("%tr\n",calendar);
		fmt.format("%tc\n",calendar);
		fmt.format("%tl:%tM\n",calendar,calendar);
		
		fmt.format("%tB %tb %tm",calendar,calendar,calendar);
		
		System.out.println(fmt);
		fmt.close();
	}

}
