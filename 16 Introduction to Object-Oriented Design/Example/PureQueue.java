import java.util.ArrayDeque;

class PureQueue <E> {
	private ArrayDeque<E> data;
	
	public PureQueue() {
		data = new ArrayDeque<E>();
	}
	
	void enqueue(E o) {
		data.offer(o);
	}
	
	E dequeue() {
		return(data.poll());
	}
	
	E peek() {
		return(data.peek());
	}
	
	int size() {
		return(data.size());
	}
	
	public String toString() {
		return(data.toString());
	}
}
