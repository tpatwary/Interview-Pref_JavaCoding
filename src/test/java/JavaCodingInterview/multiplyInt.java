package JavaCodingInterview;

public class multiplyInt {
    public static void main(String[] args) {
        int num[] = {1, 2,6, 3, 4};
        int result = 1;
        for (int i = 0; i < num.length; i++) {
            result = result * num[i];
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print("Output::"+result / num[i] + ", ");
        }
        
    }
}
