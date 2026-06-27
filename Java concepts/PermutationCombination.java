import java.util.Scanner;

public class PermutationCombination {

    static long factorial(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        // Input validation
        if (n < 0 || r < 0 || r > n) {
            System.out.println("Invalid Input!");
        }
        else {

            long nPr = factorial(n) / factorial(n - r);

            long nCr = factorial(n) / (factorial(r) * factorial(n - r));

            System.out.println("Permutation = " + nPr);
            System.out.println("Combination = " + nCr);
        }

        sc.close();
    }
}