package JavaCodingInterview;

import java.util.Arrays;

public class SecondHighestNumber_IN_JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecondHighestNumber_IN_JAVA.SecondHighestNumber();

	}

	public static void SecondHighestNumber() {

		int num[] = { 1, 3, 5, 8, 66, 120 };
		int size = num.length;
		Arrays.sort(num);
		int result = num[size - 2];
		System.out.println(result);

	}

}
