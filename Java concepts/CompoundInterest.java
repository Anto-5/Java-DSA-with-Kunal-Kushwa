import java.util.Scanner;
public class CompoundInterest {
    public static void main (String [] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double principal = scn.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = scn.nextDouble();
        System.out.println("Enter the time: ");
        double time = scn.nextDouble();
        double compoundInterest = principal*Math.pow((1+(rate/100)),time);
        System.out.println("The compound interest is: "+compoundInterest);
        scn.close();
    }
}