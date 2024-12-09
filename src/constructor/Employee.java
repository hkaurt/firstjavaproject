package constructor;

public class Employee {

	private String name;
	private int id;

	// Constructor with no parameters
	public Employee() {
		this.name = "Unknown";
		this.id = 0;
	}

	// Constructor with one parameter
	public Employee(String name) {
		this.name = name;
		this.id = 0;
	}

	// Constructor with two parameters
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void display() {
		System.out.println("Employee Name: " + name + ", ID: " + id);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(); 
		Employee emp2 = new Employee("John");
		Employee emp3 = new Employee("Jane", 101);

		emp1.display();
		emp2.display();
		emp3.display();
	}

}
