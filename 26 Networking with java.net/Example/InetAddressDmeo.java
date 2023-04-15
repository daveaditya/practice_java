// Demonstrate InetAddress.
import java.net.*;

class InetAddressDmeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress address = InetAddress.getByName("www.mcgraw-hill.com");
			System.out.println("Host name: " + address.getHostName());
			System.out.println("Address: " + address.getHostAddress());
			
			System.out.println();
			
			address = InetAddress.getByName("www.mhhe.com");
			System.out.println("Host name: " + address.getHostName());
			System.out.println("Address: " + address.getHostAddress());
			
			System.out.println();
			
			address = InetAddress.getByName("www.mheducation.com");
			System.out.println("Host name: " + address.getHostName());
			System.out.println("Address: " + address.getHostAddress());
			
			System.out.println();
		}
		catch(UnknownHostException exc) {
			System.out.println(exc);
		}
	}

}
