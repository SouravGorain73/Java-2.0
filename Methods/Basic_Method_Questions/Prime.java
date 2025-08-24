import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        boolean ans = prime(num);
        System.out.println(num + " is a Prime Number\n-> " + ans);
    }

    static boolean prime(int n){
        int i = 2;
        while(i*i <= n){
            if(n % 2 == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}