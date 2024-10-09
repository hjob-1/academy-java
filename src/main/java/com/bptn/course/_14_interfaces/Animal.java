package com.bptn.course._14_interfaces;

// public interfaces
// only abstract method and static fields 
// To achieve multiple inheritance
interface Animal {
	void sound();
}

interface Pet {
	void play();

}

class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Dog Barks");

	}

}
