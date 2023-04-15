// Demonstrate the bubble sort.
class BubbleString {

	public static void main(String[] args) {
		String[] chrs={
				"DD", "UU", "AA", "BB", "CC"
		};
		
		int a,b;
		String t;
		int size;
		
		size=5;
		
		System.out.print("Original array is: ");
		for(int i=0;i<size;i++) {
			System.out.print(" " + chrs[i]);
		}
		System.out.println();
		
		for(a=1 ; a<size ; a++) {
			for(b=size-1 ; b>=a ; b--) {
				if(chrs[b-1].compareTo(chrs[b]) > 0) {
					t = chrs[b-1];
					chrs[b-1] = chrs[b];
					chrs[b] = t;
				}
			}			
		}
		
		System.out.print("Sorted array is : ");
		for(int i=0;i<size;i++) {
			System.out.print(" " + chrs[i]);
		}
		System.out.println();

	}

}
