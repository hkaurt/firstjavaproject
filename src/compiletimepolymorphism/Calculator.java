package compiletimepolymorphism;

public class Calculator {

	public void add() {
		int a = 10, b = 20;
		int sum = a + b;
		System.out.println("sum of 2 numbers: " + sum);
	}

	// overloading with 2 parameters
	public int add(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

	public static void main(String[] args) {
		Calculator cl = new Calculator();
		cl.add();                                          // will call non parameterised add method- at compile time- compile time polymorphism
		System.out.println("sum of 3 numbers: " + cl.add(30, 50, 10));         // will call 3 parameterised add method- at compile time- compile time polymorphism

	}
}
