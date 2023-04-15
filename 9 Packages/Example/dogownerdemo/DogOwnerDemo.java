package dogownerdemo;

import owner.*;

class DogOwnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Owner owner = new Owner("Fred",new Dog("Sam"));
		System.out.println(owner);
	}

}
