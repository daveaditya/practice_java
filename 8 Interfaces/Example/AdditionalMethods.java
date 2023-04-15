// Implementing an Interface. And add additional method getPriorVal().
interface Series {
	int getNext();
	void reset();
	void setStart(int x);
}

class ByTwos implements Series {
	int start;
	int val;
	int priorVal;
	
	ByTwos() {
		start = 0;
		val = 0;
		priorVal = -2;
	}
	
	public int getNext() {
		priorVal = val;
		val += 2;
		return(val);
	}
	
	public void reset() {
		val = start;
		priorVal = start - 2;
	}
	
	public void setStart(int x) {
		start = x;
		val = x;
		priorVal = x - 2;
	}
	
	int getPriorVal() {
		return(priorVal);
	}
}

class SeriesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByTwos ob = new ByTwos();
		
		for(int i=0;i<5;i++) {
			System.out.println("Nect value is " + ob.getNext());
		}
		
		System.out.println("\nResetting");
		ob.reset();
		for(int i=0;i<5;i++) {
			System.out.println("Nect value is " + ob.getNext());
		}
		
		System.out.println("\nStarting ar 100");
		ob.setStart(100);
		for(int i=0;i<5;i++) {
			System.out.println("Nect value is " + ob.getNext());
		}
	}

}
