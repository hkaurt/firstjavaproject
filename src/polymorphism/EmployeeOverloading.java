package polymorphism;

public class EmployeeOverloading {
	
	String name;
	int id;
	
	EmployeeOverloading()
	{
		this.name="unknown";
		this.id=0;
	}
	
	EmployeeOverloading(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	
	void display()
	{
		System.out.println("Employee name is "+name+ " ID " + id);
	}
	
	public static void main (String[]args) {
		EmployeeOverloading ev1= new EmployeeOverloading("john", 90);
		EmployeeOverloading ev2= new EmployeeOverloading("marc", 58);
		ev1.display();
		ev2.display();
	}
}
