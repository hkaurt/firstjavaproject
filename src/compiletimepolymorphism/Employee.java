package compiletimepolymorphism;

public class Employee {
	String name;

	public void assignInfo() {
		name = "Mike";
		System.out.println("Name is : " + name);
	}

	// overloading with parameter
	public void assignInfo(String deptname) {
		System.out.println("Dept is : " + deptname);

	}

	// overloading with different type of parameter
	public int assignInfo(int id) {
		return id;
	}

	public static void main(String[] args) {
		Employee ev = new Employee();
		ev.assignInfo(); // will call first non parameterised method - compile time polymorphism
		ev.assignInfo("IT"); // will call second parameterised method with String type parameter- compile time polymorphism
		System.out.println("id of " + ev.name + ":" + ev.assignInfo(1007)); // will call third parameterised method with int type parameter- compile time polymorphism
	}
}
