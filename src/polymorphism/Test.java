package polymorphism;

public class Test {
	    public static void main(String[] args) {
	        Parent.display();  // Calls Parent's static method
	        Child.display();   // Calls Child's static method (method hiding)
	    }
	}
