/*
 * Parts of the for loop can be empty.
 */
public class Empty {

	public static void main(String[] args) {
		int i;
		
		for(i=0;i<10;) {
			System.out.println("Pass #" + i);
			i++;
		}

	}

}
