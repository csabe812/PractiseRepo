package job.interview;

public class SingleLinkedListNode implements Node {

	String value;
	SingleLinkedListNode next;
	
	public SingleLinkedListNode() {
		value = "";
		next = null;
	}
	
	public SingleLinkedListNode(String value) {
		this.value = value;
		this.next = null;
	}
	
	@Override
	public String value() {
		return value;
	}

}
