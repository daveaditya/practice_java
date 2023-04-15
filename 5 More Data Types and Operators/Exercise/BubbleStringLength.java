/*
 * Change the bubble sort code so that it sorts an array of strings by their length
 * (instead of sorting them alphabetically). Demonstrate that it works.
 */
class BubbleStringLength {

	public static void main(String[] args) {
		String[] chrs={
				"DED", "UU", "A", "BGGB", "CPPPU"
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
				if(chrs[b-1].length() >  chrs[b].length()) {
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
