// Use the built-in enumeration methods.
enum Transport {
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
class EnumDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport tp;
		
		System.out.println("Here are all transport constants");
		
		Transport[] allTransports  = Transport.values();
		
		for(Transport t : allTransports) {
			System.out.println(t);
		}
		
		tp = Transport.valueOf("AIRPLANE");
		System.out.println("tp contains " + tp);
		
	}

}
