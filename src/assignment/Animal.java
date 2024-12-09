package assignment;

/*@author Harpreet
 * Example of accessing override method, constructor and variable of superclass in subclass
 */

public class Animal {

	String name; 

	// parameterised Constructor
	Animal(String name) {

		this.name = name; // 'this' current instance of class - initiate class variable and used when class variable and constructor parameter has same name
	}

	//parametrised method
	void eat(String food) {
		System.out.println(name + " eats : " + food);
	}

}
