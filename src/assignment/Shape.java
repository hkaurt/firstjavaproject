package assignment;

public class Shape {

	String color = "Yellow"; 

	//Non parametrised constructor
	Shape() {
		this.color = "blue";
	}
	
	//parameterised constructor- overloading
	Shape(String color) {
		this.color = color;
	}
    
	//non parameterized method of Shape class
	public void draw() {
		System.out.println("draw a shape of color:" + color);
	}

	
}
