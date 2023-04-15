// Demonstrate a simple generic method.
class GenericMethodsDemo {
	static < T, V extends T> boolean arraysEqual(T[] x, V[] y) {
		if(x.length != y.length) {
			return(false);
		}
		
		for(int i=0;i<x.length;i++) {
			if(!x[i].equals(y[i])) {
				return(false);
			}
		}
		
		return(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] nums = {1,2,3,4,5};
		Integer[] nums2 = {1,2,3,4,5};
		Integer[] nums3 = {1,2,7,4,5};
		Integer[] nums4 = {1,2,7,4,5,6};
		
		if(arraysEqual(nums,nums)) {
			System.out.println("nums equals nums");
		}
		
		if(arraysEqual(nums,nums2)) {
			System.out.println("nums equals nums2");
		}
		
		if(arraysEqual(nums,nums3)) {
			System.out.println("nums equals nums3");
		}
		
		if(arraysEqual(nums,nums4)) {
			System.out.println("nums equals nums4");
		}
		
		Double[] dvals = {1.1,2.2,3.3,4.4,5.5};
		
		/*
		 * This won't compile because nums and dvals are not of the same type.
		 * if(arraysEqual(nums,dvals)) {
		 * 		System.out.println("nums equals dvals");
		 * }
		 */
		
	}

}
