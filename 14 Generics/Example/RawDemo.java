// Demonstrate a raw type.
class Gen <T> {
	T ob;
	
	Gen(T o) {
		ob = o;
	}
	
	T getob() {
		return(ob);
	}
}

class RawDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen <Integer> iOb = new Gen <Integer> (88);
		
		Gen <String> strOb = new Gen <String> ("Generics Test");
		
		Gen raw = new Gen(new Double(98.6));
		
		double d = (Double)raw.getob();
		System.out.println("value : " + d);
		
		/*
		 * The use of raw type can lead to run-time.
		 * exceptions. Here are some examples.
		 * 
		 * The following cast causes a run-time error!
		 * int i = (Integer)raw.getob();
		 * 
		 * This assignment overrides type safety.
		 */
		
		strOb = raw;
		// String str = strOb.getob(); // run-time error
		
		// This assignment also overrides type safety.
		raw = iOb; // Ok, but potentially wrong.
		// d = (Double)raw.getob(); //run-time error.
	}

}
