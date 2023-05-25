package SwapNumber;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
//This program is to swap/exchange two numbers by using a variable.
		int x, y, t;// x and y are to swap

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of X and Y" + "::");

		x = sc.nextInt();
		y = sc.nextInt();

		System.out.println("before swapping number:" + x + "<swap> " + y);

		t = x;
		x = y;
		y = t;

		System.out.println("After swapping number:" + x + " <swap>" + y);
		System.out.println();

	}

}
