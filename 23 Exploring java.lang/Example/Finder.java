class Finder {

	public static <T extends Comparable<T>> T minElement(T[] data) {
		T currMin = data[0];
		for(T x : data) {
			if(x.compareTo(currMin) < 0) {
				currMin = x;
			}
		}
		return(currMin);
	}
}
