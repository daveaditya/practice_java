// This program creates two Vehicle objects.
class Vehicle {
	int passengers;
	int fuelCap;
	int mpg;
}

class TwoVehicles {
	public static void main(String[] args) {
		Vehicle minivan=new Vehicle();
		Vehicle sportscar=new Vehicle();
		
		int range1,range2;
		
		minivan.passengers=7;
		minivan.fuelCap=16;
		minivan.mpg=21;
		
		sportscar.passengers=2;
		sportscar.fuelCap=12;
		sportscar.mpg=12;
		
		range1=minivan.fuelCap*minivan.mpg;
		range2=sportscar.fuelCap*sportscar.mpg;
		
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);
		System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2);
	}
}
