
class PureQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PureQueue<String> q = new PureQueue<String>();
		System.out.println(q);
		q.enqueue("3");
		q.enqueue("abc");
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
	}

}
