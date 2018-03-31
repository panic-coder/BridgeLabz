package com.bridgeit.programs;

//import com.bridgeit.utility.Utility;

public class LinkedList {
	Node head;

	public void add(int data) {
		Node n = new Node(data);
		n.data = data;
		n.next = null;
		if(head==null)
			head=n;
		else {
			Node t=head;
			while(t.next!=null) {
				t=t.next;
			}
			t.next=n;
		}
	}
	
	public boolean search(int item) {
		int c=0;
		if(head==null)
			return false;
		else {
			Node t=head;
			while(t.next!=null ) {
				if(item==t.data) {
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
	
	public void append(int data) {
		Node n = new Node(data);
		n.data = data;
		n.next = null;
		Node t = head;
		while(t.next!=null) {
			t=t.next;
		}
		t.next=n;
	}

	public void display() {
		Node t=head;
		while(t!=null) {
			System.out.println(t.data);
			t=t.next;
		}
	}
	
	public int index(int item) {
		int c=0,i=0;
		if(head==null) {
			return -1;
		}else {
			Node t = head;
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
		Node t=head;
		while(t.next!=null) 
			t=t.next;
		System.out.println(t.data);
	}
	
	public void pop(int pos) {
		Node t=head;
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
			Node t= head;
			while(t!=null) {
				t=t.next;
				i++;
			}
		}
		return i;
	}
	
	public static void main(String[] args)throws Exception {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
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
		
	}	
		
}

