package DailyCodingPractice;

public class Fibonacci {
    public static int fibonacciSkipNumber(int n, int skipNumber) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;

        int a = 0;
        int b = 1;
        int fib = b;

        for (int i = 2; i < n; i++) {
            int sum = a + b;
            
            if (sum == skipNumber) {
                a = b;
                b = sum;
                continue; // Skip the number and continue to the next iteration
            }
            
            fib = sum;
            a = b;
            b = sum;
        }

        return fib;
    }

    public static void main(String[] args) {
        int position = 5; // Change this to the desired position
        int skipNumber = 1; // Change this to the number you want to skip
        int fibNumber = fibonacciSkipNumber(position, skipNumber);

        System.out.println("The Fibonacci number at position " + position + " (skipping number " + skipNumber + ") is: " + fibNumber);
    }
}
