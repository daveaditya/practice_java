// Demonstrate URLConnection.
import java.net.*;
import java.io.*;
import java.util.*;

class UCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = null;
		URLConnection connection = null;
		
		try {
			URL url = new URL("http://www.mcgraw-hill.com");
			connection = url.openConnection();
			
			long d = connection.getDate();
			if(d == 0) {
				System.out.println("No date information.");
			}
			else {
				System.out.println("Date: " + new Date(d));
			}
			
			System.out.println("Content-type " + connection.getContentType());
			
			d = connection.getExpiration();
			if(d == 0) {
				System.out.println("No expiration information.");
			}
			else {
				System.out.println("Expires: " + new Date(d));
			}
			
			d = connection.getLastModified();
			if(d == 0) {
				System.out.println("No last-modified information.");
			}
			else {
				System.out.println("Last-Modified: " + new Date(d));
			}
			
			long len = connection.getContentLength();
			if(len == -1) {
				System.out.println("Content length unavailable.");
			}
			else {
				System.out.println("Content-Length: " + len);
			}
			
			if(len != 0) {
				System.out.println("=== Content ===");
				in = connection.getInputStream();
				
				int ch;
				while((ch = in.read()) != -1) {
					System.out.print((char)ch);
				}
			}
			else {
				System.out.println("No content available.");
			}
		}
		catch(IOException exc) {
			System.out.println("Connection Error :" + exc);
		}
		finally {
			try {
				if(in != null) {
					in.close();
				}
			}
			catch(IOException exc) {
				System.out.println("Error closing conneciton: " + exc);
			}
		}
	}

}
