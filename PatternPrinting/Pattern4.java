import java.util.Scanner;

public class Pattern4{
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern4(n);
    }

    static void pattern4(int n){
        for(int row = 1; row <= 2*n - 1; row++){
            int cols;
            if(row <= n){
                cols = row;
            }
            else{
                cols = n * 2 - row;
            }
            for(int col = 1; col <= cols; col++){
                System.out.print("* ");
            }
            
            //after a row print a new line
            System.out.println();
        }
    }
}