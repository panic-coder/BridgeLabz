package com.bridgeit.visitor;

public class Fruit implements ItemElement{

	private int pricePerKey;
	private int weight;
	private String name;
	
	public Fruit(int priceKg,int wt,String nm) {
		this.pricePerKey=priceKg;
		this.weight=wt;
		this.name=nm;
	}
	
	public int getPricePerKey() {
		return pricePerKey;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
	
}
