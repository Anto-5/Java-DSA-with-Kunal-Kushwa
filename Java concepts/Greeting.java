import java.util.Scanner;
class Greeting
{
       public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name fren :) : ");
        String name = scn.nextLine();
        System.out.println("Hello " + name + " nice to meet you!" + " You are kind of short");
        System.out.println("Oh sorry, did not mean to say that out loud ;)");
        scn.close();
    }
}