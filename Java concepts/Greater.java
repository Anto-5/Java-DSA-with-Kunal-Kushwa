import java.util.Scanner;

class Greater {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        if (!scn.hasNextDouble()) {
            System.out.println("Invalid input");
            scn.close();
            return;
        }

        double num1 = scn.nextDouble();

        System.out.print("Enter the second number: ");

        if (!scn.hasNextDouble()) {
            System.out.println("Invalid input");
            scn.close();
            return;
        }

        double num2 = scn.nextDouble();

        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater.");
        } else {
            System.out.println("Both are equal.");
        }

        scn.close();
    }
}