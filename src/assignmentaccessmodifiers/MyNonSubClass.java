package assignmentaccessmodifiers;

public class MyNonSubClass {
	
	public static void main(String[] args) {
		MyClass mn = new MyClass(); // can create object of MyClass in subclass as class is public
		mn.display(); // public method is accessible in different class of same package
		System.out.println(mn.num); // public variable is accessible in different class of same package
	}

}
