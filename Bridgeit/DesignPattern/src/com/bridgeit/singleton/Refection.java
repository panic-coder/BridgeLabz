package com.bridgeit.singleton;

import java.lang.reflect.Constructor;

public class Refection {
	public static void main(String[] args) {
		EagarInitialization instanceOne = new EagarInitialization().getInstance();
		EagarInitialization instanceTwo = null;
		EagarInitialization instanceThree = null;
		EagarInitialization instanceFour = null;
		try {
			Constructor[] constructors = EagarInitialization.class.getDeclaredConstructors();
			for(Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (EagarInitialization) constructor.newInstance();
				instanceThree =(EagarInitialization) constructor.newInstance();
				instanceFour =(EagarInitialization) constructor.newInstance();
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		System.out.println(instanceThree.hashCode());
		System.out.println(instanceFour.hashCode());
	}
}
