import java.util.Arrays;
import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How Many Elements you want to Enter: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        //printing 1

        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        //printing 2

        // for(int num : arr){                 //for every element in array, print the element
        //     System.out.print(num + " ");    //here num represents the elements of the array
        // }


        //printing 3

        System.out.println(Arrays.toString(arr));
    }
}