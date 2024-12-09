package assignmentmonday;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the original string: ");
		String orgString=scanner.nextLine();
		String revString= "";
		
		//one way- using charAt and for loop
		for(int i=orgString.length()-1; i>=0; i--) {
			revString = revString+ orgString.charAt(i);
		}
		
		System.out.println("Output of reversed String: " + revString);
		
		
		
		//second way using bufferString
		StringBuffer bs= new StringBuffer(orgString);
		System.out.println("using StringBuffer Reversed String: "+ bs.reverse());
		
		scanner.close();
	}
	
}
