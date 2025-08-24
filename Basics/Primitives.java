
import java.util.Scanner;

public class Primitives{
    public static void main(String[] args) {
        // int roll = 49;
        // char letter = 's';
        // float marks = 8.23f;
        // double largeDecimalNumber = 4793386.873734;
        // long largeInt= 3287468756L;
        // boolean check = false;
        // Integer rolno = 49;
        // rolno.

        int a = 24_000_000;
        System.out.println(a);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Your Roll No.: ");
        int rollno = input.nextInt();
        System.out.println("Your Roll No. is " + rollno);
    }
}