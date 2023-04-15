// Demonstrate both Iterator and ListIterator.
import java.util.*;

class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Alpha");
		al.add("Beta");
		al.add("Gamma");
		al.add("Delta");
		al.add("Epsilon");
		al.add("Zeta");
		al.add("Eta");
		
		System.out.print("Origina contents: ");
		Iterator <String> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		itr = al.iterator();
		while(itr.hasNext()) {
			if(itr.hasNext()) {
				if(itr.next().equals("Gamma")) {
					itr.remove();
				}
			}
		}
		
		System.out.print("Contents after deletion: ");
		itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		ListIterator <String> litr  = al.listIterator();
		while(litr.hasNext()) {
			if(litr.next().equals("Beta")) {
				litr.add("Gamma");
			}
		}
		
		System.out.print("Contents after addition: ");
		litr = al.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next() + " ");
		}
		System.out.println();
		
		String str;
		litr = al.listIterator();
		while(litr.hasNext()) {
			str = litr.next();
			
			if(str.equals("Eta")) {
				litr.set("Omega");
			}
			else if(str.equals("Zeta")) {
				litr.set("Psi");
			}
			else if(str.equals("Epsilon")) {
				litr.set("Chi");
			}
			else if(str.equals("Delta")) {
				litr.set("...");
			}
		}
		
		System.out.print("Contents after changes: ");
		litr = al.listIterator();
		
		while(litr.hasNext()) {
			System.out.print(litr.next() + " ");
		}
		System.out.println();
		
		System.out.print("Modified list backwards: ");
		while(litr.hasPrevious()) {
			System.out.print(litr.previous() + " ");
		}
		System.out.println();
		
	}

}
