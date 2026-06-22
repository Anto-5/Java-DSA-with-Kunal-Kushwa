import java.util.Scanner;
public class Factors {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();
        if (n==0){
            System.out.println("The number is 0, so it has infinite factors.");
        }
        else if (n<0){
            System.out.println("The number is negative, so it has no factors.");
        }
        else{
            System.out.println("The factors of " + n + " are: ");
        }
        for (int i = 1; i<=n; i++){
            if(n%i == 0){
                System.out.println(i + " is a factor of " + n);

            }
        }

    }
    
}
