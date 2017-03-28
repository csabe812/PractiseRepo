package job.interview;

public class SingleLinkedList implements List {

	SingleLinkedListNode head;
	SingleLinkedListNode tail;
	int size = 0;
	
	public SingleLinkedList() {
		head = new SingleLinkedListNode();
		tail = new SingleLinkedListNode();
	}
	
	@Override
	public Node find(String element) {
		if(head.value.equals(element)) {
			return head;
		}
		SingleLinkedListNode temp = head.next;
		while(temp != null) {
			if(temp.value.equals(element)) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	@Override
	public void add(Node element) {
		SingleLinkedListNode addedNode = new SingleLinkedListNode(element.value());
		if(head.value.equals("")) {
			head = addedNode;
			tail = addedNode;
		} else {
			tail.next = addedNode;
			tail = addedNode;
		}
		size++;
	}

	@Override
	public void delete(Node element) {
		if(size == 1 && head.value.equals(element.value())) {
			head = new SingleLinkedListNode();
		} else if(head.value.equals(element.value())) {
			head = head.next;
		} else if(tail.value.equals(element.value())) {
			tail = findBeforeDeletedElement(element.value());
			tail.next = null;
		} else {
			findBeforeDeletedElement(element.value()).next = findBeforeDeletedElement(element.value()).next.next;
		}
		size--;
	}

	public SingleLinkedListNode findBeforeDeletedElement(String str) {
		if(head.value.equals(str)) {
			return new SingleLinkedListNode();
		} else if(head.next.value.equals(str)) {
			return head;
		} else {
			SingleLinkedListNode temp = head.next;
			while(temp.next != null) {
				if(temp.next.value.equals(str)) {
					return temp;
				}
				temp = temp.next;
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
		SingleLinkedListNode temp = head;
		int i = 0;
		while(temp != null) {
			str[i] = temp.value;
			temp = temp.next;
			i++;
		}
		
		return str;
	}

}
