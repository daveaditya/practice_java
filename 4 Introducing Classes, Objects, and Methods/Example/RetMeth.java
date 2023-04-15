// Use a return value.
class Vehicle {
	int passengers;
	int fuelCap;
	int mpg;
	
	int range() {
		return(mpg*fuelCap);
	}
}

class RetMeth {

	public static void main(String[] args) {
		Vehicle minivan=new Vehicle();
		Vehicle sportscar=new Vehicle();
		
		int range1,range2;
		
		minivan.passengers=7;
		minivan.fuelCap=16;
		minivan.mpg=21;

		sportscar.passengers=2;
		sportscar.fuelCap=14;
		sportscar.mpg=12;
		
		range1=minivan.range();
		range2=sportscar.range();
		
		System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " miles");
		System.out.println("Sportscar can carry " + sportscar.passengers + " with range of " + range2 + " miles");
		
	}

}
