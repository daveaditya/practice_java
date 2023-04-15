import java.io.*;
/**
 * This class demonstrates documentation comments.
 * @author Aditya Dave
 * @version 1.2
 */
class SquareNum {
	/**
	 * This method returns the square of num.
	 * This is a multiline description. You can use
	 * as many lines as you like.
	 * @param num The value to be squaresd.
	 * @return num squared as a double.
	 */
	public double square(double num) {
		return(num*num);
	}
	
	/**
	 * This method inputs a number from the user.
	 * @return The value input as a double.
	 * @exception IOException On input error.
	 * @see IOException.
	*/
	public double getNumber() throws IOException {
		// Create a BufferedReader using System.in.
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inData = new BufferedReader(isr);
		String str;
		
		str = inData.readLine();
		return(new Double(str).doubleValue());
	}
	
	/**
	 * This method demonstrates square().
	 * @param args Unused.
	 * @exception IOException on input error.
	 * @see IOException.
	 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SquareNum ob = new SquareNum();
		double val;
		
		System.out.print("Enter value to be squared: ");
		val = ob.getNumber();
		val = ob.square(val);
		
		System.out.println("Squared value is " + val);
	}

}
