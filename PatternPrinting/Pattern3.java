import java.util.Scanner;

public class Pattern3{
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern3(n);
    }

    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n + 1 - row; col++){
                System.out.print("* ");
            }
            //after a row print a new line
            System.out.println();
        }
    }
}