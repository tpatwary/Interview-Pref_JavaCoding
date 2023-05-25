package JavaCodingInterview;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDuplicates.findduplicate();
	}

	public static void findduplicate() {

		int num[] = { 1, 2, 3, 4, 1, 2, 3, 4, 5, 7, 8, };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}

	}
}
