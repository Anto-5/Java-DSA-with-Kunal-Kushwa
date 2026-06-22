import java.util.Scanner;

public class LargestAfterZero {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter numbers (0 to stop):");

        int n = scn.nextInt();

        if (n == 0) {
            System.out.println("You just entered zero!");
            return;
        }

        int largest = n;

        while (n != 0) {

            if (n > largest) {
                largest = n;
            }

            n = scn.nextInt();
        }

        System.out.println("The largest number is: " + largest);

        scn.close();
    }
}