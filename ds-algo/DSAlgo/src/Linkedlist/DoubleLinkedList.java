package Linkedlist;

public class DoubleLinkedList {
	
	Node head;
	Node tail;
	int size=0;
    
	public void insertFirst(int value) {
		Node node =new Node(value);
		if(head==null) {
			tail=node;
		}
		
		
		node.next=head;
		if(head!=null) {
			head.prev=node;
		}
		node.prev=null;
		head=node;
		
	}
	public DoubleLinkedList() {
		
		
		this.size =0;
	}
	public void insertLast(int value) {
		Node node =new Node(value);
	tail.next=node;
	node.next=null;
		node.prev=tail;
		tail=node;
		size++;
	}
	public void delete(int val) {
		Node node =head;
		if(head.value==val) {
			tail.next=head.next;
			head=head.next;
			return;
			
		}
		while(node.next.value!=val) {
			node=node.next;
		}
		node.next=node.next.next;
		
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+"->");
			temp=temp.next;
			
		}
		System.out.println("END");
	}
private class Node{
	private int value;
	private Node next;
	private Node prev;
	public Node(int value) {
		
		this.value = value;
		
	}
	
	
}
}
