import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 To create a data file to use as test for CSVConvertor program.
 */
class CSVDataFileCreator {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage: CSVDataFileCreator File");
			return;
		}
		
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream(args[0]))) {
			out.writeInt(2);out.writeInt(3);out.writeChar('\n');
			
			out.writeInt(1);out.writeChar(',');
			out.writeInt(2);out.writeChar(',');
			out.writeInt(3);out.writeChar('\n');
			
			out.writeInt(4);out.writeChar(',');
			out.writeInt(5);out.writeChar(',');
			out.writeInt(6);out.writeChar('\n');
		}
		catch(IOException exc) {
			System.out.println("IoException : file creation cancelled.");
		}
	}

}
