/*
 * Note that, if the bubble sort's inner loop never exchanges any pairs of values,
 * then the array is sorted and so the sorting routine can stop. Modify the code so
 * that the bubble sort stops sorting as soon as the inner loop never exchanges any
 * values.
 */
class Bubble {

	public static void main(String[] args) {
		int[] nums={99,-10,100123,18,-978,5623,463,-9,287,49};
		
		int a,b,t;
		int size;
		
		size=10;
		
		System.out.print("Original array is: ");
		for(int i=0;i<size;i++) {
			System.out.print(" " + nums[i]);
		}
		System.out.println();
		
		for(a=1 ; a<size ; a++) {
			boolean xchg = false;
			for(b=size-1 ; b>=a ; b--) {
				if(nums[b-1] > nums[b]) {
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
					xchg = true;
				}
			}
			if(xchg == false) {
				break;
			}
		}
		
		System.out.print("Sorted array is : ");
		for(int i=0;i<size;i++) {
			System.out.print(" " + nums[i]);
		}
		System.out.println();

	}

}
