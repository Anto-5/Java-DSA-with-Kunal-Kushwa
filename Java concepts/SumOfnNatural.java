import java.util.Scanner;
public class SumOfnNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n < 1) {
    System.out.println("Please enter a positive integer.");
} else {
    System.out.println("The sum of " + n + " natural numbers is: " + (n * (n + 1)) / 2);
}
        
        sc.close();
    }
}
/*ORRRR
 static int sumOfNaturalNumbers(int n) {

        if (n < 1) {
            return 0;
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    } */