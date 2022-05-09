package com.kh.animal;

public class Cat implements Animal{
	private String name; // main에서 작업
	
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.bark();
	}

	@Override
	public void bark() {
	}
}
