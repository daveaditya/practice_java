/*
 * Write a program that creates a string and then use a for loop to split the String
 * into an array of substrings, using the comma character as the separator. For
 * example, if the sting was "abc,def,hi" , then the array it creates would be
 * {"abc","def","hi"}. It then prints out the string and the new array. Do not use the
 * split() method in the String class. 
 */
class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abc,def,hi";
		String[] substrs = new String[10];
		
		for(int i=0 ; i<substrs.length ; i++) {
			substrs[i] = "";				
		}
		
		int words = 0;
		for(int i=0 ; i<input.length() ; i++) {
			if(input.charAt(i) == ',') {
				words++;
				continue;
			}
			substrs[words] += input.charAt(i); 
		}
		
		System.out.println("The input string is : " + input);
		System.out.print("\nThe substrings are : ");
		for(int i=0 ; i<=words ; i++) {
			System.out.print(substrs[i] + " ");
		}
	}

}
