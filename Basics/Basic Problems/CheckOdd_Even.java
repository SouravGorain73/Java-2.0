import java.util.Scanner;

public class CheckOdd_Even{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number to check whether the Number is Odd or Even: ");
        int num = input.nextInt();
        if(num%2 == 0){
            System.out.println("The Number " + num + " is Even");
        }
        else{
            System.out.println("The Number " + num + " is Odd");
        }
    }
}