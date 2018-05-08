/**
 * Purpose: Creating nodes in Linked List 
 * 
 * @author Kumar Shubham
 *
 * @param <T>
 */

package com.bridgeit.stock;

public class Node<T> {
	public Node<T> next;
	public T data;
	public Node(T data) {
		this.data=data;
	}
}



