// This program demonstrates both forms of substring().

class UseSubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orgStr = "This is a test. This is, too.";
		String searchStr = "is";
		String subStr = "was";
		String resultStr= "";
		int i;
		
		System.out.println("Original string: " + orgStr);
		
		i = orgStr.indexOf(".") + 2;
		String str = orgStr.substring(i);
		System.out.println("Second sentencs: " + str + "\n");
		
		System.out.println("Progressively replacing " + searchStr + " with " + subStr);
		
		do {
			System.out.println(orgStr);
			
			i = orgStr.indexOf(searchStr);
			
			if(i != -1) {
				resultStr = orgStr.substring(0,i);
				resultStr = resultStr + subStr;
				resultStr = resultStr + orgStr.substring(i + searchStr.length());
				orgStr = resultStr;
			}
			
		}
		while(i != -1);
	}

}
