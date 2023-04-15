// Collection views Versus Arrays Obtained from a collection.
import java.util.*;

class ViewAndArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		String[] array = list.toArray(new String[4]);
		List<String> sublist = list.subList(0,4);
		
		array[1] = "F";
		sublist.set(2,"O");
		System.out.println(list);
	}

}
