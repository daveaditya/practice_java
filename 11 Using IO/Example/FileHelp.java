/*
 * A help program that uses a disk file
 * to store help information.
 * 
 * This code requires JDK 7 or later.
 */
import java.io.*;

/*
 * The help class opens a help file.
 * searches for a topic, and then displays
 * the information associated with that topic.
 * Notice that it handles all I/O exceptions
 * itself, avoiding the need for calling
 * code to do so.
 */

class Help {
	String helpfile;
	
	Help(String fname) {
		helpfile = fname;
	}
	
	boolean helpOn(String what) {
		int ch;
		String topic, info;
		
		try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
			
			do {
				ch = helpRdr.read();
				
				if(ch == '#') {
					topic = helpRdr.readLine();
					topic = topic.trim();
					
					if(what.compareTo(topic) == 0) {
						
						do {
							info = helpRdr.readLine();
							
							if(info != null) {
								System.out.println(info);
							}
							
						} while((info != null) && (info.trim().compareTo("") != 0));
						
						return(true);
					}
				}
			} while(ch != -1);
		}
		catch (IOException exc) {
			System.out.println("Error accessing help file.");
			return(false);
		}
		return(false);
	}
	
	String getSelection() {
		String topic = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter topic : ");
		
		try {
			topic = br.readLine();
		}
		catch (IOException exc) {
			System.out.println("Error reading console.");
		}
		return(topic);
	}
}



class FileHelp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Help hlpObj = new Help("helpfile.txt");
		String topic;
		
		System.out.println("Try the help system. " + "Enter 'stop' to end.");
		
		do {
			topic = hlpObj.getSelection();
			
			if(!hlpObj.helpOn(topic)) {
				System.out.println("Topic not found.\n");
			}
		} while(topic.compareTo("stop") != 0);
	}

}
