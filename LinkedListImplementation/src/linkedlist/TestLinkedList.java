package linkedlist;

import org.junit.Test;

public class TestLinkedList {
	
	@Test
	public void testMethod() {
		
		MyLinkedList list = new MyLinkedList();
		list.add(10);
		list.add(20);
		list.add(15);
		list.add(3);
	
		System.out.println("========");
		
		list.delete(10);
		list.delete(15);
	
		list.add(110);
		list.add(22);
		list.delete(110);
		list.add(40);
		list.add(88);
		list.delete(3);
		
		list.traverse();
		
		System.out.println("Done");
		
		

	}
	
}
