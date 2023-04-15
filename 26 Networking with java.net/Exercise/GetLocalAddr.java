/*
 * Write a program that outputs the host name and numerical IP address for your local
 * host machine.
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

class GetLocalAddr {

	public static void main(String[] args) {
		try {
			InetAddress myLocalHost = InetAddress.getLocalHost();
			System.out.println("Host Name : " + myLocalHost.getHostName());
			System.out.println("IP Address : " + myLocalHost.getHostAddress() + "\n");
			
			byte[] a = {
					(byte) 0xFF,(byte) 0xFF,(byte) 0xFF,(byte) 0xFF
			};
			for(byte b : a) {
				System.out.println(Byte.toUnsignedInt(b) + "\t");
			}
		}
		catch(UnknownHostException exc) {
			System.out.println("Exception : " + exc.getMessage());
		}
		
		
		
	}

}
