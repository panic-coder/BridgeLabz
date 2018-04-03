package com.bridgeit.programs;

public class MyQueue<T> {
	T[] q;
	int size;
	int front;
	int rear;
	@SuppressWarnings("unchecked")
	public MyQueue(int size) {
		this.size=size;
		q = (T[]) new Object[size];
		front = -1;
		rear = -1;
	}
	public boolean isEmpty() {
		if(front==-1 && rear==-1)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if(rear==size-1)
			return true;
		else 
			return false;
	}
	public void enqueue(T item) {
		if(isFull()) {
			return;
		}
		else if(isEmpty()) {
			front=rear=0;
		}
		else {
			rear = rear+1;
		}
		q[rear]=item;
	}
	public void dequeue() {
		if(isEmpty())
			return;
		else if(front==rear)
			front = rear=-1;
		else
			front = front+1;
	}
}

