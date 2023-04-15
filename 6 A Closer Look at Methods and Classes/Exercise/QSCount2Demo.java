// A simple version of Quick Sort.
class QuickSort {
	public static int count = 0;

	static void qsort(char[] items) {
		qs(items,0,(items.length)-1);
	}

	private static void qs(char[] items,int left,int right) {

		count++;

		int i,j;
		char x,y;

		i = left;
		j = right;
		x = items[left];

		do {
			while((items[i] < x) && (i < right)) {
				i++;
			}
			while((x < items[j]) && (j > left)) {
				j--;
			}

			if(i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}

		} while(i <= j);

		if(left < j) {
			qs(items,left,j);
		}

		if(i < right) {
			qs(items,i,right);
		}
	}
}

class QSCount2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = {'a','b','c','d','e','f','g'};
		char[] b = {'g','f','e','d','c','b','a'};
		char[] c = {'a','c','e','g','i','k','m','o','q','s','u','w','y','b','d','f','h','j','l','n','p','r','t','v','x','z'};
		int i;

		System.out.print("Original array: ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}

		System.out.println();

		QuickSort.qsort(a);

		System.out.print("Sorted array: ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}

		System.out.println("\n\nThe count value is : " + QuickSort.count);
		QuickSort.count = 0;

		System.out.println("\n");

		System.out.print("Original array: ");
		for(i=0;i<b.length;i++) {
			System.out.print(b[i]);
		}

		System.out.println();

		QuickSort.qsort(b);

		System.out.print("Sorted array: ");
		for(i=0;i<b.length;i++) {
			System.out.print(b[i]);
		}

		System.out.println("\n\nThe count value is : " + QuickSort.count);
		QuickSort.count = 0;

		System.out.println("\n");

		System.out.print("Original array: ");
		for(i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}

		System.out.println();

		QuickSort.qsort(c);

		System.out.print("Sorted array: ");
		for(i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}

		System.out.println("\n\nThe count value is : " + QuickSort.count);


	}

}
