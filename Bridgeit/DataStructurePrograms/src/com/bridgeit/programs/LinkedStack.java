package com.bridgeit.programs;

public class LinkedStack<T> {
	Node<T> head;
	
	public void add(T data) {
		Node<T> n = new Node<T>(data);
		if(head==null)
			head=n;
		else {
			n.next=head;
			head=n;
		}
	}
	
	public void display() {
		Node<T> t=head;
		while(t!=null) {
			System.out.println(t.data);
			t=t.next;
		}
	}
	
	public void remove() {
		Node<T> t=head;
		head = t.next;
	}
	
	
	public static void main(String[] args) {
		LinkedStack<Integer> l = new LinkedStack<Integer>();
		l.add(2);
		l.add(10);
		l.add(5);
		l.display();
		//l.remove();
		System.out.println("==");
		l.display();
	}
	
}
