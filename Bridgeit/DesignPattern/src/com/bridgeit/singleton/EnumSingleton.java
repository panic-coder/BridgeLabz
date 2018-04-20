package com.bridgeit.singleton;

public enum EnumSingleton {
	INSTANCE;
	int value;
	public int getValues() {
		return value;
	}
	public void setValues(int value) {
		this.value=value;
	}
	public static void main(String[] args) {
		EnumSingleton instance = EnumSingleton.INSTANCE;
		System.out.println(instance.getValues());
		System.out.println(instance.hashCode());
		instance.setValues(2);
		EnumSingleton instanceTwo = EnumSingleton.INSTANCE;
		EnumSingleton instanceThree = EnumSingleton.INSTANCE;
		System.out.println(instance.getValues());
		System.out.println(instanceThree.hashCode());
		System.out.println(instanceTwo.hashCode());
		System.out.println(instance.hashCode());
	}
}
