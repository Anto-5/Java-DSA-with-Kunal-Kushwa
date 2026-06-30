import java.util.Scanner;

public class Grade {

    // Method to determine the grade
    static String getGrade(int marks) {

        if (marks < 0) {
            return "Invalid Marks";
        } else if (marks >100){
            return "S";
        }else if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks (0-100): ");
        int marks = input.nextInt();

        System.out.println("Grade: " + getGrade(marks));

        input.close();
    }
}