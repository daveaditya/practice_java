// Demonstrate Sockets.
import java.net.*;
import java.io.*;

class SocketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Socket socket = null;
		
		try {
			socket = new Socket("whois.internic.net",43);
			
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			String str = (args.length == 0 ? "mcgraw-hill.com" : args[0]) + "\n";
			
			byte[] buf = str.getBytes();
			out.write(buf);
			
			out.write(buf);
			
			while((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
			
		}
		catch(IOException exc) {
			System.out.println(exc);
		}
		finally {
			try {
				if(socket !=  null) {
					socket.close();
				}
			}
			catch(IOException exc) {
				System.out.println("Error closing socket: " + exc);
			}
		}
	}

}
