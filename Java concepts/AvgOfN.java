import java.util.Scanner;
public class AvgOfN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements to calculate the average:");
        int n = scn.nextInt();
        int sum = 0; 
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number " + i + ":");
            sum = sum + scn.nextInt();
        }
        if (n == 0) {
            System.out.println("Average is: 0");
        } 
        else if (n<0){
            System.out.println("Please enter only positive numbers or 0.");
        }
        else {
            float average = sum/n;
            System.out.printf("Average is: %.2f", average);
        }
    }
    
}
