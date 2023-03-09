package Linkedlist;

public class CircularLinkedList {
	private Node head;
	private Node tail;
	private int size;
	public CircularLinkedList() {
		this.head=null;
		this.tail=null;
	}
	
	public void insertFirst(int value) {
		Node node=new Node(value);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=head;
		}
		size++;
		
		
	}
	public void delete(int n) {
		Node temp=head;
		if(n==0) {
			head=head.next;
		}
		int i=0;
		while(i<n-1) {
			
			
			i++;
			temp=temp.next;
		}
		temp.next=temp.next.next;
		size--;
		
		
	}
	public void insertLast(int value) {
		Node node=new Node(value);
		if(head==null) {
			head=node;
			tail=node;
			return;
		}
		tail.next=node;
		node.next=head;
		tail=node;
		
		
		
	}
	public void insertAt(int n,int value) {
		if(n==0) {
			insertFirst(value);
		}else if(n==size-1) {
			insertLast(value);
		}else {
			Node temp=head;
			Node node=new Node(value);
			int i=0;
			while(i<n) {
				if(i==n-1) {
					Node t=temp.next;
					temp.next=node;
					node.next=t;
					size++;
					return;
					
				}
				temp=temp.next;
				i++;
			}
		}
	}
	public void display() {
		Node temp=head;
		while(temp.next!=head) {
			System.out.print(temp.value+"->");
			temp=temp.next;
		}
		System.out.println(temp.value);
	}
private class Node{
	private int value;
	private Node next;
	public Node(int value) {
		this.value = value;
	}
	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}
}
	
	}


