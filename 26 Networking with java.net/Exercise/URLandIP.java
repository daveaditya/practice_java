/*
 * Write a method getIPSegment() that takes a host name as its parameter and returns an array
 * of strings, one string containing each segment (separated by periods) of a numerical IP
 * address. For example, if the host name's IP Address is 111.222.333.444, then the method
 * should return the array {"111","222","333","444"}. Your method should work for both IPv4
 * and IPv6 addresses. Your method should throw an UnknownHostException if it can't find the
 * host. Write a test program for your method. 
 */
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

class URLandIP {
	static String[] getIPSegements(String hostname) throws UnknownHostException {
		InetAddress myNet = Inet6Address.getByName(hostname);
		String ip = myNet.getHostAddress();		
		System.out.println("Host name : " + hostname);
		System.out.println("IP Address : " + ip);
		String[] segments = ip.split(Pattern.quote("."));
		return(segments);
	}

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage : URLandIP hostname");
			return;
		}

		try {
			String[] segments = getIPSegements(args[0]);
			System.out.print("\nSegments: ");
			for(String s : segments) {
				System.out.print(s + "\t");
			}
		}
		catch(Exception exc) {
			System.out.println("Exception : " + exc.getMessage());
		}
	}

}
