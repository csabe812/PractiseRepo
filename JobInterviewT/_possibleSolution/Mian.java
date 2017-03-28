package job.interview;

import static org.junit.Assert.assertNull;

public class Mian {
	public static void main(String[] args) {
		SingleLinkedList l = new SingleLinkedList();
		l.add(new SingleLinkedListNode("mary"));
		l.add(new SingleLinkedListNode("joe"));
		l.add(new SingleLinkedListNode("rebecca"));
		l.add(new SingleLinkedListNode("andrew"));
		
		for(String str : l.values()) {
			System.out.println(str);
		}
		
		l.delete(new SingleLinkedListNode("rebecca"));
		for(String str : l.values()) {
			System.out.println(str);
		}
		
		l.delete(new SingleLinkedListNode("joe"));
		for(String str : l.values()) {
			System.out.println(str);
		}
		l.delete(new SingleLinkedListNode("andrew"));
		for(String str : l.values()) {
			System.out.println(str);
		}
		l.delete(new SingleLinkedListNode("mary"));
		for(String str : l.values()) {
			System.out.println(str);
		}
		System.out.println("====================");
		
		SingleLinkedList ll = new SingleLinkedList();
		ll.add(new NoReferenceLinkedListNode("sanya"));
		ll.add(new NoReferenceLinkedListNode("bela"));
		ll.add(new NoReferenceLinkedListNode("gergely"));
		ll.add(new NoReferenceLinkedListNode("tomi"));
		for(String str : ll.values()) {
			System.out.println(str);
		}
		ll.delete(new NoReferenceLinkedListNode("gergely"));
		for(String str : ll.values()) {
			System.out.println(str);
		}
		ll.delete(new NoReferenceLinkedListNode("bela"));
		for(String str : ll.values()) {
			System.out.println(str);
		}
		ll.delete(new NoReferenceLinkedListNode("tomi"));
		for(String str : ll.values()) {
			System.out.println(str);
		}
		ll.delete(new NoReferenceLinkedListNode("sanya"));
		for(String str : ll.values()) {
			System.out.println(str);
		}
		
		System.out.println("==========DOUBLE=========");
		DoubleLinkedList dl = new DoubleLinkedList();
		dl.add(new DoubleLinkedListNode("sziszi"));
		dl.add(new DoubleLinkedListNode("gabi"));
		dl.add(new DoubleLinkedListNode("nori"));
		dl.add(new DoubleLinkedListNode("baba"));
		
		for(String str : dl.values()) {
			System.out.println(str);
		}
		dl.delete(new DoubleLinkedListNode("gabi"));
		for(String str : dl.values()) {
			System.out.println(str);
		}
		dl.delete(new DoubleLinkedListNode("nori"));
		for(String str : dl.values()) {
			System.out.println(str);
		}
		dl.delete(new DoubleLinkedListNode("baba"));
		for(String str : dl.values()) {
			System.out.println(str);
		}
		dl.delete(new DoubleLinkedListNode("sziszi"));
		for(String str : dl.values()) {
			System.out.println(str);
		}
	}
}
