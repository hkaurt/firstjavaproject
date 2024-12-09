package conditionalstatements;

//5 examples of switchcase

public class SwitchCase {

	// days of the week
	public void finddayOfWeek(int day) {
		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("invalid day");
			break;

		}
	}

	// Switch-Case with Multiple Labels (Case Grouping)

	public void multipleLables(int num) {

		switch (num) {
		case 1:
		case 2:
		case 3:
			System.out.println("The number is between 1 and 3");
			break;
		case 4:
		case 5:
			System.out.println("The number is between 4 and 5");
			break;
		default:
			System.out.println("The number is outside the expected range");
			break;
		}

	}

	// Switch-Case with char Values
	public void findGrade(char grade) {
		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Below Average");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		default:
			System.out.println("invalid grade");
			break;
		}
	}

	// Switch-Case with String Values
	public void finddayOfWeek(String day) {
		switch (day) {
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday":
			System.out.println("Tuesday");
			break;
		case "Wednesday":
			System.out.println("Wednesday");
			break;
		case "Thursday":
			System.out.println("Thursday");
			break;
		case "Friday":
			System.out.println("Friday");
			break;
		case "Saturday":
			System.out.println("Saturday");
			break;
		case "Sunday":
			System.out.println("Sunday");
			break;
		default:
			System.out.println("invalid day");
			break;

		}
	}

	// Switch Case with enum

	public void findDay() {
		enum Day {
			MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
		}

		Day today = Day.WEDNESDAY;

		switch (today) {
		case MONDAY:
			System.out.println("Start of the week");
			break;
		case WEDNESDAY:
			System.out.println("Midweek hustle");
			break;
		case FRIDAY:
			System.out.println("Almost weekend");
			break;
		default:
			System.out.println("Regular day");
		}
	}

	public static void main(String[] args) {
		SwitchCase sw = new SwitchCase();
		sw.finddayOfWeek(5);
		sw.multipleLables(4);
		sw.findGrade('A');
		sw.finddayOfWeek("Sunday");
		sw.findDay();
	}

}