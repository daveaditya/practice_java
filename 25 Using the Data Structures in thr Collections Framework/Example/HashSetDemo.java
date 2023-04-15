// Demonstrate HashSet.
import java.util.*;

class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Character> hs = new HashSet<>();
		
		hs.add('A');
		hs.add('B');
		hs.add('C');
		hs.add('D');
		System.out.println("Original contents: " + hs);
		
		hs.add('E');
		hs.add('F');
		hs.add('G');
		hs.add('H');
		System.out.println("\nContents after additions: " + hs);
		
		hs.remove('E');
		hs.remove('H');
		System.out.println("\nConents after deleting E and H: " + hs);
		
		hs.add('E');
		System.out.println("\nContents after adding E: " + hs);
		
		ArrayList<Character> al = new ArrayList<>();
		al.add('X');
		al.add('Y');
		al.add('Z');
		
		hs.addAll(al);
		
		System.out.println("\nConentes after adding colleciton: " + hs);
	}

}
