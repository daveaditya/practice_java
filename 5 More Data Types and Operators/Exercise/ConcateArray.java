/*
 * Write a program that creates two integer arrays, data1 and data2, possibly of
 * different lengths. Then it uses for loops to create a new array data3 whose
 * length is the sum of the lengths of data1 and data2 and whose contents consists
 * of the contents of data1 followed by the contents of data2. For example, if the two
 * arrays are {1,2,3} and {4,5,6,7}, then the code should create the new array
 * {1,2,3,4,5,6,7}. 
 */
class ConcateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data1 = {
				1, 2, 3
		};
		
		int[] data2 = {
				4, 5, 6, 7
		};
		
		int[] data3 = new int[data1.length + data2.length];
		int index = 0;
		
		for(int i : data1) {
			data3[index] = i;
			index++;
		}
		
		for(int i : data2) {
			data3[index] = i;
			index++;
		}
		
		System.out.print("The array data1 has the following contents : ");
		for(int i : data1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("The array data2 has the following contents : ");
		for(int i : data2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("The new array data3 has the following contents : ");
		for(int i : data3) {
			System.out.print(i + " ");
		}
	}

}
