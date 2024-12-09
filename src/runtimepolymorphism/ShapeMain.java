package runtimepolymorphism;

class Shape {

	public void draw() {
		System.out.println("Draw a shape");
	}

}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Draw a circle");
	}
}

public class ShapeMain {

	public static void main(String[] args) {
		Shape sp = new Circle();
		sp.draw(); // calls Circle class draw method(based on class object type, not reference
					// type)- decided at run time- Run time polymorphism

	}
}