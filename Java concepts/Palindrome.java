import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scn.nextLine().trim();

        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)) {
            System.out.println("It is in fact, without a shadow of doubt, a Palindrome!");
        }
        else {
            System.out.println("It is not a Palindrome, oh shucks, what a bummer!");
        }

        scn.close();
    
    }   
}
