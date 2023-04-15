// In the following generic class, the type argument for T must be either Number,
// or a class derived from Number.
class NumericFns <T extends Number> {
	T num;
	
	NumericFns(T n) {
		num = n;
	}
	
	double reciprocal() {
		return(1 / num.doubleValue());
	}
	
	double fraction() {
		return(num.doubleValue() - num.intValue());
	}
	
	// ..
}

class BoundsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumericFns <Integer> iOb = new NumericFns <Integer> (5);
		
		System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
		System.out.println("Fractional compenent of iOb is " + iOb.fraction());
		
		System.out.println();
		
		NumericFns <Double> dOb = new NumericFns <Double> (5.25);
		
		System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
		System.out.println("Fractional compenent of dOb is " + dOb.fraction());

		// This won't work.
		// NumericFns <String> strOb = new NumericFns <String> ("Error");
		
	}

}
