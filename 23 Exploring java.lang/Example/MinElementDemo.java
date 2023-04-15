class MinElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {
				3,1,4,3,6,5
		};
		int intMin = Finder.minElement(intArray);
		System.out.println(intMin);
		
		String[] strArray = {
			"every","good","boy","does","fine"	
		};
		String strMin = Finder.minElement(strArray);
		System.out.println(strMin);
		
		Double[] doubleArray = {
			3.14,2.8,6.023,1.414	
		};
		Double doubleMin = Finder.minElement(doubleArray);
		System.out.println(doubleMin);
		
	}

}
