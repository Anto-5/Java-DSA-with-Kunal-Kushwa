import java.util.*;
public class SubtractingProductAndSum {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();
        int sum = 0;
        int product = 1;
        if (n==0) {
            System.out.println("The number is 0, so the difference between sum and product is: 0");
        }
        else {
            while(n>0)
        {
            int rem = n%10;
            sum = sum + rem;
            product = product*rem;
            n = n/10;
        }

             System.out.println("The sum of digits is: "+sum);
            System.out.println("The product of digits is: "+product);
            System.out.println("The difference between sum and product is: "+(product-sum));
        
    }
        
        scn.close();
    }
}
