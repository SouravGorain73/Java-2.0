import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = input.nextInt();
        int a = 0, b = 1;

        // for (int i = 2; i <= n; i++) {
        //     int temp = b;
        //     b = a + b;
        //     a = temp;  
        // }

        // int i = 2;
        // while(i <= n){
        //     int temp = b;
        //     b = a + b;
        //     a = temp;
        //     i++;
        // }

        int i = 2;
        do { 
            int temp = b;
            b = a + b;
            a = temp;
            i++;
        } while (i <= n);

        System.out.println(n + "th Fibonacci Number is: " + b);
    }
}