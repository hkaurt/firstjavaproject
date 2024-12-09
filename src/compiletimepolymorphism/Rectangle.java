package compiletimepolymorphism;

public class Rectangle {

	void draw(int length, int width) {
		System.out.println("Draw a rectangle of length " + length + " and width " + width);
	}

	// overloading with different number of parameter
	void draw(int area) {
		System.out.println("Draw a rectangle of area: " + area);
	}

	// overloading with different type of parameter
	void draw(String color) {
		System.out.println("Draw a rectangle of color " + color);
	}

	public static void main(String[] args) {
		
		Rectangle rc= new Rectangle();
		rc.draw(300);  // will call method with one parameter of type int-compile time polymorphism
		rc.draw(10, 20);  // will call method with two parameter of type int-compile time polymorphism
		rc.draw("green");  // will call method with one parameter of type String-compile time polymorphism

	}
}
