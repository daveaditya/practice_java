// An interface for a simple stack that stores characters.
package stackpack;

public interface ISimpleStack {
	void push(char ch);
	char pop();
	boolean isEmpty();
	boolean isFull();
}