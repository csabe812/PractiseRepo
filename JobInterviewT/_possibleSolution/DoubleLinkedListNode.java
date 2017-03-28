package job.interview;

public class DoubleLinkedListNode implements Node {

	String value;
	DoubleLinkedListNode next;
	DoubleLinkedListNode prev;
	
	public DoubleLinkedListNode() {
		value = "";
		next = null;
		prev = null;
	}

	public DoubleLinkedListNode(String str) {
		value = str;
		next = null;
		prev = null;
	}
	
	@Override
	public String value() {
		return value;
	}

}
