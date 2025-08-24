import java.util.Scanner;


public class Inputs{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.print("Enter Your Age: ");
        int age = input.nextInt();
        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        
    }
}