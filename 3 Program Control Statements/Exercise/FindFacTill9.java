// Use nested loops to find factors of number between 2 and 100.
// Modified to stop when it finds a number with exactly nine factors.

class FindFacTill9 {

	public static void main(String[] args) {
		for(int i=2;true;i++) {
			int count = 0;
			System.out.print("Factors of " + i + " : ");
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
					System.out.print(j + "  ");
				}
			}
			if(count == 9) {
				break;
			}
			else {
				count = 0;
			}
			System.out.println();
		}

	}

}
