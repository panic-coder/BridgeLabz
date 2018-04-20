package com.bridgeit.singleton;

public class StaticBlock {
	private static StaticBlock instance;
	private StaticBlock() {
		
	}
	static {
		try {
			instance = new StaticBlock() ;
		}catch(Exception e) {
			throw new RuntimeException("Exception occured in creating Singleton");
		}
	}
	public static StaticBlock getInstance() {
		return instance;
	}
	public static void main(String[] args) {
		System.out.println(getInstance());
	}
}
