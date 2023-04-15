// Using directories.
import java.io.*;

class DirList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirname = "/media/aditya/Drive 1/Java";
		File myDir = new File(dirname);
		
		if(myDir.isDirectory()) {
			System.out.println("Directory of " + dirname);
			String[] s = myDir.list();
			
			for(int i=0;i<s.length;i++) {
				File f = new File(dirname + "/" + s[i]);
				
				if(f.isDirectory()) {
					System.out.println(s[i] + " is a directory");
				}
				else {
					System.out.println(s[i] + "  is a file");
				}
			}
		}
	}

}
