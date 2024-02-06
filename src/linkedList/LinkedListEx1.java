package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Logger;

/**
 * Operations performing with linked list Linked list uses doubly linked list
 * internally Linked list can act as a list and queue as it implements both the
 * list and the deque interface
 */
public class LinkedListEx1 {
	private static final Logger log = Logger.getLogger(LinkedListEx1.class.getName());

	public static void main(String args[]) {
		LinkedList<String> al = new LinkedList<String>();
		// Adding elements to linked list
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		LinkedList<String> al2 = new LinkedList<String>();
		al2.add("Sahil");
		al2.add("Saini");
		al2.add("Ajay");
		// Merging two lists
		al.addAll(al2);

		// Removing first element
		al.removeFirst();
		// Removing last element
		al.removeLast();
		al.removeFirstOccurrence("Ajay");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			log.info(itr.next());
		}
		log.info("After reversing");
		// To traverse the list of elements in reverse order
		Iterator<String> it = al.descendingIterator();
		while (it.hasNext()) {
			log.info(it.next());
		}
	}
}
