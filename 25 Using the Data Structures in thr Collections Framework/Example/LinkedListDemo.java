// Demonstrate LinkedList.
import java.util.*;

class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Character> ll = new LinkedList<>();
		
		ll.add('B');
		ll.add('E');
		ll.add('F');
		System.out.println("Original contents: " + ll);
		
		ll.addLast('G');
		ll.addFirst('A');
		System.out.println("\nAfter calls to addFirst() and addLast().");
		System.out.println("Contents: " + ll);
		
		ll.add(2,'D');
		ll.add(2,'C');
		System.out.println("\nAfter insertions.");
		System.out.println("Contents: " + ll);
		
		System.out.println("\nHere are the first and last elements: " + ll.getFirst() + " " + ll.getLast());
		
		List<Character> sub = ll.subList(2,5);
		System.out.println("\nConentes of sublist view: " + sub);
		
		LinkedList<Character> ll2 = new LinkedList<>(sub);
		
		ll.removeAll(ll2);
		
		System.out.println("\nAfter removing ll2 from ll.");
		System.out.println("Contents: " + ll);
		
		ll.removeFirst();
		ll.removeFirst();
		
		System.out.println("\nAfter deleting first and last element: ");
		System.out.println("Contents: " + ll);
		
		ll.set(0,Character.toLowerCase(ll.get(0)));
		
		System.out.println("\nAfter change: " + ll);
	}

}
