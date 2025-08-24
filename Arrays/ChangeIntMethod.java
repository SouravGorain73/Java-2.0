import java.util.Arrays;
import java.util.Scanner;

public class ChangeIntMethod{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Elements You Want to Enter: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th element: ");
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        change(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0] = 73;
    }
}