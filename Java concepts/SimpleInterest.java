import java.util.*;
public class SimpleInterest {
    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double principal = scn.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = scn.nextDouble();
        System.out.println("Enter the time: ");
        double time = scn.nextDouble();
        double simpleInterest = (principal*rate*time)/100;
        System.out.println("The simple interest is: "+simpleInterest);
        scn.close();
    }
    
}
