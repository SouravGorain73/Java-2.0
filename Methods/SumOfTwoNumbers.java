// # Syntax of Method

/*
    return_type name(arguments){
        //body;
        return statement;
    }
*/

import java.util.Scanner;

public class SumOfTwoNumbers{
    public static void main(String[] args){
        //sum(); //function call

        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        int ans = sum(num1, num2);      //Function call - Pass by Value as parameter
        System.out.println("The Sum of " + num1 + " and " + num2 + " is: " + ans);
    }

    // static void sum(){
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter First Number: ");
    //     int num1 = input.nextInt();
    //     System.out.print("Enter Second Number: ");
    //     int num2 = input.nextInt();
    //     int sum = num1 + num2;
    //     System.out.println("Sum is: " + sum);
    // }

    static int sum(int num1, int num2){
        int res = num1 + num2;
        return res;
    }
}