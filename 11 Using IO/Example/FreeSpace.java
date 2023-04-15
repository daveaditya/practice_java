// Show the free space on the current drive partition.
import java.io.*;

class FreeSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile = new File("\\");
		System.out.println("Free Space : " + myFile.getFreeSpace());
	}

}
