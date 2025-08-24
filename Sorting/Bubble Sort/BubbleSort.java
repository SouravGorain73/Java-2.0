import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {75, 34, 67, 16, 44};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int j = 1;
            boolean flag = false;
            while(j < arr.length - i){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
                j++;
            }
            if(flag == false){
                return;
            }
        }
    }
}