package linkedList;
import java.util.*;
/**
 * Operations performing with linked list
 * linked list uses doubly linked list internally
 * linked list can act as a list and queue as it implements both the list
 * and the deque interface
 */
public class LinkedListEx1 {
public static void main(String args[]) {
	LinkedList<String> al = new LinkedList<String>();
	//adding elements to linked list
	al.add("Ravi");
	al.add("vijay");
	al.add("Ravi");
	al.add("Ajay");
	LinkedList<String> al2= new LinkedList<String>();
	al2.add("sahil");
	al2.add("saini");
	al2.add("Ajay");
	//merging two list
	al.addAll(al2);
	
	//removing first element
	al.removeFirst();
	//removing last element
	al.removeLast();
	al.removeFirstOccurrence("Ajay");
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("after reversing");
	// to traverse the list of elements in reverse order
	Iterator<String> it = al.descendingIterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
}
}
