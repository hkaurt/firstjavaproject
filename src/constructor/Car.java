package constructor;

public class Car {

	// class variables declaration
	String model;
	int year;

	// default constructor
	public Car() {
		model = "Honda";
		year = 2020;
	}

	// parameterized constructor
	public Car(String model, int year) {
		this.model = model; /*
							 * 'this' keyword is used for current instance of class used to initialise
							 * variables if variables name is same as constructor's parameter name otherwise
							 * jvm is confused
							 */
		this.year = year;
	}

	public void display() {
		System.out.println("Model: " + model + " Year: " + year);
	}

	public static void main(String[] args) {
		Car car1 = new Car(); // Calls the default constructor
		car1.display(); // calls method Output: Model: Unknown, Year: 2020

		Car car2 = new Car("Ford", 2019); // Calls the parameterised constructor
		car2.display();
	}
}
