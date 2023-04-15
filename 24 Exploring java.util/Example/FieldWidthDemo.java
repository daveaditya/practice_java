// Demonstrate a field-width specifier.
import java.util.*;

class FieldWidthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fmt = new Formatter();
		
		fmt.format("|%f|\n|%12f|\n",10.12345,10.12345);
		fmt.format("|%s|\n|%10s|","Java","Java");
		
		System.out.println(fmt);
		fmt.close();
	}

}
