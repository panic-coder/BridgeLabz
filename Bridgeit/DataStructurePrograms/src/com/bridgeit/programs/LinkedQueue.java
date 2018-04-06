package com.bridgeit.programs;

public class LinkedQueue<T> {
	Node<T> head;
	public void add(T data) {
		Node<T> n = new Node<T>(data);
		if(head==null)
			head=n;
		else {
			Node<T> t=head;
			while(t.next!=null)
				t=t.next;
			t.next=n;
		}
	}
	
	public void display() {
		Node<T> t=head;
		if(!isEmpty()) {
		while(t!=null) {
			if(!(t.data.equals(-1)))
				System.out.println(t.data+" ");
			else
				System.out.print("  ");
			t=t.next;
		}
		System.out.println();
		}
	}
	
	public void display1() {
		T temp=remove();
		Node<T> t=head;
		while(t!=null) {
			Node<T> z=t;
			while(z!=null) {
				System.out.print(z.data+" ");
				z=z.next;
			}
			System.out.println();
			t=t.next;
		}
	}
	
	public T remove() {
		Node<T> t=head;
		if(head!=null)
			head = t.next;
		return t.data;
	}
	
	public boolean isEmpty() {
		if(head==null)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		LinkedQueue<Integer> l = new LinkedQueue<Integer>();
		/*l.add(5);
		l.add(9);
		l.add(10);*/
		l.display();
		System.out.println("==");
		l.remove();
		l.display();
		System.out.println(l.isEmpty());
	}
}
