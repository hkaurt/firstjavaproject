package constructor;

// constructor example 2
public class Person {

	String name, gender;
	int age;

	// parameterised construtor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// overloading with different number of parameters
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void display() {
		System.out.println("Name of the person is: " + name);
		System.out.println("Age of the person is: " + age);
		System.out.println("Gender of the person is: " + gender);
	}

	public static void main(String[] args) {
		Person person1 = new Person("john", 26);
		person1.display(); //The constructor that matches the parameters used at the time of object creation is called at compile time

		Person person2 = new Person("Mike", 30, "Male"); 
		person2.display(); // compile time polymorphism
	}

}
