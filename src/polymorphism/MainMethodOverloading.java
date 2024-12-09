package polymorphism;

public class MainMethodOverloading {

	public static void main(int a) {

		System.out.println(a);

	}

	public void main(String s) {
		System.out.println(s);
	}

// main method can be overloaded technically but cant override it as its static and cant be extended to child class

	public static void main(String[] args) {

		System.out.println("its main method");
		MainMethodOverloading.main(10); // will need main method to execute it
		new MainMethodOverloading().main("john");
	}
}
