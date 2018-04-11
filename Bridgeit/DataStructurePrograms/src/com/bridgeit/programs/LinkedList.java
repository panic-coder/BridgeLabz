/**
 *Purpose: Linked List without using collection librabry 
 * 
 * @author Kumar Shubham
 *
 * @param <T>
 */

package com.bridgeit.programs;

import java.io.*;

//import com.bridgeit.utility.Utility;

public class LinkedList<T> {
	Node<T> head;

	public void add(T fileInt) {
		Node<T> n = new Node<T>(fileInt);
		
		if(head==null) {
			head=n;
		}
		else {
			Node<T> t=head;
			while(t.next!=null) {
				t=t.next;
			}
			t.next=n;
		}	
	}
	
	public void hashAdd(T number) {
		Node<T> n = new Node<T>(number);
		Object pos;
		position(number);
	}
	
	private void position(T number) {
		// TODO Auto-generated method stub
		
	}

	public boolean search(T item) {
		int c=0;
		if(head==null) {
			return false;
		}
		else {
			Node<T> t=head;
			while(t.next!=null ) {
				if(item.equals(t.data)) {
					c++;
					break;
				}
				t=t.next;
			}
		}
		if(c>0)
			return true;
		else
			return false;
	}
	
	public void append(T data) {
		Node<T> n = new Node<T>(data);
		n.data = data;
		n.next = null;
		Node<T> t = head;
		while(t.next!=null) {
			t=t.next;
		}
		t.next=n;
	}

	public void display() {
		Node<T> t=head;
		while(t!=null) {
			System.out.println(t.data);
			t=t.next;
		}
		
	}
	
	public void write() throws Exception {
		Node<T> t = head;
		try {
		PrintStream o = new PrintStream(new File("A.txt"));
		System.setOut(o);
		while(t!=null) {
			System.out.println(t.data);
			t=t.next;
		}
		}catch(Exception e) {
			System.out.println("File not found");
		}
	}
	
	public int index(T item) {
		int c=0,i=0;
		if(head==null) {
			return -1;
		}else {
			Node<T> t = head;
			while(t!=null) {
				i++;
				if(item==t.data) {
					c++;
					break;
				}
				t=t.next;
			}
		}
		if(c>0)
			return i;
		else
			return -1;
			
	}
	
	public void pop() {
		Node<T> t=head;
		while(t.next!=null) 
			t=t.next;
		System.out.println(t.data);
	}
	
	public void pop(int pos) {
		Node<T> t=head;
		int i=1;
		while(t!=null && i<pos ) {
			t=t.next;
			i++;
		}
		System.out.println(t.data);
	}
	
	public boolean isEmpty() {
		if(head==null)
			return true ;
		else
			return false;
	}
	
	public int size() {
		int i=0;
		if(head==null)
			return 0;
		else {
			Node<T> t= head;
			while(t!=null) {
				t=t.next;
				i++;
			}
		}
		return i;
	}
	
	public void remove(T item) {
		Node<T> temp = head,prev=null;
		if(temp.data.equals(item)) {
			head = temp.next;
			return;
		}
		while(temp!=null && !temp.data.equals(item)) {
			prev = temp;
			temp = temp.next;
		}
		if(temp==null)
			return;
		prev.next=temp.next;
	}
	
	public void insert(int index, T data) {
		Node<T> n = new Node<T>(data);
		n.data=data;
		n.next=null;
		if(index ==0) {
			addFirst(data);
		}
		else {
			Node<T> temp = head;
			for(int i=0;i<index-1;i++) {
				temp=temp.next;
			}
			n.next = temp.next;
			temp.next=n;
		}
	}
	
	public void addFirst(T data) {
		Node<T> n = new Node<T>(data);
		Node<T> temp = head;
		n.next=temp;
		head=n;
		
	}
	
	public void sort(T i) {
		Node<T> t,a,prev,pos;
		pos = new Node<T>(i);
		pos.next=head;
		head = pos;
		while(pos.next!=null) {
			t=pos.next;
			prev=pos;
			a=t.next;
			while(a!=null) {
				if(((String) a.data).compareTo((String) t.data)>0) {
					Node<T> temp = a.next;
					a.next = prev.next;
					prev.next = t.next;
					t.next = temp;
					prev=a;
					a=temp;
				}
				else {
					a=a.next;
					t=t.next;
					prev=prev.next;
				}
			}
			pos=pos.next;
			head=head.next;
		}
		}	
	
	
	
	public static void main(String[] args)throws Exception {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(3);
		list.display();
		System.out.println("=====");
		System.out.println("pop method prints");
		list.pop();
		System.out.println("=====");
		System.out.println("pop at a position");
		list.pop(3);
		System.out.println("=====");
		System.out.println("isEmpty");
		System.out.println(list.isEmpty());
		System.out.println("=====");
		System.out.println("Append");
		list.append(6);
		list.pop();
		System.out.println("=====");
		System.out.println("Size of List");
		System.out.println(list.size());
		System.out.println("=====");
		System.out.println("Search of element");
		System.out.println(list.search(10));
		System.out.println("=====");
		int index = list.index(6);
		if(index==-1)
			System.out.println("Not present");
		else
			System.out.println("Present at index "+index);
		System.out.println("=====");
		System.out.println("Remove");
		list.remove(1);
		list.display();
		System.out.println("=====");
		System.out.println("Insert");
		list.insert(4, 10);
		//list.sort(0);
		list.display();
	}	
		
}

