package constructor;

//constructor example 3

public class Rectangle {

	int length, width;

	public Rectangle(int length, int width) {
		this.length = length; // 'this' refers to current object, initiates class variables if those are same
								// name as para of constructors
		this.width = width;
	}

	public int calculateArea() {
		int area;
		area = length * width;
		return area;
	}

	public static void main(String[] args) {

		Rectangle rec = new Rectangle(23, 40); // creating object using constructor

		System.out.println("Area of Rectangle is " + rec.calculateArea());
	}

}
