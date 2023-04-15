/*
 * Write a program that creates an integer array and then uses a for loop to check
 * whether the array is sorted from smallest to largest. If so, it prints "Sorted".
 * Otherwise, it prints "Not Sorted".
 */
class IsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data1 = {
				10,20,30,40,50,60,70,80,90,100	
		};

		int[] data2 = {
				100,90,80,70,60,50,40,30,20,10	
		};

		boolean sorted = true;
		for(int i=1 ; i<data1.length ; i++) {
			if(data1[i-1] > data1[i]) {
				sorted = false;
			}
		}

		System.out.println("Data1 array is " + (sorted ? "Sorted" : "Not Sorted"));

		sorted = true;
		for(int i=1 ; i<data1.length ; i++) {
			if(data2[i-1] > data2[i]) {
				sorted = false;
			}
		}

		System.out.println("Data2 array is " + (sorted ? "Sorted" : "Not Sorted"));
	}

}
