import java.util.Scanner;

public class SumOfNaturalNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        int ans = sum(num);
        System.out.println("Sum of " + num + " Natural Numbers is: " + ans);
    }

    static int sum(int val){
        int sum = 0;
        while(val > 0){
            sum += val;
            val--;
        }
        return sum;
    }
}