package linkedlist;

public class MyDoubleLinkedList {

	DoubleNode head;
	DoubleNode tail;
	int size = 0;
	
	public void add(int d) {
		//No element
		//Add to a list
		DoubleNode addedNode = new DoubleNode(d);
		
		if(head == null) {
			head = tail = addedNode;
		} else {
			addedNode.prev = tail;
			tail.next = addedNode;
			tail = addedNode;
		}
	}
	
	public void delete(int d) {
		//Delete node from head
		//Delete node from tail
		//Delete node from the middle
		
		if(d == head.data) {
			head.next.prev = null;
			head = head.next;
		} else if(d == tail.data) {
			tail.prev.next = null;
			tail = tail.prev;
		} else {
			DoubleNode deleteNode = head.next;
			while(deleteNode != null) {
				if(deleteNode.data == d) {
					deleteNode.prev.next = deleteNode.next;
					deleteNode.next.prev = deleteNode.prev;
					break;
				}
				deleteNode = deleteNode.next;
			}
		}
	}
	
	public DoubleNode find(int d) {
		if(head.data == d) {
			return head;
		} else {
			DoubleNode findNode = head.next;
			while(findNode != null) {
				if(findNode.data == d) {
					return findNode;
				}
				findNode = findNode.next;
			}
		}
		return null;
	}

	
	public void traverse() {
		DoubleNode dn = head;
		while(dn != null) {
			System.out.println(dn);
			dn = dn.next;
		}
	}
}
