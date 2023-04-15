// Demonstrate the %g format specifier.
import java.util.*;

class GFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fmt = new Formatter();
		
		for(double i=1000 ; i<1.0e+10 ; i*=100) {
			fmt.format("%g",i);
			System.out.println(fmt);
		}
		fmt.close();
	}

}
