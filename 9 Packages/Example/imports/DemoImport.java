// Demonstrate import.
package imports;

import bookpack3.*;

class DemoImport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books = new Book[5];
		
		books[0] = new Book("The Art of Computer Programming, Vol 3","Knuth",1973);
		books[1] = new Book("Moby Dick","Melville",1851);
		books[2] = new Book("Thirteen at Dinner","Christie",1933);
		books[3] = new Book("Red Storm Rising","Clancy",1986);
		books[4] = new Book("On the Road","Kerouac",1955);
		
		for(int i = 0 ; i < books.length ; i++) {
			books[i].show();
			System.out.println();
		}
	}

}
