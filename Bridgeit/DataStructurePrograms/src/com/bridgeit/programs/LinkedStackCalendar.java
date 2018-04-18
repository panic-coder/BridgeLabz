/**
 * Stack for storing calendar and displaying the calendar 
 * 
 * @author Kumar Shubham
 * @since  18-04-2018
 * @param <T>
 */

package com.bridgeit.programs;

public class LinkedStackCalendar<T> {
	Node<T> head;
	
	public void add(Integer temp) {
		Node<T> n = new Node(temp);
		if(head==null)
			head=n;
		else {
			n.next=head;
			head=n;
		}
	}
	public void display() {
		Node<T> t=head;
		int i=1;
		while(t!=null) {
			Integer value = (Integer) t.data;
			if(!value.equals(-1)) {
				if(value<10)
					System.out.print(t.data+"  ");
				else
					System.out.print(t.data+" ");
			if(i%7==0)
				System.out.println();
			}
			else {
				System.out.print("   ");
			}
			t=t.next;
			i++;
			
		}
	}
	public void remove() {
		Node<T> t=head;
		head = t.next;
	}
}
