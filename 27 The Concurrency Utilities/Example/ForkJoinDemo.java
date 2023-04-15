// A simple example of the basic divide-and-conquer strategy.
// In this case, RecursiveAction is used.
import java.util.concurrent.*;
//import java.util.*;

class SqrtTransform extends RecursiveAction {

	private static final long serialVersionUID = 1L;
	final int seqThreshold = 1000;
	double[] data;
	int start,end;
	
	SqrtTransform(double[] vals,int s,int e) {
		data = vals;
		start = s;
		end = e;
	}
	
	protected void compute() {
		if((end-start) < seqThreshold) {
			for(int i=start ; i<end ; i++) {
				data[i] = Math.sqrt(data[i]);
			}
		}
		else {
			int middle = (start+end) / 2;
			invokeAll(new SqrtTransform(data,start,middle),new SqrtTransform(data,middle,end));
		}
	}
}

class ForkJoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForkJoinPool fjp = new ForkJoinPool();
		
		double[] nums = new double[100000];
		
		for(int i=0 ; i<nums.length ; i++) {
			nums[i] =  (double)i;
		}
		
		System.out.println("A portion of the  original seqence: ");
		
		for(int i=0 ; i<10 ; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n");
		
		SqrtTransform task = new SqrtTransform(nums,0,nums.length);
		
		fjp.invoke(task);
		
		System.out.println("A portion of the transformed sequence " + "(to four decimal places):");
		
		for(int i=0 ; i<10 ; i++) {
			System.out.format("%.4f ",nums[i]);
		}
		System.out.println();
	}

}
