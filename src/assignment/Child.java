package assignment;

public class Child extends Parent {

	String name="Child variable"; 
	// Constructor
	Child() {
		// implicitly calls constructor of Parent class 
		System.out.println("Constructor of Child class");
	}

	@Override
	void methodParent() {
		super.methodParent();
		// always explicitly call methodParent of Parent class to access using super keyword
		System.out.println("variable of parent class: " + super.name);
		System.out.println("variable of child class: "+ name);
	}

	public static void main(String[] args) {

		Child child = new Child();
		child.methodParent();

	}
}
