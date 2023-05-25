package DailyCodingPractice;

import java.util.Scanner;

public class Nov6th {

	public static void main(String[] args) {

		Nov6th.palindrome2();
	}

	public static void PrimeNumber() {

		int num = 100;

		for (int i = 2; i <= num; i++) {
			for (int j = 2; j <= i; j++) {
				if (i == j) {
					System.out.println(i);
				}
				if (i % j == 0) {
					break;
				}
			}
		}
	}

	public static void primeNumber2() {

		int num = 15;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				break;
			}
			else {
				System.out.println("This is a Prime Number ::"+num);
			}
		}

	}

	public static void palindrome() {
		String value = "Lol";

		String rev = "";
		for (int i = value.length() - 1; i >= 0; i--)
			rev = rev + value.charAt(i);
		if (value.equalsIgnoreCase(rev)) {
			System.out.println("P");
		} else {
			System.out.println("Not P");
		}
	}

	public static void palindrome2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value ::");

		String value = sc.nextLine();

		String rev = "";
		for (int i = value.length() - 1; i >= 0; i--)
			rev = rev + value.charAt(i);
		if (value.equalsIgnoreCase(rev)) {
			System.out.println("This is Palindrome ::" + rev);
		} else {
			System.out.println("This is not a Palindrome ::" + rev);
		}
	}
}
