package JavaCodingInterview;

public class Palindrome {

	public static void main(String[] args) {

		Palindrome.palindrome();
	}

	public static void palindrome() {

		String value = "Mom";
		System.out.println("Orginal Value ::" + value);

		String rev = "";

		for (int i = value.length() - 1; i >= 0; i--)
			rev = rev + value.charAt(i);
		System.out.println("after reverse ::" + rev);
		if (value.equalsIgnoreCase(rev)) {
			System.out.println("This is a Palindrome ::" + rev);
		} else {
			System.out.println("This is not a Palindrome ::" + rev);
		}

	}

	// ---Alternative way
	public static void getpalindrome() {

		String value = "LoLLollOLlol";
		System.out.println("Before Reverse :: " + value);
		String rev = "";

		for (int i = value.length() - 1; i >= 0; i--)
			rev = rev + value.charAt(i);
		System.out.println("After Reverse :: " + rev);

		System.out.println("=============================");
		if (value.equalsIgnoreCase(rev)) {
			System.out.println("This is Palindrome");
		} else {
			System.out.println("This is not a Palindrome");
			System.out.println("End");
		}

	}
	

}
