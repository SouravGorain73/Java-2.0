import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        int ans = factorial(num);
        System.out.println("Factorial of " + num + " is: " + ans);

    }

    static int factorial(int val){
        int fact = 1;
        for (int i = val; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }
}