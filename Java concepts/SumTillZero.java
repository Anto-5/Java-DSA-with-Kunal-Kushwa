import java.util.Scanner;
public class SumTillZero {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        int sum = 0;
        if (n<0){
            System.out.println("Please enter only positive numbers or 0.");
        }
        while(n!=0  & n > 0)
        {
            sum = sum + n;
            System.out.print("Enter a number: ");
            n = scn.nextInt();
        }
        if (n==0){
            System.out.println("The sum is: "+sum);
        }
        
        scn.close();
    }
    
}
