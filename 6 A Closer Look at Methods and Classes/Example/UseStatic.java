// Count instances.
class MyClass {
	static int count = 0;
	
	MyClass() {
		count++;
	}
}

class UseStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			MyClass obj = new MyClass();
			System.out.println("Number of objects created : " + MyClass.count);
		}
	}

}
