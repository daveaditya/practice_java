// Demonstrate ArrayDeque.
// First use the deque as a stack.
// Then, use it as a FIFO queue.
import java.util.*;

class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque <Character> adq = new ArrayDeque<>();
		
		System.out.println("Using adq as a stack");
		
		System.out.print("Pushing: ");
		
		for(char ch='A' ; ch<='Z' ; ch++) {
			adq.push(ch);
			System.out.print(ch + " ");
		}
		
		System.out.println();
		
		System.out.print("Popping: ");
		while(adq.peek() != null) {
			System.out.print(adq.pop() + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("Using adq as a FIFO queue.");
		System.out.print("Queueing: ");
		for(char ch='A' ; ch<='Z' ; ch++) {
			adq.offerLast(ch);
			System.out.print(ch + " ");
		}
		
		System.out.println();
		
		System.out.print("Removing: ");
		while(adq.peek() != null) {
			System.out.print(adq.pollFirst() + " ");
		}
	}

}
