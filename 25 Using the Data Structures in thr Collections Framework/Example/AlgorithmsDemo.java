// Demonstrate several Algorithms.
import java.util.*;

class AlgorithmsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Character> ll =new LinkedList<>();
		
		for(int i=0 ; i<26 ; i+=2) {
			ll.add((char)('A' + i));
			ll.add((char)('Z' - i));
		}
		
		System.out.print("Original list: ");
		for(char ch : ll) {
			System.out.print(ch);
		}
		
		System.out.println();
		
		Collections.sort(ll);
		System.out.print("List sorted: ");
		for(char ch : ll) {
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.println("Using binarySearch() to find X.");
		int i = Collections.binarySearch(ll,'X');
		if(i >= 0) {
			System.out.println("X found. Index is " + i);
		}
		
		System.out.println();
		
		Collections.reverse(ll);
		System.out.print("List reversed: ");
		for(char ch : ll) {
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		Collections.rotate(ll,5);
		System.out.print("List rotated: ");
		for(char ch : ll) {
			System.out.print(ch);
		}
		
		System.out.print("\n");
		
		ll = new LinkedList<>();
		
		String str = "this is a test";
		for(char ch : str.toCharArray()) {
			ll.add(ch);
		}
		
		System.out.print("Here is the new list: ");
		for(char ch : ll) {
			System.out.print(ch);
		}
		
		System.out.println();
		
		Collections.replaceAll(ll,'t','*');
		System.out.print("After replacements: ");
		for(char ch : ll) {
			System.out.print(ch);
		}
	}

}
