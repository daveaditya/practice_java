// Use automatic resource management with Formatter.
import java.util.*;

class FormatDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Formatter fmt = new Formatter() ){
			fmt.format("Formatting %s is easy %d %f","with Java",10,98.6);
			System.out.println(fmt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
