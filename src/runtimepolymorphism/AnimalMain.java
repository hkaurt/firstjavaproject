package runtimepolymorphism;

class Animal {
	// Polymorphism in Overriding
	/*
	 * polymorphism allows you to treat objects of different types (like Dog and
	 * Cat) as objects of a common superclass (Animal), while still calling their
	 * overridden methods correctly.
	 */

	void makeSound() {
		System.out.println("animal makes sound");
	}
}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("dog barks");
	}
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("cat meows");
	}
}

public class AnimalMain {
	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.makeSound(); // Run time polymorphism - decides at run time which method to call based on
							// object type class name
		Animal ani2 = new Cat();
		ani2.makeSound(); // Run time polymorphism
	}

}
