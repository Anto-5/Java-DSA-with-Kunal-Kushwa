import java.util.Scanner;
public class Factorial {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        int n = scn.nextInt();
        long factorial = 1;
        for (int i = 1; i <=n; i++)
        {
            factorial = factorial*i;
        }
        if (n < 0)
        {
            System.out.println("Factorial of negative number does not exist.");
        }
        else
        {
            System.out.println("The factorial of " + n + " is " + factorial);
        }
        scn.close();
    }
    
}
