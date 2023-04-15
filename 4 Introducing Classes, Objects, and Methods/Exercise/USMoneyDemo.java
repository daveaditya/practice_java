/*
 * Create a USMoney class with two integer instance variables dollars and cents. Add a
 * constructor with two parameters for initializing a USMoney object. The constructor 
 * should check that the cents value is between 0 and 99 and, if not, transfer some of
 * the cents to the dollars variable to make it between 0 and 99. Add a plus method
 * to the class that takes a USMoney object as its parameter. It creates and returns a
 * new USMoney object representing the sum of the object whose plus() method is being
 * invoked and the parameter. It does not modify the values of the two existing objects.
 * It should also ensure that the value of the cents instance variable of the new
 * object is between 0 and 99. For example, if x is a USMoney object with 5 dollars
 * and 80 cents, and if y is a USMoney object with 1 dollar and 90 cents, then x.plus(y)
 * will return a new USMoney object with 7 dollars and 7- cents. Also, create
 * a USMoneyDemo class that tests the USMoney class.
 */
class USMoney {
	byte cents;
	int dollar;
	
	USMoney() {
		cents = 0;
		dollar = 0;
	}
	
	USMoney(byte cents, int dollar) {
		this.cents = cents;
		this.dollar = dollar;
		if(cents > 99) {
			adjustCent();
		}
	}
	
	USMoney plus(USMoney x) {
		USMoney obj = new USMoney();
		obj.setCents((byte) (this.getCents() + x.getCents()));
		obj.setDollar((this.getDollar() + x.getDollar()));
		if(obj.getCents() > 99) {
			obj.adjustCent();
		}
		return obj;
	}
	
	void adjustCent() {
		setDollar(getDollar() + (cents/100));
		setCents((byte) (cents % 99));
	}
	
	byte getCents() {
		return cents;
	}
	
	int getDollar() {
		return dollar;
	}
	
	void setCents(byte cents) {
		this.cents = cents;
	}
	
	void setDollar(int dollar) {
		this.dollar = dollar;
	}
}

class USMoneyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USMoney obj1 = new USMoney((byte) 100,5);
		USMoney obj2 = new USMoney((byte) 50,7);
		
		System.out.println("First : Dollar = " + obj1.getDollar() + " and Cents = " + obj1.getCents());
		System.out.println("Second : Dollar = " + obj2.getDollar() + " and Cents = " + obj2.getCents());
		
		USMoney ans = obj1.plus(obj2);
		System.out.println("\nAnswer : Dollar = " + ans.getDollar() + " and Cents = " + ans.getCents());
	}

}
