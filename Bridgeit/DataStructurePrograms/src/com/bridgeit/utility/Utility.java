package com.bridgeit.utility;

import java.util.*;

import com.bridgeit.programs.Node;

public class Utility {
	Scanner scanner;
	Random random;
	public Utility() {
		scanner = new Scanner(System.in);
		random = new Random();

	}

	// RANDOM Numbers
	public int inputRandom(int bound) {
		try {
			return random.nextInt(bound);
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	public int inputRandom() {
		try {
			return random.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// INPUT STRING
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT STRING_LINE
	public String inputStringLine() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT Integer
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// INPUT Double
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// INPUT Boolean
	public boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	/*Node head;
	
	public void add(String st1) {
		Node n = new Node(st1);
		n.setNext(head);
		head = n;
	}
	public void printList() {
		Node t = head;
		while(t!=null) {
			System.out.println(t.s);
			t=t.getNext();
		}
	}
	
	public void remove(String item) {
		Node t=head,previous = null;
		while(t!=null && t.s!=item) {
			previous = t;
			t=t.next;
		}
		//Node pre = previous.getNext();
		previous.next=t.next;
	}*/
	
	//INPUT text
	/*public String inputText(File file) {
		try {
			return bufferedReader.readLine();
		}catch(Exception e) {
			System.out.println(e);
		}
		return "";
	}*/
}
