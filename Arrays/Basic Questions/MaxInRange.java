public class MaxInRange{
    public static void main(String[] args) {
        int[] arr = {32, 4, 76, 54, 87, 43, 68, 42};
        int res = maxRange(arr, 2, 5);

        System.out.println("The Maximum Value is: " + res);

    }

    static int maxRange(int[] arr, int start, int end){
        int max = arr[start];
        for(int i = start; i <=  end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}