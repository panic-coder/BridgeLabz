/**
 * Purpose: Deque via Linked list method without using collection library 
 * 
 * @author Kumar Shubham
 *
 * @param <T>
 */

package com.bridgeit.programs;

public class MyDeque<T> {
	Node<T> front,rear;
	public MyDeque() {
		front=null;
		rear=null;
	}
	public boolean isEmpty() {
		if(front==null)
			return true;
		else
			return false;
	}
	public int size() {
		Node<T> t=front;
		int i=0;
		while(t!=null) {
			t=t.next;
			i++;
		}
		return i;
	}
	public void addFront(T data) {
		Node<T> n = new Node<T>(data);
		if(front==null) {
			front = n;
			rear = front;
		}else {
			n.next=front;
			front=n;
		}
		
		
	}
	public void addLast(T data) {
		Node<T> n = new Node<T>(data);
		if(rear==null) {
			rear=n;
			front=rear;
		}
		else {
			rear.next=n;
			rear = n;
		}
	}
	public Node<T> removeFront() {
		Node<T> t=front;
		front = front.next;
		return t;
	}
	public Node<T> removeLast() {
		Node<T> t=front;
		Node<T> prev=null;
		while(t.next!=null) {
			prev=t;
			t=t.next;
		}
		//Node<T> temp = t;
		prev.next=null;
		return t;
	}
	public void display() {
		Node<T> t = front;
		while(t!=null) {
			System.out.println(t.data);
			t=t.next;
		}
	}
}
