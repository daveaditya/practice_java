// Demonstrates the precision modifier.
import java.util.*;

class PrecisionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fmt = new Formatter();
		
		fmt.format("%.4f\n",123.1234567);
		
		fmt.format("%16.2e\n",123.1324657);
		
		fmt.format("%.15s\n","Formatting with Java is now easy.");
		
		System.out.println(fmt);
		
		fmt.close();
	}	

}
