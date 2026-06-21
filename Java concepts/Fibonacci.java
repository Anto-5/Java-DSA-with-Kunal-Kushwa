import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = scn.nextInt();

        int a = 0, b = 1;

        for(int i = 1; i <=n; i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        scn.close();
    }
}