import java.util.Scanner;

public class Simple_Interest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("....Calculate Your Simple Interest....");
        System.out.print("Enter the Principle Amount(P): ");
        float P = input.nextFloat();
        System.out.print("Enter the Interest Rate(R): ");
        float R = input.nextFloat();
        System.out.print("Enter Number of Years(T): ");
        float T = input.nextFloat();

        float SimpleInt = (P * R * T)/100;
        System.out.println("Simple Interest is: Rs." + SimpleInt);
    }
}