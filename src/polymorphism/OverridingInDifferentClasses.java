package polymorphism;

//Overriding with Method Parameters

class Shape {
	void draw() {
		System.out.println("drawing a shape");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("drawing a circle");
	}
}

class Square extends Shape {
	@Override
	void draw() {
		System.out.println("drawing a square");
	}

	void draw(int length) {

		System.out.println("draw a square with length: " + length);
	}
}

//Overriding with super Keyword
class Animall{
	void sound() {
		System.out.println("Animal makes some sound");
	}
}

class Cat extends Animall{
	void sound()
	{
		System.out.println("Cat meows");
	}
	
	void soundInfo()
	{
		super.sound(); // calling method of superclass
	    System.out.println("but cat meows specifically");
	}
}





//Overriding toString Method

/*
 * class Person { String name; int age;
 * 
 * Person(String name, int age) { this.name = name; this.age = age; }
 * 
 * @Override public String toString() { return "Person{name='" + name +
 * "', age=" + age + "}"; } }
 * 
 * public class Main { public static void main(String[] args) { Person person =
 * new Person("John", 25); System.out.println(person); // Output:
 * Person{name='John', age=25} } }
 */

// Overriding with Access Modifiers-ou cannot override a method to have a more restrictive access modifier than the method in the superclass.result in a compile-time error.

class Animalll{
	protected void sleep() {
		System.out.println("Animal sleeps");
	}
}

class Dogg extends Animalll{
	@Override
	protected void sleep()
	{
	System.out.println("Dog sleeps");	
	}
}

class Catt extends Animalll{
	//private void sound() // compile time error becz subclass method is more restricted then parent class
	public void sleep()
	{
		System.out.println("Cat sleeps");
	}
}

public class OverridingInDifferentClasses {

	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.draw();

		Shape circle = new Circle();
		circle.draw();

		Square square = new Square();
		square.draw();
		square.draw(5);
		
		Cat cat= new Cat();
		cat.sound();
		cat.soundInfo();
		
		Animalll animal=new Dogg();
		animal.sleep();
		
		Catt catt=new Catt();
		catt.sleep();
		
	}

}