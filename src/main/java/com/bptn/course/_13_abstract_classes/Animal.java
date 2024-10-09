package com.bptn.course._13_abstract_classes;

// generic
// Can not used to create objects
public abstract class Animal {

	// Abstract method
	public abstract void sound();

	// Concrete Method
	public void sleep() {
		System.out.println("sleeping");
	}

}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}
