// Demonstrate HttpURLConnectionDemo.
import java.net.*;
import java.io.*;
import java.util.*;

class CountHeaderFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://www.mcgraw-hill.com");
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			
			System.out.println("Request method is " + connection.getRequestMethod());
			System.out.println("Reponse  code is " + connection.getResponseCode());
			System.out.println("Response Message is " + connection.getResponseMessage());
			
			Map <String,List<String>> hdrMap  = connection.getHeaderFields();
			Set <String> hdrKeys = hdrMap.keySet();
			
			System.out.println("\nHere is the header: ");
			
			for(String k : hdrKeys) {
				System.out.println("Key: " + k + " Value: " + hdrMap.get(k));
			}
			
			System.out.println("\n\nNumber of headers : " + connection.getHeaderFields().size());
		}
		catch(IOException exc) {
			System.out.println(exc);
		}
	}

}
