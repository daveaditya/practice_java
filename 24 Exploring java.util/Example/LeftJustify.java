// Demonstrate left justification.
import java.util.*;

class LeftJustify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fmt = new Formatter();
		
		fmt.format("|%10.2f|\n",123.123);
		
		fmt.format("|%-10.2f|",132.123);
		
		System.out.println(fmt);
		
		fmt.close();
	}

}
