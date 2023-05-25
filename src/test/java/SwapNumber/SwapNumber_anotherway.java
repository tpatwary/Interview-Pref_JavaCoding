package SwapNumber;

public class SwapNumber_anotherway {
	
	public static void getSwapNumber() {
		
		
		int a = 30;
		int b = 10;
		int temp;
		
		System.out.println("Before swap a value is : "+a);
		System.out.println("Before swap B value is : "+b);
		
		temp = a;
		a = b;
		b=temp;
		System.out.println("After swap a value is : "+a);
		System.out.println("After swap B value is : "+b);
		
		
	}
	public static void main(String[] args) {
		SwapNumber_anotherway.getSwapNumber();
	}

}
