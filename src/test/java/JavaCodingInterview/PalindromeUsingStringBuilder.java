package JavaCodingInterview;

public class PalindromeUsingStringBuilder {

	static void Palindrome() {
		String Name = "Mom";
		StringBuilder sb = new StringBuilder(Name);

		sb.reverse();
		if (Name.equalsIgnoreCase(sb.toString())) {
			System.out.println("This is Palindrome " + Name);

		} else {
			System.out.println("This is not a Palindrome " + Name);
		}
	}

	public static void main(String[] args) {
		Palindrome();
	}

}
