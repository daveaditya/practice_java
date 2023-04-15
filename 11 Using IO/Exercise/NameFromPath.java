/*
 * Create a method nameFromPath() that takes as its parameter a string containing the
 * full path name of a file or directory. Have it return just the name of the file
 * or directory. For example, the call nameFromPath("/usr/etc/abc.txt") returns
 * "abc.txt".
 */
class NameFromPath {

	public static String nameFromPath(String name) {
		String file = null;
		int pos = name.lastIndexOf('/');
		file = name.substring(pos+1, name.length());
		return file;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("File name from /usr/etc/abc.txt is : " + nameFromPath("/usr/etc/abc.txt"));
		System.out.println("Directory name from /usr/etc is : " + nameFromPath("/usr/etc"));
		System.out.println("Directory from /usr is : " + nameFromPath("/usr"));
	}

}
