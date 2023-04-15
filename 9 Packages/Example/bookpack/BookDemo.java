// A short package demonstration.
package bookpack;

class Book {
	private String title;
	private String author;
	private int pubDate;
	
	Book(String t,String a,int d) {
		title = t;
		author = a;
		pubDate = d;
	}
	
	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
	}
	
}

class BookDemo {

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
