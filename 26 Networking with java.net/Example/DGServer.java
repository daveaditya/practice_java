// Demonstrate datagrams -- server side.
import java.net.*;
import java.io.*;

class DGServer {

	public static int clientPort = 50000;
	public static int serverPort = 50001;
	public static DatagramSocket ds;
	
	public static void dgServer() throws IOException {
		byte[] buffer;
		String str;
		
		BufferedReader conin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter characters. Enter 'stop' to quit.");
		
		for(;;) {
			str = conin.readLine();
			buffer = str.getBytes();
			ds.send(new DatagramPacket(buffer,buffer.length,InetAddress.getLocalHost(),clientPort));
			
			if(str.equals("stop")) {
				System.out.println("Server Quits.");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ds = null;
		
		try {
			ds = new DatagramSocket(serverPort);
			dgServer();
		}
		catch(IOException exc) {
			System.out.print("Communication error: " + exc);
		}
		finally {
			if(ds != null) {
				ds.close();
			}
		}
	}

}
