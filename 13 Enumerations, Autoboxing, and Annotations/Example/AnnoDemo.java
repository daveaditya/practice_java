// An example that uses @Deprecated.
@Deprecated
class MyClass {
	private String msg;
	
	MyClass(String m) {
		msg = m;
	}
	
	@Deprecated
	String getMsg() {
			return(msg);
	}
	
	//..
	
}

class AnnoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myObj = new MyClass("test");
		
		System.out.println(myObj.getMsg());
	}

}
