/*
 * Unfortunately, the UNicode values of the characters '0-9' do not correspond to the
 * integer are of the characters. That is, the UNicode values of '0'-'9' are 48-57, not
 * 0-9. But we can easily convert there characters to their values by subtracting 48.
 * In particular, if c is a variable of type char containing digit '0'-'9', then we can
 * create a variable x of type int with the corresponding integer values as follows:
 * int x = c - 48;
 * Use this conversion technique in a program that reads in three digits, converts them
 * to a three-digit number, doubles the value of the integer, and then prints out the
 * result. For example, if the input is '3' , '4' and '5', then the output is 690.
 */
import java.io.IOException;
class UnicodeExp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int x = 0;
		String num = "";
		System.out.print("Enter a three digit number: ");
		for(int i=0; i<3  ;i++) {
			char ch = (char)System.in.read();
			x = x + ( (int)Math.pow(10,(2-i)) * (ch - 48) );
			num += ch;
		}
		int a = Integer.parseInt(num);
		System.out.println("Traditional , You entered : " + x + " , and it's double is : " + (2*x));
		System.out.println("You entered : " + a + " , and it's double is : " + (2*a));
	}

}
