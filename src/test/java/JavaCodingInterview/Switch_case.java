package JavaCodingInterview;

public class Switch_case {
// What is the switch case
	// what is switch Statement
	// how to use the switch statement
	// where you Switch statement
	public static void main(String[] args) {
		// Basically anything I want to switch one value to another then I have to
		// switch.
		// same code use different environments like UAT, QA. DEV then I have to use
		// switch statement
		// If I want to switch the value one value to another value, then I have to use
		// switch statement.
		Switch_case.getDays(3);
	}

	public static void getDays(int days) {
		int day = days;
		String dayString;

		switch (day) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		default:
			dayString = "Invalid";
			break;

		}
System.out.println("Today is : "+dayString);
	}
}
