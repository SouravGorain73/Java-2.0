import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        boolean ans = isArmstrong(num);
        System.out.println(ans);

    }

    static boolean isArmstrong(int val){
        int originalValue = val;
        int sum = 0;
        while(val>0){
            int rem = val % 10;
            sum += rem*rem*rem;
            val = val / 10;
        }
        return sum == originalValue;        //It works same as the if-else statement given below(return true if sum == originalValue, otherwise return false)
        
        // if(sum == originalValue){
        //     return true;
        // }
        // else{
        //     return false;
        // }
    }
}