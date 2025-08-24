import java.util.Scanner;

public class LargestInteger{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = input.nextInt();

//Method-1
        // if(num1 > num2){
        //     if(num1 > num3){
        //         System.out.print("Largest Integer is: " + num1);
        //     }
        //     else{
        //         System.out.print("Largest Integer is: " + num3);
        //     }
        // }
        // else{
        //     if(num2 > num3){
        //         System.out.print("Largest Integer is: " + num2);
        //     }
        //     else{
        //         System.out.print("Largest Integer is: " + num3);
        //     }
        // }


//Method-2
        // int max = num1;
        // if(num2 > max){
        //     max = num2;
        // }
        // if(num3 > max){
        //     max = num3;
        // }
        // System.out.print("Largest Integer is: " + max);


//Method-3
        int max = Math.max(Math.max(num1, num2), num3);
        System.out.print("Largest Integer is: " + max);

    }
}