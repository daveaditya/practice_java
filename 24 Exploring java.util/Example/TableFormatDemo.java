// Create a table of squares and cubes.
import java.util.*;

class TableFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fmt = new Formatter();
		
		for(int i=1 ; i<=10 ; i++) {
			fmt.format("%4d %4d %4d\n",i,i*i,i*i*i);
		}
		System.out.println(fmt);
		fmt.close();
	}

}
