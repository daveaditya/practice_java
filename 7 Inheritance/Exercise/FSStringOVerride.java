// This class implements a "fail-soft" array which prevents run-time errors.
/*
 * Override the inherited toString() method of the FailSoftArray class so that it
 * returns a string displaying the contents of the array. For example if the array
 * contains 1,2,3, and 4, then the toString() method should return the string
 * "{1,2,3,4}".
 */

class FailSoftArray {
	private int [] a;
	private int errval;
	public int length;
	
	public FailSoftArray(int size,int errv) {
		a= new int[size];
		errval=errv;
		length=size;
	}
	
	public int get(int index) {
		if(ok(index)) {
			return(a[index]);
		}
		return(errval);
	}
	
	public boolean put(int index,int val) {
		if(ok(index)) {
			a[index]=val;
			return(true);
		}
		return(false);
	}
	
	private boolean ok(int index) {
		if(index>=0 & index<length) {
			return(true);
		}
		return(false);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str= "{";
		
		for(int i : a) {
			str += i + ",";
		}
		String output = str.substring(0, str.length() - 1);
		output += "}";
		
		return output;
	}
	
}
public class FSStringOVerride {

	public static void main(String[] args) {
		FailSoftArray fs = new FailSoftArray(5,-1);
		int x;
		
		System.out.println("Fail Quietly");
		for(int i=0;i<(fs.length*2);i++) {
			x=fs.get(i);
			if(x!=-1) {
				System.out.print(x + " ");
			}
		}
		System.out.println();
			
		System.out.println("\nFail with error reports.");
		for(int i=0;i<(fs.length*2);i++) {
			if(!fs.put(i,i*10)) {
				System.out.println("Index " + i + " out-of-bounds");
			}
		}
		
		for(int i=0;i<(fs.length*2);i++) {
			x=fs.get(i);
			if(x!=-1) {
				System.out.print(x + " ");
			}
			else {
				System.out.println("Index " + i + " out-of-bounds");
			}
			
		}
		
		System.out.println("\n\n");
		System.out.println("The array contains : " + fs);
	}

}
