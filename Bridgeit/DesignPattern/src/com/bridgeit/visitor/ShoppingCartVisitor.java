package com.bridgeit.visitor;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
