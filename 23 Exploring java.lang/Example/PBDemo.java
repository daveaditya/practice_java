import java.io.IOException;

// Demonstrate ProcessBuilder.

class PBDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ProcessBuilder procBldr = new ProcessBuilder("gedit","testfile");
			procBldr.start();
		}
		catch(IOException exc) {
			System.out.println("Error executing gedit.\n" + exc);
		}
	}

}
