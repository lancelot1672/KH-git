package com.kh.animal;

public class Dog implements Animal{

	@Override
	public void bark() {
		System.out.print("�п�!!");
	}
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.bark();
	}

}
