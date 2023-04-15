// Demonstrate rotateLeft() and rotateRight().

class Rotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -3356756;
		
		System.out.println(Integer.toBinaryString(num));
		
		num = Integer.rotateLeft(num,2);
		System.out.println(Integer.toBinaryString(num));
		
		num = Integer.rotateRight(num,2);
		System.out.println(Integer.toBinaryString(num));
	}

}
