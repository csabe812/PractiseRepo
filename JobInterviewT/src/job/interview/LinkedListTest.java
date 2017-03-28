package job.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {
		SingleLinkedList sl = new SingleLinkedList();
		assertNull(sl.find("mary"));
		sl.add(new SingleLinkedListNode("mary"));
		assertEquals(new String[]{"mary"}, sl.values());
		assertNull(sl.find("joe"));
		sl.add(new SingleLinkedListNode("joe"));
		assertEquals(new String[]{"mary", "joe"}, sl.values());
		sl.add(new SingleLinkedListNode("rebecca"));
		assertEquals(new String[]{"mary", "joe", "rebecca"}, sl.values());
		sl.add(new SingleLinkedListNode("andrew"));
		assertEquals(new String[]{"mary", "joe", "rebecca", "andrew"}, sl.values());
		
		DoubleLinkedList dl = new DoubleLinkedList();
		assertNull(dl.find("mary"));
		dl.add(new SingleLinkedListNode("mary"));
		assertEquals(new String[]{"mary"}, dl.values());
		assertNull(dl.find("joe"));
		dl.add(new SingleLinkedListNode("joe"));
		assertEquals(new String[]{"mary", "joe"}, dl.values());
		dl.add(new SingleLinkedListNode("rebecca"));
		assertEquals(new String[]{"mary", "joe", "rebecca"}, dl.values());
		dl.add(new SingleLinkedListNode("andrew"));
		assertEquals(new String[]{"mary", "joe", "rebecca", "andrew"}, dl.values());
		
		NoReferenceLinkedList nl = new NoReferenceLinkedList();
		assertNull(nl.find("mary"));
		nl.add(new SingleLinkedListNode("mary"));
		assertEquals(new String[]{"mary"}, nl.values());
		assertNull(nl.find("joe"));
		nl.add(new SingleLinkedListNode("joe"));
		assertEquals(new String[]{"mary", "joe"}, nl.values());
		nl.add(new SingleLinkedListNode("rebecca"));
		assertEquals(new String[]{"mary", "joe", "rebecca"}, nl.values());
		nl.add(new SingleLinkedListNode("andrew"));
		assertEquals(new String[]{"mary", "joe", "rebecca", "andrew"}, nl.values());
		
		System.out.println("Done");
	}
}
