// This program demonstrates both forms of replace().

class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orgStr = "alpha beta gamma alpha beta gamma";
		String resultStr;
		
		System.out.println("Original string: " + orgStr);
		
		resultStr = orgStr.replace('g','X');
		System.out.println(resultStr);
		
		resultStr = resultStr.replace("beta","zeta");
		System.out.println(resultStr);
	}

}
