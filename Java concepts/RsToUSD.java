import java.util.Scanner;
public class RsToUSD {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        double inr = scn.nextDouble();

        double usd = inr / 94.33 ; // Assuming 1 USD = 94.33 INR 
        // as it is rn after a quick google search

        System.out.printf("USD = %.3f", usd);

        scn.close();
    }
}
