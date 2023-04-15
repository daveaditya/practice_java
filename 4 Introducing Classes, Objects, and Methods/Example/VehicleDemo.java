// A program that uses the Vehicle class.
class Vehicle {
	int passengers;
	int fuelCap;
	int mpg;
}

class VehicleDemo {

	public static void main(String[] args) {
		Vehicle minivan=new Vehicle();
		int range;
		
		minivan.passengers=7;
		minivan.fuelCap=16;
		minivan.mpg=21;
		
		range=minivan.fuelCap*minivan.mpg;
		
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);

	}

}
