// A fixed-length stack for characters.
package stackpack;
public class FixedLengthStack implements ISimpleStack {
	
	private char[] data;
	private int tos;
	
	public FixedLengthStack(int size) {
		data = new char[size];
		tos = 0;
	}
	
	public FixedLengthStack(FixedLengthStack otherStack) {
		data = new char[otherStack.data.length];
		tos = otherStack.tos;
		
		for(int i=0;i<tos;i++) {
			data[i] = otherStack.data[i];
		}
	}
	
	public FixedLengthStack(char[] chrs) {
		data = new char[chrs.length];
		tos = 0;
		
		for(char ch : chrs) {
			push(ch);
		}
	}
	
	public void push(char ch) {
		if(isFull()) {
			System.out.println(" -- Stack is full.");
			return;
		}
		data[tos] = ch;
		tos++;
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println(" -- Stack is empty.");
			return((char)0);
		}
		tos--;
		return(data[tos]);
	}
	
	public boolean isEmpty() {
		return(tos == 0);
	}
	
	public boolean isFull() {
		return(tos == data.length);
	}
	
}