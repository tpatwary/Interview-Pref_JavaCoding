package JavaCodingInterview;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumber.swapNumber();

	}
	
	public static void swapNumber() {

		int a = 22, b = 35;

		System.out.println("Before Swap A value is ::" + a);
		System.out.println("Before Swap B value is ::" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("============================");
		System.out.println("After Swap A value is ::" + a);
		System.out.println("After Swap B value is ::" + b);

	}

}
