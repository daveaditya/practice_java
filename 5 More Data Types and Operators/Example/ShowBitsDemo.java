/*
 * A class that stores the number of bits that will be displayed. It then
 * implements the showBits() method, which displays that number of bits for th ebinary
 * representation of the value that it is passed.
 */
class BitOut {
	int numBits;
	
	BitOut(int n) {
		if(n<1) {
			n=1;			
		}
		
		if(n>64) {
			n=64;
		}
		numBits = n;
	}
	
	void showBits(long val) {
		long mask = 1;
		
		mask <<= numBits-1;
		
		int spacer = 8 - (numBits % 8);
		for(;mask!=0;mask>>>=1) {
			if((val & mask) != 0) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
			
			spacer++;
			
			if((spacer % 8) == 0) {
				System.out.print(" ");
				spacer=0;
			}
		}
		System.out.println();		
	}
}

class ShowBitsDemo {

	public static void main(String[] args) {
		BitOut b = new BitOut(8);
		BitOut i = new BitOut(32);
		BitOut li = new BitOut(64);

		System.out.println("123 in binary: ");
		b.showBits(123);
		
		System.out.println("\n87987 in binary: ");
		i.showBits(87987);
		
		System.out.println("\n237658768 in binary: ");
		li.showBits(237658768);
		
		System.out.println("\nLow order 8 bits of 87987 in binary: ");
		b.showBits(87987);
		
	}

}
