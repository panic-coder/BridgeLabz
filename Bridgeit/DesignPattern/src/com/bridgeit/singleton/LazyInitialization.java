package com.bridgeit.singleton;

public class LazyInitialization {
	private static LazyInitialization instance;
	private LazyInitialization() {
		
	}
	public static LazyInitialization getInstance() {
		if(instance == null)
			instance = new LazyInitialization();
		return instance;
	}
	public static void main(String[] args) {
		System.out.println(getInstance());
	}
}
