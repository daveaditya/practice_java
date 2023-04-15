// Build a subclass of Vehicle for trucks.
class Vehicle {
	private int passengers;
	private int fuelCap;
	private int mpg;
	
	Vehicle(int p,int f,int m) {
		setPassengers(p);
		fuelCap = f;
		mpg = m;
	}
	
	int range() {
		return(mpg * fuelCap);
	}
	
	double fuelNeeded(int miles) {
		return((double)miles / mpg);
	}

	int getPassengers() {
		return passengers;
	}

	void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	int getFuelCap() {
		return fuelCap;
	}

	void setFuelCap(int fuelCap) {
		this.fuelCap = fuelCap;
	}

	int getMpg() {
		return mpg;
	}

	void setMpg(int mpg) {
		this.mpg = mpg;
	}
	
}

class Truck extends Vehicle {
	
	private int cargoCap;
	
	Truck(int p, int f, int m, int c) {
		super(p, f, m);
		setCargo(c);
	}

	public int getCargo() {
		return cargoCap;
	}

	public void setCargo(int cargoCap) {
		this.cargoCap = cargoCap;
	}
	
}

class TruckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck semi = new Truck(2,200,7,44000);
		Truck pickup = new Truck(3,28,15,2000);
		double gallons;
		int dist = 252;
		
		gallons = semi.fuelNeeded(dist);
		
		System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
		System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");
		
		gallons = pickup.fuelNeeded(dist);
		
		System.out.println("Semi can carry " + pickup.getCargo() + " pounds.");
		System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");
	}

}
