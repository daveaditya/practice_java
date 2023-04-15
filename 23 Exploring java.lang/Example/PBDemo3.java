// Demonstrate destroy().
import java.io.IOException;

class PBDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ProcessBuilder procBldr = new ProcessBuilder("gedit","testfile");
			Process p = procBldr.start();
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException exc) {
				System.out.println("Sleep interrupted\n" + exc);
			}
			
			p.destroy();
		}
		catch(IOException exc) {
			System.out.println("Error executing gedit.\n" + exc);
		}
	}

}
