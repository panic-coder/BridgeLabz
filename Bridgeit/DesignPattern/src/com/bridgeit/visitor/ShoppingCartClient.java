package com.bridgeit.visitor;

public class ShoppingCartClient {
	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] {
				new Book(20,"1234"),new Book(100,"5678"),new Fruit(5,5,"Apple"),new Fruit(10,5,"Banana")
		};
		int total = calculatePrice(items);
		System.out.println(total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitorImpl visitor = new ShoppingCartVisitorImpl();
			int sum=0;
			for(ItemElement item: items) {
				sum = sum + item.accept(visitor);
			}
		return sum;
	}
}
