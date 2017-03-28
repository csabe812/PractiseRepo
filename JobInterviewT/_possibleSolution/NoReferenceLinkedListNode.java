package job.interview;

public class NoReferenceLinkedListNode implements Node {

	String value;
	NoReferenceLinkedListNode[] next;
	
	NoReferenceLinkedListNode() {
		value = "";
		next = new NoReferenceLinkedListNode[1];
	}
	
	NoReferenceLinkedListNode(String str) {
		value = str;
		next = new NoReferenceLinkedListNode[1];
	}
	
	@Override
	public String value() {
		return value;
	}

}
