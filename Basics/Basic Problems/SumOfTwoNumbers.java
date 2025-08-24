import java.util.Scanner;

public class SumOfTwoNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        // int num1 = input.nextInt();
        // int num2 = input.nextInt();
        // int sum = num1 + num2;
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float sum = num1 + num2;
        System.out.println("The Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}