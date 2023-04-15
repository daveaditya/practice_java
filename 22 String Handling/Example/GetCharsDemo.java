// Demonstrate getChars().
class GetCharsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Programming is both art and science.";
		int start  = 15;
		int end = 23;
		
		char[] buf = new char[end-start];
		
		str.getChars(start,end,buf,0);
		System.out.println(buf);
	}

}
