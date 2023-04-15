// Controlling the main thread.
class UseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thrd;
		
		thrd = Thread.currentThread();
		
		System.out.println("Main thread is called : " + thrd.getName());
		
		System.out.println("Priority : " + thrd.getPriority());
		
		System.out.println();
		
		System.out.println("Setting name.\n");
		
		thrd.setName("Thread #1");
		
		System.out.println("Main thread is now called : " + thrd.getName());
	}

}
