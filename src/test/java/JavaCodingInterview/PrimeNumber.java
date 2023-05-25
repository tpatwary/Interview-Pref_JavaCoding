package JavaCodingInterview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber.Primenumber2();
	}

	public static void getPrimeNumber() {

		int num = 50;

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

	// ----Alam Bhai
	public static void Primenumber2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value ::");

		int num = sc.nextInt();

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {

				break;

			} else {
				System.out.println("This is a Prime Number ::" + num);
			}
		}

	}

}
