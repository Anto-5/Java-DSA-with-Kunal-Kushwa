import java.util.Scanner;
public class AugustEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        //there are 31 days in August, so we can use a for loop to iterate through each day
        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Kunal can go out with his friends in August " + count + " times :)");
        scn.close();
    }
    
}
