// Demonstrate PrintWriter.
import java.io.*;

class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter(System.out,true);
		int i= 10;
		double d = 123.65;
		
		pw.println("Using a PrintWriter.");
		pw.println(i);
		pw.println(d);
		
		pw.println(i + " + " + d + " is " + (i+d));
	}

}
