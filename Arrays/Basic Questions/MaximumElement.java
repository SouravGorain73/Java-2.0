public class MaximumElement{
    public static void main(String[] args) {
        int arr[] = {34, 57, 15, 59, 78};
        int max = max(arr);
        System.out.println("The Maximum Value is: " + max);
        int min = min(arr);
        System.out.println("The Minimum Value is: " + min);

    }

    static int max(int[] arr){
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > res){
                res = arr[i];
            }
        }
        return res;
    }

    static int min(int[] arr){
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < res){
                res = arr[i];
            }
        }
        return res;
    }
}