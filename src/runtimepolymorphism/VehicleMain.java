package runtimepolymorphism;

class Vehicle {

	//Method Overriding with Return Type
	
	String startEngine() {

		return ("vehicle engine started");
	}
}

class Car extends Vehicle {
	@Override 

	String startEngine() {
		return ("car engine started");
	}
}

public class VehicleMain {

	public static void main(String[] args) {

		Vehicle vh = new Vehicle(); // default constructor of class Vehicle used to create object
		System.out.println(vh.startEngine()); // output: vehicle engine started

		Vehicle vh1 = new Car(); // default constructor of class Car used to create object
		System.out.println(vh1.startEngine()); // output: car engine started- decides at run time based on object type class
							// name , not reference type class name- run time polymorphism
	}

}
