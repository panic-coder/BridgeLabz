/**
 *Purpose: Queue via Linked list method without using collection library 
 * 
 * @author Kumar Shubham
 *
 * @param <T>
 */

package com.bridgeit.programs;

public class LinkedQueue<T>{
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
		String[] cards = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		String[] names = {"Clubs","Diamonds","Hearts","Spades"};
		int j = 0;
		if(!isEmpty())
		while(t!=null) {
			j++;
			Integer data = (Integer) t.data;
			//System.out.print(t.data+" ");
			if(data>=0 && data<=12)
				System.out.print(names[0]+"["+cards[data%13]+"]\t");
			else if(data>=13 && data<=25)
				System.out.print(names[1]+"["+cards[data%13]+"]\t");
			else if(data>=26 && data<=38)
				System.out.print(names[2]+"["+cards[data%13]+"]\t");
			else if(data>=39 && data<=51)
				System.out.print(names[3]+"["+cards[data%13]+"]\t");
		
			t=t.next;
			if(j%9==0)
				System.out.println("\n");
			
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
		l.display();
		System.out.println("==");
		l.remove();
		l.display();
		System.out.println(l.isEmpty());
	}
}
