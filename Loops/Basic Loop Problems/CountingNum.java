import java.util.Scanner;

public class CountingNum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        System.out.print("Enter a Number to check it's occurences: ");
        int n = input.nextInt();
        int count = 0;
        
        while(num>0){
            int rem = num % 10;
            if(rem == n){
                count++;
            }
            num = num / 10;
        }
        System.out.println("No. of occurences of " + n + " is: " + count);
    }
}