import java.util.Scanner;

public class HCFandLCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int num1 = a;
        int num2 = b;

        if (a < 0 || b < 0) {
            System.out.println("Please enter only positive numbers or 0.");
            sc.close();
            return;
            
        }
        else {
            // Find HCF using Euclidean Algorithm
        while (b != 0) {

            int remainder = a % b;

            a = b;

            b = remainder;
        }

        int hcf = a;

        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
        }
        

        sc.close();
    }
}