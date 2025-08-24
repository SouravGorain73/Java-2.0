import java.util.Scanner;

public class TwoSumIntegers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        float a = input.nextFloat();
        System.out.print("Enter Second Number : ");
        float b = input.nextFloat();
        float sum = a+b;
        System.out.print("The Sum of " +a+" and " +b+" is :" + sum);

    }
}