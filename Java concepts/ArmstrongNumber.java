import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            int temp = i;
            int sum = 0;

            while (temp > 0) {

                int rem = temp % 10;

                sum = sum + rem * rem * rem;

                temp = temp / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}