// LinkedList compared with HashSet and TreeSet.
import java.util.*;

class SetsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chrs = {
			'V', 'J', 'L', 'E', 'T', 'Q', 'C', 'P'	
		};
		
		TreeSet <Character> ts = new TreeSet<>();
		HashSet <Character> hs = new HashSet<>();
		LinkedHashSet <Character> lhs = new LinkedHashSet<>();
		
		System.out.print("Conetens of chrs : ");
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
		
		for(char ch : chrs) {
			lhs.add(ch);
		}
		
		System.out.println("Contents of linked hash set: " + lhs);
		
	}

}
