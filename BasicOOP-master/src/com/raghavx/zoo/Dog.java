package com.raghavx.zoo;

public class Dog extends Animal{

	public Dog(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.println("Barks");
	}

	@Override
	public void walk() {
		System.out.println("dog walks ");
	}

	@Override
	public void eat() {
		System.out.println("Dog eats biscuits...");
		
	}
	
	
	
}
