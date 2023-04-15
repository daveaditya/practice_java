// Demonstrate this keyword.
class Power {
	double b;
	int e;
	double val;
	
	Power(double base,int exp) {
		this.b=base;
		this.e=exp;
		
		this.val=1;
		if(exp==0) {
			return;
		}
		
		for(;exp>0;exp--) {
			this.val=this.val*base;
		}
	}
	
	double getPwr() {
		return(this.val);
	}
}

class DemoPower {

	public static void main(String[] args) {
		Power x=new Power(4.0,2);
		Power y=new Power(2.5,1);
		Power z=new Power(5.7,0);
		
		System.out.println(x.b + " raised to the " + x.e + " power is " + x.getPwr());
		System.out.println(y.b + " raised to the " + y.e + " power is " + y.getPwr());
		System.out.println(z.b + " raised to the " + z.e + " power is " + z.getPwr());

	}

}
