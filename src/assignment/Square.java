package assignment;

public class Square extends Shape {

	String color;

	Square() {
		super("orange"); // constructor call must be first statement in constructor
		// if 2 constructor in superclass then explicitly call the constructor
		// otherwise default will be called
		this.color="Red"; // 'this' current instance of class,initiate variable of child class 
	}

	public void draw() { // access superclass overriden method
		System.out.println("parent class has color: " + super.color);
		super.draw(); // calls draw method of Shape class
		System.out.println("draw a square of color: " + color);
	}

	public static void main(String[] args) {

		Square sq = new Square();
		sq.draw();

	}

}
