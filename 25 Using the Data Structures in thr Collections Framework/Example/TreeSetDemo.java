// A TreeSet creates a sorted tree.
import java.util.*;

class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chrs = {
			'V', 'J', 'L', 'E', 'T', 'Q', 'C', 'P'	
		};
		
		TreeSet<Character> ts = new TreeSet<>();
		HashSet<Character> hs = new HashSet<>();
		
		System.out.print("Contests of chrs: ");
		for(char ch : chrs) {
			System.out.print(ch + " ");
		}
		
		System.out.println();
		
		for(char ch : chrs) {
			hs.add(ch);
		}
		
		System.out.println("Contents of hash set: " + hs);
		
		for(char ch : chrs) {
			ts.add(ch);
		}
		
		System.out.println("Contents of tree set: " + ts);
	}

}
