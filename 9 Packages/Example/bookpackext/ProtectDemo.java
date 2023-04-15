package bookpackext;

class ExtBook extends bookpack3.Book {
	private String condition;
	
	public ExtBook(String t,String a,int d,String c) {
		super(t,a,d);
		condition = c;
	}
	
	public void show() {
		super.show();
		System.out.print("Condition is : " + condition);
		System.out.println();
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public String getTitle() {
		return(title);
	}
	
	public void setTitle(String t) {
		title = t;
	}
	
	public String getAuthor() {
		return(author);
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	
	public int getPubDate() {
		return(pubDate);
	}
	
	public void setPubDate(int d) {
		pubDate = d;
	}
	
}

class ProtectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtBook[] books = new ExtBook[5];
		
		books[0] = new ExtBook("The Art of Computer Programming","Knuth",1973,"well used");
		books[1] = new ExtBook("Moby Dick","Melville",1851,"like new");
		books[2] = new ExtBook("Thirteen at Dinner","Christie",1933,"fair");
		books[3] = new ExtBook("Red Storm rising","Clancy",1986,"good");
		books[4] = new ExtBook("On the Road","Kerouac",1955,"fair");
		
		for(int i=0;i< books.length;i++) {
			books[i].show();
			System.out.println();
		}
		
		System.out.println("Condition of Moby Dick is ");
		for(int i=0;i< books.length;i++) {
			if(books[i].getTitle()=="Moby Dick") {
				System.out.println(books[i].getCondition());
			}
		}
		
		// books[0].title = "test title"; // Error-not accessible.
	}

}
