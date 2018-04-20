package com.bridgeit.singleton;

public class BillPugh {
	private BillPugh() {
		
	}
	private static class BillPughHelper{
		private static final BillPugh INSTANCE = new BillPugh();
	}
	public static BillPugh getInstance() {
		return BillPughHelper.INSTANCE;
	}
	public static void main(String[] args) {
		System.out.println(getInstance());
	}
}
