// Timing program execution.

class Elapsed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start,end;
		
		System.out.println("Timing a for loop for 0 to 100,000,000");
		
		start = System.currentTimeMillis();
		
		for(long i=0 ; i < 100000000L ; i++);
		
		end = System.currentTimeMillis();
		
		System.out.println("Elapsed time: " + (end-start));
		
		/*
		 * If nanosecond precision is available.
		 * start = System.nanoTime();
		 * for(long i=0 ; i<100000000L ; i++);
		 * end = System.nanoTime();
		 */
	}

}
