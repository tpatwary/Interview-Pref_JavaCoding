package JavaCodingInterview;

public class FebonachiNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FebonachiNumber.febonachi();
	}
	
	public static void febonachi() {
		int n1 = 0, n2 = 1, n3, i, count = 10;
		for (i = 0; i < count; i++) {
			n3 = n1 + n2;
			System.out.println(" " + n3);

			n1 = n2;
			n2 = n3;
		}
	}

}
