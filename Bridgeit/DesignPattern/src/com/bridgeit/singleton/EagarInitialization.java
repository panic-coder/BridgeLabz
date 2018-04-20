package com.bridgeit.singleton;

public class EagarInitialization {
	private static final EagarInitialization instance = new EagarInitialization();
	public EagarInitialization() {
		
	} 
	public static EagarInitialization getInstance() {
		return instance;
	}
	public static void main(String[] args) {
		System.out.println(getInstance().hashCode());
		System.out.println(getInstance().hashCode());
		EagarInitialization instance = new EagarInitialization();
		EagarInitialization instance2 = new EagarInitialization();
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
	}
}
