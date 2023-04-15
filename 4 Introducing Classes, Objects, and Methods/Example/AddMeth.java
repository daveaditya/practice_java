// Add range to Vehicle.
class Vehicle {
	int passengers;
	int fuelCap;
	int mpg;
	
	void range() {
		System.out.println("Range is " + fuelCap*mpg);
	}
}

class AddMeth {

	public static void main(String[] args) {
		Vehicle minivan=new Vehicle();
		Vehicle sportscar=new Vehicle();
		
		minivan.passengers=7;
		minivan.fuelCap=16;
		minivan.mpg=21;
		
		sportscar.passengers=2;
		sportscar.fuelCap=14;
		sportscar.mpg=12;
		
		System.out.print("Minivan can carry " + minivan.passengers + ".");
		minivan.range();
		
		System.out.print("Soportscar can carry " + sportscar.passengers + ".");
		sportscar.range();

	}

}
