public class LinearSearch{
    public static void main(String[] args) {
        int arr[] = {32, 45, 7, 42, 68, 24};
        int target = 42;
        int res = LinearSearch(arr, target);
        System.out.println(target + " is found at the index: " + res);
    }

    public static int LinearSearch(int[] arr, int t){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == t){
                return i;
            }
        }
        return -1;
    }
}