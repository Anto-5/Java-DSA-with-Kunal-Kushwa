import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to calculate the sum of its digits:");
        int n = scn.nextInt();
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        System.out.println("The sum of digits is: " + Math.abs(sum));
        scn.close();
    }
    
}
