import java.util.Scanner;
public class PythagoreanTriplet {
    static boolean isPythagoreanTriplet(int a, int b, int c) {
        // Check if the triplet satisfies the Pythagorean theorem
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scn.nextInt();
        System.out.println("Enter the second number: ");
        int b = scn.nextInt();
        System.out.println("Enter the third number: ");
        int c = scn.nextInt();
        if(isPythagoreanTriplet(a, b, c)) {
            System.out.println("The numbers form a Pythagorean triplet.");
        } else {
            System.out.println("The numbers do not form a Pythagorean triplet.");
        }
        scn.close();


    }

    
}
