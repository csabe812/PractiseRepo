package linkedlist;

public class MyLinkedList {

	Node head;
	Node tail;
	int size = 0;
	// Add - Delete - Find

	public void add(int data) {
		// Case1: no element
		// Case2: add element to an existing linked list

		Node addedNode = new Node(data);

		if (head == null) {
			head = addedNode;
			tail = addedNode;
		} else {
			tail.next = addedNode;
			tail = addedNode;
		}

		size++;
	}

	public void delete(int data) {
		// Case1: delete head -> no before Node
		// Case2: delete tail -> simple
		// Case2: delete in the middle -> beforeNode.next == deleteNode.next

		if(head.data == data) {
			head = head.next;
			size--;
		}
		
		if (find(data) == null || size == 0)
			return;

		if (tail.data == data) {
			tail = findBeforeDelete(data);
			tail.next = null;
			size--;
		} else {
			Node beforeNode = findBeforeDelete(data);
			beforeNode.next = beforeNode.next.next;
			size--;
		}

	}

	public Node find(int data) {
		if (head.data == data) {
			return head;
		}

		Node findNode = head.next;
		while (findNode != null) {
			if (findNode.data == data) {
				return findNode;
			}
			findNode = findNode.next;
		}

		return null;
	}

	public Node findBeforeDelete(int data) {
		if (head.data == data) {
			return new Node();
		}

		Node findBefore = head;
		while (findBefore.next != null) {
			if (findBefore.next.data == data) {
				return findBefore;
			}
			findBefore = findBefore.next;
		}

		return null;
	}

	public void traverse() {
		System.out.println("Size of the list: " + size);
		Node printNode = head;
		while (printNode != null) {
			System.out.println(printNode.toString());
			printNode = printNode.next;
		}
	}

}
