package job.interview;

public class DoubleLinkedList implements List {

	DoubleLinkedListNode head;
	DoubleLinkedListNode tail;
	int size = 0;

	public DoubleLinkedList() {
		head = new DoubleLinkedListNode();
		tail = new DoubleLinkedListNode();
	}

	@Override
	public Node find(String element) {
		if (head.value.equals(element)) {
			return head;
		} else {
			DoubleLinkedListNode temp = head.next;
			while (temp != null) {
				if (temp.equals(element)) {
					return temp;
				}
				temp = temp.next;
			}
		}
		return null;
	}

	@Override
	public void add(Node element) {
		DoubleLinkedListNode temp = new DoubleLinkedListNode(element.value());
		if (head.value.equals("")) {
			head = temp;
			tail = temp;
		} else {
			temp.prev = tail;
			tail.next = temp;
			tail = temp;
		}
		size++;
	}

	// 13
	// 13->14
	// 13->14->15
	// 13->15->12->1

	@Override
	public void delete(Node element) {
		if (size == 0)
			return;
		if (size == 1 && head.value.equals(element.value())) {
			head = null;
			tail = null;
		} else if (head.value.equals(element.value())) {
			head = head.next;
			head.prev = null;
		} else if (tail.value.equals(element.value())) {
			tail = tail.prev;
			tail.next = null;
		} else {
			DoubleLinkedListNode temp = head.next;
			while (temp != null) {
				if (temp.value.equals(element.value())) {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
					break;
				}
				temp = temp.next;
			}
		}
		size--;
	}

	@Override
	public String[] values() {
		if (size == 0) {
			return new String[] {};
		}

		String str[] = new String[size];
		DoubleLinkedListNode temp = head;
		int i = 0;
		while (temp != null) {
			str[i] = temp.value;
			temp = temp.next;
			i++;
		}

		return str;
	}

}
