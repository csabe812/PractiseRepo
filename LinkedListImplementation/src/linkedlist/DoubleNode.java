package linkedlist;

public class DoubleNode {

	int data;
	DoubleNode next;
	DoubleNode prev;

	DoubleNode(int d) {
		data = d;
	}
	
	@Override
	public String toString() {
		return "" + data;
	}
}
