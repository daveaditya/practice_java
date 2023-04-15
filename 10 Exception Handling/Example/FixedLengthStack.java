// A fixed-length stack for characters that uses exceptions.
class FixedLengthStack implements ISimpleStack {
	
	private char[] data;
	private int tos;
	
	FixedLengthStack(int size) {
		data = new char[size];
		tos = 0;
	}
	
	FixedLengthStack(FixedLengthStack otherStack) {
		data = new char[otherStack.data.length];
		tos = otherStack.tos;
		
		for(int i=0;i<tos;i++) {
			data[i] = otherStack.data[i];
		}
	}
	
	FixedLengthStack(char[] chrs) throws StackFullException {
		data = new char[chrs.length];
		tos = 0;
		
		for(char ch : chrs) {
			push(ch);
		}
	}
	
	public void push(char ch) throws StackFullException {
		if(isFull()) {
			throw(new StackFullException(data.length));
		}
		data[tos] = ch;
		tos++;
	}
	
	public char pop() throws StackEmptyException {
		if(isEmpty()) {
			throw(new StackEmptyException());
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