/*
 * A simple generic class.
 * Here, T is a type parameter that will be replaces by a
 * real type when an object of type Gen is created.
 */
class Gen<T> {
	T ob;
	
	Gen(T o) {
		ob = o;
	}
	
	T getob() {
		return(ob);
	}
	
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

class GenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Integer> iOb;
		iOb = new Gen<Integer> (88);
		iOb.showType();
		
		int v = iOb.getob();
		System.out.println("value : " + v);
		
		System.out.println();
		
		Gen<String> strOb = new Gen<String>("Generics Test");
		strOb.showType();
		
		String str = strOb.getob();
		System.out.println("value : " + str);
	}

}
