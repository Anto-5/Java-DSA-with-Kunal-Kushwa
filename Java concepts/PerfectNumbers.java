import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter only positive numbers.");
            sc.close();
            return;
        }

        int sum = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println(n + " is a Perfect Number.");
        }
        else {
            System.out.println(n + " is not a Perfect Number.");
        }

        sc.close();
    }
}