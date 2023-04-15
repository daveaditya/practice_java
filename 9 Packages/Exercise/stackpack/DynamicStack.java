// A growable stack for characters.
package stackpack;
public class DynamicStack implements ISimpleStack {
	
	private char[] data;
	private int tos;
	
	public DynamicStack(int size) {
		data = new char[size];
		tos = 0;
	}
	
	public DynamicStack(DynamicStack otherStack) {
		data = new char[otherStack.data.length];
		tos = otherStack.tos;
		
		for(int i=0;i<tos;i++) {
			data[i] = otherStack.data[i];
		}
	}
	
	public DynamicStack(char[] chrs) {
		data = new char[chrs.length];
		tos = 0;
		
		for(char ch : chrs) {
			push(ch);
		}
	}
	
	public void push(char ch) {
		if(tos == data.length) {
			char[] t = new char[data.length*2];
			
			for(int i=0;i<tos;i++) {
				t[i] = data[i];
			}
			data = t;
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
		return(false);
	}
}