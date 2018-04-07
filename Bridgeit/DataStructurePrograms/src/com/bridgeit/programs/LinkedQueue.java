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
		int p=1;Integer a=10;
		if(!isEmpty()) {
		while(t!=null) {
			
			if(!(t.data.equals(-1))) {
				System.out.print(t.data+" ");
			}
			else
				System.out.print("  ");
			t=t.next;
			if(p%7==0) {
				System.out.println();
			}
			p++;
		}
		System.out.println();
		}
	}
	
	public void display1() {
		//Weekdays w = new Weekdays();
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
