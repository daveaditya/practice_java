/*
 * Write a program that creates an array of integers and then uses a for loop to
 * reverse the order of the elements in the array.
 */
class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {
			10, 20, 30, 40, 50, 60, 70, 80, 90, 100	
		};
		
		int temp;
		System.out.print("The contents are : ");
		for(int i : array) {
			System.out.print(i + " ");
		}
		
		for(int i=0 ; i<array.length/2 ; i++) {
			temp = array[i];
			array[i] = array[array.length - i -1];
			array[array.length - i -1] = temp;
		}
		
		System.out.print("\n\nAfter reversing the array is : ");
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

}
