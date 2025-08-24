import java.util.Scanner;

public class Pattern30{
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern30(n);
    }

    static void pattern30(int n){
        for(int row = 1; row <= n; row++){
            for(int sp = 1; sp <= n - row; sp++){
                System.out.print("  ");
            }
            for(int col1 = row; col1 >= 1; col1--){
                System.out.print(col1 + " ");
            }
            for(int col2 = 2; col2 <= row; col2++){
                System.out.print(col2 + " ");
            }
            //after a row print a new line
            System.out.println();
        }
    }
}