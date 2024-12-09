package loops;
import java.util.Random;
public class PracticeWhileLoop {
	public static void main(String[] args) {
        Random random = new Random();
        int target = 25;
        int generatedNumber;

        // Loop continues until the random number matches the target
        while (true) {
            generatedNumber = random.nextInt(100) + 1;
            System.out.println("Generated number: " + generatedNumber);
            if (generatedNumber == target) {
                System.out.println("Target number " + target + " found!");
                break;
            }
        }
	}
}
