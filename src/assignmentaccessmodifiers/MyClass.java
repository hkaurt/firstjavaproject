package assignmentaccessmodifiers;

public class MyClass {

	public int num = 20; // public variable

	public void display() {
		num++; // public variable accessible in same class method
		System.out.println("increment number is " + num);
	}

	public static void main(String[] args) {
		MyClass mc = new MyClass(); // object creation by default constructor
		System.out.println("number is " + mc.num); // public variable is accessible in same class
		mc.display(); // public method is accessible in same class
	}
}
