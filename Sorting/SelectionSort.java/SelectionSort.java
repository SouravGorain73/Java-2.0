
import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1, 0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int max = Integer.MIN_VALUE;
            int index = -1;
            for(int j = 0; j < n - i; j++){
                if(arr[j] > max){
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[n - i - 1];
            arr[n - i-1] = max;
            arr[index] = temp;
        }
    }
}