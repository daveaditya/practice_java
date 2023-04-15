// Directory of .java files.
import java.io.*;

class FilterExt implements FilenameFilter {
	String ext;
	
	public FilterExt(String ext) {
		this.ext = "." + ext;
	}
	
	public boolean accept(File dir,String name) {
		return(name.endsWith(ext));
	}
}

class DirListFiltered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilenameFilter only = new FilterExt("java");
		String dirname = "Working";
		File myDir = new File(dirname);
		
		if(myDir.isDirectory()) {
			System.out.println("Java some files in " + dirname);
			
			String[] s= myDir.list(only);
			
			for(int i=0;i<s.length;i++) {
				System.out.println(s[i]);
			}
		}
	}

}
