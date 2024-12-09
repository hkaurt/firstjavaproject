package assignment;

public class AnimalType extends Animal {

	String name;
	AnimalType(String name) {
		super("Animal"); // calls superclass constructor and initiates variable
		this.name=name;
		System.out.println(name+" is an "+ super.name);
		
	}

	@Override
	void eat(String food) {
		super.eat(food); // calls superclass method with initiate parameter

		if (food.equals("meat")) {
			System.out.println(name+" is carnivorous");
		} else
			System.out.println(name+" is herbivorous");

	}

	public static void main(String[] args) {
		AnimalType d = new AnimalType("Deer"); //initialise variable of subclass through constructor
		d.eat("grass"); // calls subclass method 

	}
}
