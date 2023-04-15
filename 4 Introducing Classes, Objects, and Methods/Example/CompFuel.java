// Add a parameterized method that computes the fuel required for a given
// distance.
class Vehicle {
	int passengers;
	int fuelCap;
	int mpg;
	
	int range() {
		return(mpg*fuelCap);
	}
	
	double fuelNeeded(int miles) {
		return((double)miles/mpg);
	}
}

class CompFuel {

	public static void main(String[] args) {
		Vehicle minivan=new Vehicle();
		Vehicle sportscar=new Vehicle();
		
		double gallons;
		int dist=252;
		
		minivan.passengers=7;
		minivan.fuelCap=16;
		minivan.mpg=21;
		
		sportscar.passengers=2;
		sportscar.fuelCap=14;
		sportscar.mpg=12;
		
		gallons=minivan.fuelNeeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		
		gallons=sportscar.fuelNeeded(dist);
		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
		
	}

}
