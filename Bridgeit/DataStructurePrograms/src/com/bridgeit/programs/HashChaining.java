package com.bridgeit.programs;

import java.io.File;
import java.io.PrintStream;

public class HashChaining {
	public Node[] table;
	public int size;
	Node head;
	
	public HashChaining(int tableSize){
		table = new Node[tableSize];
		size=0;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void insert(int val) {
		size++;
		int pos=myhash(val);
		//System.out.println(pos);
		Node n = new Node(val);
		if(table[pos]==null)
			table[pos]=n;
		else {
			n.next=table[pos];
			table[pos]=n;
		}
	}

	public int myhash(int value) {
		int hashVal=value;
		hashVal = hashVal % table.length;
		//System.out.println(hashVal);
		return hashVal;
	}
	
	public void display() {
		for(int i=0;i<table.length;i++) {
			System.out.print(i+" : ");
			Node t = table[i];
			while(t!=null) {
				System.out.print(t.data+" ");
				t=t.next;
			}
			System.out.println();
		}
	}
	
	public void write() throws Exception {
		try {
		PrintStream o = new PrintStream(new File("Hashing.txt"));
		System.setOut(o);
		for(int i=0;i<table.length;i++) {
			System.out.print(i+" : ");
			Node t =table[i];
		while(t!=null) {
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.println();
		}
		}catch(Exception e) {
			System.out.println("Oops!, Something went wrong");
		}
	}
	
	public void search(int value) {
		int pos = myhash(value);
		Integer data = value;
		int c=0;
		Node t = table[pos];
		while(t!=null) {
			if(t.data.equals(data)) {
				c++;
				break;
			}

			t=t.next;
		}
		if(c>0)
			System.out.println("File found at table position "+pos);
		else
			System.out.println("File not found");
	}
	
}
