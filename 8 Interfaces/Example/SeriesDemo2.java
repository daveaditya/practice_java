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

class ByThrees implements Series {
	int start;
	int val;
	
	ByThrees() {
		start = 0;
		val = 0;
	}
	
	public int getNext() {
		val += 3;
		return(val);
	}
	
	public void reset() {
		val = start;
	}
	
	public void setStart(int x) {
		start = x;
		val = x;
	}
}

class SeriesDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByTwos twoOb = new ByTwos();
		ByThrees threeOb = new ByThrees();
		
		Series iRef;
		
		for(int i=0;i<5;i++) {
			iRef = twoOb;
			System.out.println("Next ByTwos object is : " + iRef.getNext());
			iRef = threeOb;
			System.out.println("Next ByThrees value is : " + iRef.getNext());
		}
		
	}

}
