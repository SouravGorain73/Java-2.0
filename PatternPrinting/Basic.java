import java.util.Scanner;

public class Basic{
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern2(n);
    }

    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            //after a row print a new line
            System.out.println();
        }
    }
}