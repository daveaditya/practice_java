/*
 * Create a Die class with one integer instance variable called sideUp. Give it a 
 * constructor and a getSideUp() method that returns the value of sideUp and a void
 * roll() method that changes sideUp to a random value from 1 to 6. 
 * (To see how to generate a random integer between 1 and 6, look at the last exercise
 * in Chapter 2.) Then create a DieDemo class with a main method that creates two Die
 * objects, rolls them, and prints the sum of the two sides up.
 *   
 */
import java.util.Random;

class Die {
	int sideUp;
	
	Die() {
		
	}
	
	Die(int sideUp) {
		this.sideUp  = sideUp;
	}
	
	int getSideUp() {
		return(sideUp);
	}
	
	void roll() throws IllegalArgumentException {
		Random num = new Random();
		sideUp = num.nextInt(7);
		if(sideUp == 0) {
			sideUp++;
		}
	}
}

class DieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die ob1 = new Die();
		Die ob2 = new Die();
		
		ob1.roll();
		ob2.roll();
		
		int sum = ob1.getSideUp() + ob2.getSideUp();
		
		System.out.println("Die 1 says " + ob1.getSideUp());
		System.out.println("Die 2 says " + ob2.getSideUp());
		System.out.println("The sum is " + sum);
	}

}
