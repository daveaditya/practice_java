/*
 * Rewrite the program FileCopy so that it uses the character stream classes. This time,
 * use the try-with-resources statement to automatically close the file.
 */
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

class FileCopyChStrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch = 0;

		try (FileReader reader = new FileReader("/media/aditya/Volume D/Java/Working/src/test3.txt");
				FileWriter writer = new FileWriter("/media/aditya/Volume D/Java/Working/src/test4.txt");)
		{

			do {
				ch = reader.read();
				if(ch != -1 && (char)ch == ' ') {
					ch = (int)'-';
				}
				if(ch != -1) {
					writer.write(ch);	
				}
			} while(ch != -1);

		}
		catch(FileNotFoundException exc) {
			System.out.println(exc);
		}
		catch(IOException exc) {
			System.out.println(exc);;
		}

		System.out.println("New file created.");
	}

}
