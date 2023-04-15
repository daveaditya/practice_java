// A simple generic fixed-length stack.
class GenSimpleStack<T> implements IGenSimpleStack<T> {
	private T[] data;
	private int tos;
	
	GenSimpleStack(T[] arrayRef) {
		data = arrayRef;
		tos = 0;
	}
	
	public void push(T obj) throws StackFullException {
		if(isFull()) {
			throw(new StackFullException(data.length));
		}
		
		data[tos] = obj;
		tos++;
	}

	public T pop() throws StackEmptyException {
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
	
	public String toString() {
		String result = "(";
		
		for(int i=0 ; i<tos ; i++) {
			result += data[i];
			
			if(i < tos-1) {
				result += ", ";
			}
		}
		
		result +=")";
		return result;
	}

}
