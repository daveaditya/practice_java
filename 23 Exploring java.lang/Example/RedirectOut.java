// Redirect System out to a file.
import java.io.*;

class RedirectOut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("RedirectOut : to");
			return;
		}
		
		try (PrintStream fout = new PrintStream(args[0])) {
			PrintStream orgOut = System.out;
			System.setOut(fout);
			System.out.println("This goes in the file.");
			System.setOut(orgOut);
			System.out.println("This is shown on the screen.");
		}
		catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}

}
