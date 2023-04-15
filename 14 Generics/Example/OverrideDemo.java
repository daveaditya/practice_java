// Overriding a generic method in a generic class.
class Gen <T> {
	T ob;
	
	Gen(T o) {
		ob = o;
	}
	
	T getob() {
		System.out.print("Gen's getob() : ");
		return(ob);
	}
}

class Gen2<T> extends Gen<T> {
	Gen2(T o) {
		super(o);
	}
	
	T getob() {
		System.out.print("Gen2's getob() : ");
		return(ob);
	}
}

class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen <?> gRef;
		
		Gen <Integer> iOb = new Gen <Integer> (88);
		
		Gen2 <Integer> iOb2 = new Gen2 <Integer> (99);
		
		Gen <String> strOb2 = new Gen <String> ("Generics Test");
		
		gRef = iOb;
		System.out.println(gRef.getob());
		
		gRef = iOb2;
		System.out.println(gRef.getob());
		
		gRef = strOb2;
		System.out.println(gRef.getob());
		
	}

}
