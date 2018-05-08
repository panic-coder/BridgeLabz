/**
 * Purpose: Stack via Linked list method without using collection library 
 * 
 * @author Kumar Shubham
 *
 * @param <T>
 */

package com.bridgeit.stock;

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
	public String pop(){
		Node<T> t=head;
		String temp =  (String) t.data;
		head = t.next;
		return temp;
	}
	
	public static void main(String[] args) {
		LinkedStack<String> l = new LinkedStack<String>();
		l.add("A");
		l.add("V");
		l.display();
		System.out.println("==");
		l.display();
	}
	
}
