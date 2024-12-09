package day2;

//varargs variable length arguments function can handle an unspecified number of arguments
public class VarArgs {

	void print(int a) {
		System.out.println("Integer: " + a);
	}

	void print(int... numbers) {
		System.out.println("Varargs: " + numbers.length);
	}

	public static void printNumbers(String... numbers) {
		for (String num : numbers) {
			System.out.println(num);
		}

	}

	public void printNumbers(int... numbers) {
		for (int num : numbers) {
			System.out.println(num);
		}
	}
	
	    // Method with varargs
	    public void display(int... numbers) {
	        for (int num : numbers) {
	            System.out.println("Number: " + num);
	        }
	    }
	        
	public static void main(String[] args) {

		VarArgs v = new VarArgs();
		v.print(5);
		v.print(1, 2, 3, 5);
		printNumbers("asdf", "asdf", "dfgh", "hjk", "fghj"); // Pass a variable number of arguments
		
		
        v.display(10, 20, 30);  // Calls the varargs version with 3 arguments
        v.display(5, 15);        // Calls the varargs version with 2 arguments
  
	}

}
