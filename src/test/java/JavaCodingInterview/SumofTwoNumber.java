package JavaCodingInterview;

public class SumofTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumofTwoNumber.sumoftwoNumber();

	}
	public static void sumoftwoNumber() {

		int sum = 11;

		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 6 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {

				if (num[i] + num[j] == sum) {
					System.out.println(num[i] + "," + num[j]);
				}

			}
		}

	}

}
