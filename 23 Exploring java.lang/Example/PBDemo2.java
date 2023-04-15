// Wait until the process is terminated.
import java.io.IOException;

class PBDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ProcessBuilder procBldr = new ProcessBuilder("gedit","testfile");
			Process p = procBldr.start();
			p.waitFor();
			System.out.println("Gedit returned " + p.exitValue());
		}
		catch(IOException exc) {
			System.out.println("Error executing Gedit.\n" + exc);
		}
		catch(InterruptedException exc) {
			System.out.println("Wait interrupted\n" + exc);
		}
	}

}
