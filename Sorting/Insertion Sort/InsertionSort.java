import java.util.Arrays;

public class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        inserionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void inserionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int j = i + 1;
            while(j > 0){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else{
                    break;
                }
                j--;
            }
        }
    }
}