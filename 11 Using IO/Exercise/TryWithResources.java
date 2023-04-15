/*
 * Rewritten program to eliminate finally clause.
 */
import java.io.*;

class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length != 2) {
			System.out.println("Usage : TryWithResources From To");
			return;
		}

		try (FileInputStream fin = new FileInputStream(args[0]);
				FileOutputStream fout = new FileOutputStream(args[1])) {

			if(fin != null && fout != null) {
				int c = fin.read();
				fout.write(c);
			}
		}
		catch(IOException exc) {
			System.out.println("IOException : program halted.");
		}

	}

}
