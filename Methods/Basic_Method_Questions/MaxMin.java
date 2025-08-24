import java.util.Scanner;

public class MaxMin{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        int maxValue = isMax(num1, num2, num3);
        System.out.println("Maximum Value is: " + maxValue);
        int minValue = isMin(num1, num2, num3);
        System.out.println("Minimum Value is: " + minValue);
    }

    static int isMax(int num1, int num2, int num3){
        int max = num1;
        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }
        return max;
    }

    static int isMin(int num1, int num2, int num3){
        int min = num1;
        if(num2 < min){
            min = num2;
        }
        if(num3 < min){
            min = num3;
        }
        return min;
    }
}