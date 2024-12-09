package assignment;

import assignmentaccessmodifiers.MyClass;

public class MySubClass extends MyClass {

	public static void main(String[] args) {
		MySubClass ms = new MySubClass();
		ms.display(); //  public method is accessible in subclass of different package
		System.out.println(ms.num); // public variable is accessible in  subclass of different package
	}
}
