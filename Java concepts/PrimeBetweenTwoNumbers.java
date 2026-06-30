import java.util.Scanner;

public class PrimeBetweenTwoNumbers {

    // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Ensure the smaller number comes first
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        boolean found = false;

        System.out.println("\nPrime numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No prime numbers found.(Make sure the inputs are greater than 1)");
        }

        sc.close();
    }
}