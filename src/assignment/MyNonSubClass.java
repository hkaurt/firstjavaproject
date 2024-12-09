package assignment;

import assignmentaccessmodifiers.MyClass;

public class MyNonSubClass {

	public static void main(String[] args) {
		MyClass mn = new MyClass(); // MyClass has public access so its object is created by its default constructor
		mn.display(); // MyClass has public method and is accessible in different class of different package
		System.out.println(mn.num); // MyClass has public variable and is accessible in different class of different package
	}

}
