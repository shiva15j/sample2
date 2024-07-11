package classandobject;

public class Dog {

	// Constructor:- used to instanciate the object

	// The name of the constructor should be same as of the class name

	// You don't need to call a constructor it is going to initialize automatically
	// at the time of object creation

	// There are three types of contsructor

	// Default

	// Paramtrized , Non Paramterized

	// Non Paramterized Constructor
	public Dog() {
		System.out.println("I am a Dog Constructor");
	}

	public Dog(String breed) {
		System.out.println("The breed of the dog is=:" + breed);
	}

	String color;

	int tail = 1;

	public void eat() {
		System.out.println("Dog can eat");
	}

	public void sleep() {
		System.out.println("Dog can sleep");
	}

	public void bark() {
		System.out.println("Dog can bark");
	}

}
