// Demonstrate ISimpleStack.
import stackpack.*;

class ISimpleStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		char ch;
		
		ISimpleStack iStack;
		
		FixedLengthStack fixedStack = new FixedLengthStack(10);
		DynamicStack dynStack = new DynamicStack(5);
		
		iStack = fixedStack;
		
		for(i = 0;!iStack.isFull();i++) {
			iStack.push((char)('A'+i));
		}
		
		System.out.print("Contents of fixedStack : ");
		while(!iStack.isEmpty()) {
			ch = iStack.pop();
			System.out.print(ch);
		}
		
		System.out.println();
		
		iStack = dynStack;
		
		for(i = 0;i < 26; i++) {
			iStack.push((char)('A' + i));
		}
		
		System.out.print("Conetnts of dynStack : ");
		while(!iStack.isEmpty()) {
			ch = iStack.pop();
			System.out.print(ch);
		}
	}

}
