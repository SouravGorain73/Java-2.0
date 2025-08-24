import java.util.Scanner;

public class Output{
    public static void main(String[] args){
        int age;
        System.out.print("Enter Your Age:");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();
        System.out.println("Your age is " + age);
        System.out.printf("Your age is " + age + "\n");
        System.out.printf("You are %d years old", age);

        input.close();
    }
}