import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        int original1 = num1;
        int sum1 = 0;

        while (num1 > 0) {
            int rem = num1 % 10;
            sum1 = sum1 + rem * rem * rem;
            num1 = num1 / 10;
        }

        if (sum1 == original1) {
            System.out.println(original1 + " is an Armstrong number");
        } else {
            System.out.println(original1 + " is not an Armstrong number");
        }

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int original2 = num2;
        int sum2 = 0;

        while (num2 > 0) {
            int rem = num2 % 10;
            sum2 = sum2 + rem * rem * rem;
            num2 = num2 / 10;
        }

        if (sum2 == original2) {
            System.out.println(original2 + " is an Armstrong number");
        } else {
            System.out.println(original2 + " is not an Armstrong number");
        }

        sc.close();
    }
}