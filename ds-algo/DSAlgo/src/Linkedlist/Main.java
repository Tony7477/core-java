package Linkedlist;



public class Main {
public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.insertLast(6);
	ll.insertFirst(1);
	ll.insertFirst(2);
	ll.insertFirst(3);
	ll.insertFirst(4);
	System.out.println(ll.getHead());
	System.out.println(ll.getTail());
	ll.insertLast(5);
	ll.insertAt(1, 9);
	ll.deleteAt(0);
	ll.deleteAt(0);
	ll.insertLast(5);
	ll.deleteAt(4);
	ll.display();
	DoubleLinkedList dll=new DoubleLinkedList();
	dll.insertFirst(2);
	dll.insertFirst(3);
	dll.insertLast(9);
	dll.display();
	CircularLinkedList cll=new CircularLinkedList();
	cll.insertLast(2);
	cll.insertLast(3);
	cll.display();
	
	
	
	
}
	
}
