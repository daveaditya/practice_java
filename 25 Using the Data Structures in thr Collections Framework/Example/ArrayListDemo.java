// Demonstrate ArrayList.
import java.util.*;

class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> al = new ArrayList<>();
		
		System.out.println("Initial size: " + al.size());
		
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('D');
		al.add('E');
		
		System.out.println("\nSize after additions: " + al.size());
		
		for(int i=0 ; i<3 ; i++) {
			al.add(2,(char)('x'+i));
		}
		
		System.out.println("\nSize after additions: " + al.size());
		System.out.println("Contents: " + al);
		
		for(int i=0 ; i<3 ; i++) {
			al.remove(2);
		}
		
		System.out.println("\nSize after deletions: " + al.size());
		System.out.println("Contents: " + al);
		
		for(int i=0 ; i<al.size() ; i++) {
			al.set(i,Character.toLowerCase(al.get(i)));
		}
		
		System.out.println("\nAfter changing to lowercase.");
		System.out.println("Contents: " + al);
		
		int idx = al.indexOf('d');
		
		if(idx >= 0) {
			al.remove(idx);
		}
		
		System.out.println("\nAfter finding and removing d.");
		System.out.println("Contents: " + al);
		
		al.clear();
		System.out.println("\nAfter clearing the list.");
		System.out.println("Contents: " + al);
		
		for(int i=0 ; i<10 ; i++) {
			al.add((char)('0' + i));
		}
		
		System.out.print("\nHere is every other digit: ");
		for(int i=0 ; i<al.size() ; i+=2) {
			System.out.print(al.get(i) + " ");
		}
		
	}

}
