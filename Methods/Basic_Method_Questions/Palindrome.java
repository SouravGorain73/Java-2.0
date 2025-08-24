import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();

        boolean ans = isPalindrome(num);
        if(ans == true){
            System.out.println(num + " is a Palindrome Number");
        }
        else{
            System.out.println(num + " is not a Palindrome Number");
        }

    }

    static boolean  isPalindrome(int val){
        int originalValue = val;
        int reverse = 0;
        
        while(val > 0){
            int rem = val % 10;
            reverse = reverse*10 + rem;
            val = val / 10;
        }
        return reverse == originalValue;
    }
}