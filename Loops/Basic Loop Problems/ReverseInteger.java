import java.util.Scanner;

public class ReverseInteger{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number you want to Reverse: ");
        int val = input.nextInt();
        int num = val;
        int reverse = 0;

        // while(num > 0){
        //     int rem = num % 10;
        //     reverse = reverse + rem;
        //     if(num >= 10){               //After adding the the last digit we would not multiply it with 10
        //         reverse = reverse * 10;
        //     }
        //     num = num / 10;
        // }

        while(num > 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        System.out.println("The Reverse Number of " + val + " is: " + reverse);
    }
}