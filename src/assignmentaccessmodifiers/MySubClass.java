package assignmentaccessmodifiers;

public class MySubClass extends MyClass {

	public void display() {// public method of superclass overridden in subclass , must have same or less  limited access in comparison to superclass
		super.display(); // public method of superclass accessible in subclass of same package
		System.out.println("superclass variable :" + super.num); //public superclass variable accessible in subclass of same package
		System.out.println("superclass variable :" + num); // public superclass variable accessible in subclass of same package
		System.out.println("MySubClass method");
	}

	public static void main(String[] args) {
		MySubClass ms = new MySubClass();
		ms.display(); // calling subclass method
		System.out.println(ms.num); // public superclass variable is accessible in subclass of same package
	}
}
