import java.util.*;
public class Calc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scn.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scn.nextDouble();
        System.out.println("Enter the operation (+, -, *, /): ");
        char op = scn.next().charAt(0);
        double result;
        if (op == '+') {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        }
        else if (op == '-') {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        }
        else if (op == '*') {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        }
        else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Error: Invalid operation.");
        }
        scn.close();
    }

}
