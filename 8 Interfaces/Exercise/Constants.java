/*
 * Create a new class Constants that implements the Series interface. Its getNext()
 * method repeatedly returns the last value passed in as an argument to the setStart()
 * method. Until setStart() is called, it returns 0.
 */
interface Series {
	int getNext();
	void reset();
	void setStart(int x);
}

class Constants implements Series {
	int x = 0;
	
	public int getNext() {
		return x;
	}
	
	public void reset() {
		x = 0;
	}
	
	public void setStart(int x) {
		this.x = x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constants ob = new Constants();
		System.out.println("x = " + ob.getNext());
		System.out.println("x = " + ob.getNext());
		System.out.println("x = " + ob.getNext());
		ob.setStart(10);
		System.out.println("x = " + ob.getNext());
		ob.setStart(20);
		System.out.println("x = " + ob.getNext());
		ob.setStart(30);
		System.out.println("x = " + ob.getNext());
	}

}
