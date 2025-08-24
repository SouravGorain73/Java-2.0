import java.util.Arrays;
import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How Many Rows You Want to Input: ");
        int rows = input.nextInt();
        System.out.print("How Many Columns You Want to Input: ");
        int col = input.nextInt();
        int[][] arr = new int[rows][col];

        // //Taking Inputs
        // for(int i = 0; i < rows; i++){
        //     for(int j = 0; j < 3; j++){
        //         arr [i][j] = input.nextInt();
        //     }
        // }

        // //Printing 
        // for(int i = 0; i < rows; i++){
        //     for(int j = 0; j < 3; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //Takaing Inputs

        System.out.print("Enter "  + rows*col + " Elements: ");

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = input.nextInt();
            }
        }

        //Taking Inputs using Enhanced for loop

        // for (int[] arr1 : arr) {
        //     for (int j = 0; j < arr1.length; j++) {
        //         arr1[j] = input.nextInt();
        //     }
        // }

        //Printing 1 (using Normal For Loop)

        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr[i].length; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //Printing 2 (Using Arrays.toString)

        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }

        //Printing 3 (Using Enhanced For Loop)

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}