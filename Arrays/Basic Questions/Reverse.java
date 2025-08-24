import java.util.Arrays;

public class Reverse{
    public static void main(String[] args) {
        int[] arr = {3, 45, 57, 42, 87, 75};
        int[] arr2 = {43, 76, 24, 85, 58};
        System.out.println("Array Before Reverse:");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        reverse(arr);
        reverse(arr2);
        System.out.println("Array After Reverse:");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
    
    static void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}