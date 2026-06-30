import java.util.Scanner;

public class VoteOrNot {

    static boolean isEligible(int age) {

        if (age >= 18) {
            System.out.println("You are eligible to vote");
            return true;
        }
        else if (age <= 0){
            System.out.println("Age cannot be negative or 0");
        }
        else {
            System.out.println("Age is less than 18, you can't vote yet.");
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        isEligible(age);

        sc.close();
    }
}