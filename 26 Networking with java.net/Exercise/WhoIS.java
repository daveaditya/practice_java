/* Take any number of domain names as arguments on the command line and send them
   to the "whois" port of the whois.internic.net server. For each domain name argument, 
   it outputs the data received from the socket. If there are no arguments, it doesn't output
   anything. Note that you will need to close the socket and create a new one after receiving
   each response from the socket.
*/
import java.net.*;
import java.io.*;

class WhoIS {

	public static void main(String[] args) {
		
		int ch;
		
		if(args.length == 0) {
			System.out.println("Usage : WhoIS URL1[ ... URLn]");
			return;
		}
		
		for(String str : args) {
			
			System.out.println("\n\n" + str.toUpperCase() + "\n\n\n");
			

			try ( Socket socket = new Socket("whois.internic.net",43)) {
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				
				str += "\n";
				
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
		}
	}

}
