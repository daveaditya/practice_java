// Program to demonstrate recursion.
class Printer {
	void printArray(int[] array) {
		printArrayAux(array,0);
		System.out.println();
	}
	
	void printArrayAux(int[] array,int index) {
		if(index==array.length) {
			return;
		}
		else {
			System.out.print(array[index] + " ");
			printArrayAux(array,index+1);
		}
	}
}

class PrinterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		int[] array = {3,1,4,2,5,7,6,8};
		
		printer.printArray(array);
	}

}
