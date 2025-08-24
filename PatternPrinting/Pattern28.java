import java.util.Scanner;

public class Pattern28{
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern28(n);
    }

    static void pattern28(int n){
        for(int row = 1; row <= 2*n - 1; row++){
            int cols;
            if(row <= n){
                cols = row;
            }
            else {
                cols = 2*n - row;
            }
            int sps = n - cols;
            for(int sp = 1; sp <= sps; sp++){
                System.out.print(" ");
            }
            for(int col = 1; col <= cols; col++){
                System.out.print("* ");
            }
            //after a row print a new line
            System.out.println();
        }
    }
}