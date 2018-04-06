package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Hashing<T> {
	
	int tableSize;
	int size;
	Node<T>[] table;
	
	public Hashing(int tableSize) {
		size = 0;
		table = new Node[tableSize];
		for(int i=0;i<tableSize;i++)
			table[i]=null;
	}
	
	public Integer add(Integer key) {
		int hash =(myhash(key)%tableSize);
		if(table[hash]==null)
			return -1;
		else {
			Node<T> entry = table[hash];
			while(entry!=null && !(entry.key==key))
				entry = entry.next;
			if(entry==null)
				return -1;
			else
				return (Integer) entry.data;
		}
	}
	
	public void insert(Integer key,T data) {
		int hash =(myhash(key)%tableSize);
		if(table[hash]==null) {
			//Node<T> t = new Node<>(key,data);
			table[hash] = new Node(key);
		}
			
		else {
			Node<T> entry = (Node<T>) table[hash];
			while(entry.next!=null && !(entry.key==key))
				entry=entry.next;
			if(entry.key==key)
				entry.data=data;
			else
				entry.next= new Node<T>(key,data);
		}
		size++;
	}
	
	public int myhash(int key) {
		int value=(int) key;
		value = value%tableSize;
		if(value<0)
			value=value+tableSize;
		return value;
	}
	
	public void display() {
		for(int i=0;i<tableSize;i++) {
			System.out.print((i+1)+" :");
			Node<T> entry =  table[i];
			while(entry!=null){
				System.out.print(entry.data+" ");
				entry=entry.next;
			}
		}
			
	}

	public static void main(String[] args) {
		Utility utility = new Utility();
		
		System.out.println("Enter the size of array");
		Integer size = utility.inputInteger();
		Integer[] arr = new Integer[size];
		Hashing h = new Hashing(size);
		String y;
		do {
			System.out.println("Enter a number to be inserted");
			Integer number = utility.inputInteger();
			h.insert(number, size);
			System.out.println("y for entering numbers\nno for exit");
			y = utility.inputString();
		} while (y == "y");
	}
}
