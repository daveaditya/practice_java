// A short package demonstration.
package bookpack2;

public class Book {
	private String title;
	private String author;
	private int pubDate;
	
	public Book(String t,String a,int d) {
		title = t;
		author = a;
		pubDate = d;
	}
	
	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
	}
	
}
