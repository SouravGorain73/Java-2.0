public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {2, 4, 6 ,8, 9, 46, 65, 87, 98, 134, 244};
        int ans = binarySearch(arr, 4);
        System.out.print(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;    
            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}