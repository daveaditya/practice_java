// Use a wildcard.
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
	
	boolean absEqual(NumericFns <?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) {
			return(true);
		}
		return(false);
	}
	
	// ..
}

class WildcardsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumericFns <Integer> iOb = new NumericFns <Integer> (6);
		NumericFns <Double> dOb = new NumericFns <Double> (-6.0);
		NumericFns <Long> lOb = new NumericFns <Long> (5L);
		
		System.out.println("Testing iOb and dOb.");
		if(iOb.absEqual(dOb)) {
			System.out.println("Absolute values are equal.");
		}
		else {
			System.out.println("Absolute values differ.");
		}
		
		System.out.println();
		
		System.out.println("Testing iOb and lOb.");
		if(iOb.absEqual(lOb))  {
			System.out.println("Absolute values are equal.");
		}
		else {
			System.out.println("Absolute values differ.");
		}
		
	}

}
