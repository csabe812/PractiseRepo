package linkedlist;

import org.junit.Test;

public class TestDoubleLinkedList {

	@Test
	public void test() {
		MyDoubleLinkedList dl = new MyDoubleLinkedList();
		
		dl.add(10);
		dl.add(2);
		dl.add(33);
		dl.add(44);
		
		System.out.println(dl.find(20));
		System.out.println(dl.find(2));
		System.out.println(dl.find(44));
		System.out.println(dl.find(3));
		
		System.out.println("===");
		
		dl.delete(2);
		dl.add(333);;
		dl.add(201);
		dl.delete(2);
		dl.delete(201);
		
		System.out.println("===");
		
		dl.traverse();
		
		System.out.println("Done");
	}
	
}
