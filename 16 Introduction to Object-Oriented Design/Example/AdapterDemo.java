class Printer {
	void printRect(RectI r) {
		System.out.println(r.getWidth() + " , " + r.getHeight());
	}
}

interface RectI {
	int getWidth();
	int getHeight();
}

class SimpleRect implements RectI {
	int width,height;
	
	public SimpleRect(int w,int h) {
		width = w;
		height = h;
	}
	
	public int getWidth() {
		return(width);
	}
	
	public int getHeight() {
		return(height);
	}
	
}

class NonConformRect {
	int top, left, bottom, right;
	
	NonConformRect(int a,int b,int c,int d) {
		top = a;
		left = b;
		bottom = c;
		right = d;
	}
	
	public int getTop() {
		return(top);
	}
	
	public int getLeft() {
		return(left);
	}
	
	public int getBottom() {
		return(bottom);
	}
	
	public int getRight() {
		return(right);
	}
}

class RectAdapter implements RectI {
	NonConformRect ncRect;
	
	public RectAdapter(NonConformRect r) {
		ncRect = r;
	}
	
	public int getWidth() {
		return(ncRect.getRight() - ncRect.getLeft());
	}
	
	public int getHeight() {
		return(ncRect.getBottom() - ncRect.getTop());
	}
}

class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer prntr = new Printer();
		prntr.printRect(new SimpleRect(3, 4));
		prntr.printRect(new RectAdapter(new NonConformRect(1, 2, 3, 4)));
	}

}
