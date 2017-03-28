package job.interview;

public class NoReferenceLinkedList implements List {

	NoReferenceLinkedListNode head;
	NoReferenceLinkedListNode tail;
	int size = 0;
	
	public NoReferenceLinkedList() {
		head = new NoReferenceLinkedListNode();
		tail = new NoReferenceLinkedListNode();
	}
	
	@Override
	public Node find(String element) {
		if(head.value.equals(element)) {
			return head;
		} else {
			NoReferenceLinkedListNode temp = head.next[0];
			while(temp != null) {
				if(temp.value.equals(element)) {
					return temp;
				}
				temp = temp.next[0];
			}
		}
		return null;
	}

	@Override
	public void add(Node element) {
		NoReferenceLinkedListNode addedNode = new NoReferenceLinkedListNode(element.value());
		if(head.value.equals("")) {
			head = addedNode;
			tail = addedNode;
		} else {
			tail.next[0] = addedNode;
			tail = addedNode;
		}
		size++;
	}

	@Override
	public void delete(Node element) {
		if(head.value.equals(element.value())) {
			head = head.next[0];
		} else if(tail.value.equals(element.value())) {
			tail = findBefore(element.value());
		} else {
			NoReferenceLinkedListNode temp = head.next[0];
			while(temp != null) {
				if(temp.value.equals(element.value())) {
					findBefore(element.value()).next[0] = temp.next[0];
					break;
				}
			}
		}
		size--;
	}

	public NoReferenceLinkedListNode findBefore(String v) {
		if(head.value.equals(v)) {
			return new NoReferenceLinkedListNode();
		} else if(head.next[0] != null) {
			if(head.next[0].value.equals(v)) {
				return head;
			}
		} else {
			NoReferenceLinkedListNode temp = head.next[0];
			while(temp.next[0] != null) {
				if(temp.next[0].equals(v)) {
					return temp;
				}
				temp = temp.next[0];
			}
		}
		return null;
	}
	
	@Override
	public String[] values() {
		if(size == 0) {
			return new String[]{};
		}
		
		String str[] = new String[size];
		NoReferenceLinkedListNode temp = head;
		int i = 0;
		while(temp != null) {
			str[i] = temp.value;
			temp = temp.next[0];
			i++;
		}
		
		return str;
	}

}
