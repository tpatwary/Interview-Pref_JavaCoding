package SwapNumber;

public class SwapNumber2 {

	public static void swapnum(int m, int n) {

		m = m - n;
		n = m + n;
		m = n - m;

		System.out.println("After swap:" + "Value of m is:" + m + " Value of n is:" + n);

	}

	public static void main(String[] args) {
		int m = 9, n = 5;
		System.out.println("Before swap:" + "Value of m is:" + m + " Value of n is:" + n);

		SwapNumber2.swapnum(m, n);

	}

}
