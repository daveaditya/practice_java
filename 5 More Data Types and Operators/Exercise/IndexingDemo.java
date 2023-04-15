/*
 * Fill in the indexOf() method in the class below so that it uses a for loop to find
 * the index of x in data. It returns an index of -1 if x does not appear in data. For
 * example, indexOf(3) returns 2. Demonstrate your solution.
 */
class MyClass {
	int[] data = {
		1, 8, 3, 5, 4, 6, 10, 9, 2, 7	
	};
	
	int indexOf(int x) {
		for(int i=0 ; i<data.length ; i++) {
			if(data[i] == x) {
				return i+1;
			}
		}
		return -1;
	}
}

class IndexingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		System.out.println("The index of 6 is " + obj.indexOf(6));
		System.out.println("The index of 10 is " + obj.indexOf(10));
		System.out.println("The index of 20 is " + obj.indexOf(20));
	}

}
