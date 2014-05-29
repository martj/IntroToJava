public class LinearStructure {

	private Node head = new Node();
	private Node tail = new Node();
	private int counter = 0;

	public LinearStructure() {
		this.head = null;
		this.tail = null;
		this.setCounter(0);
	}
	
	
	public int getCounter() {
		return counter;
	}


	public void setCounter(int counter) {
		this.counter = counter;
	}


	/* SUB CLASS NODE	SUB CLASS NODE	SUB CLASS NODE */
	private class Node {
		Object element;
		Object parentPointer;

		// Constructor for node of head type
		public Node(Object element) {
			this.element = element;
			this.parentPointer = null;
			setCounter(getCounter() + 1);
		}


		// Constructor for normal node
		public Node(Object element, int a ) {

		}
	}
}
