public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(search(arr, 5, 0, arr.length));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = e + (s-e)/2;
        if(arr[m] == target){
            return m;
        }
        else if(arr[m] > target){
            search(arr, target, s, m - 1);
        }
        else{
            search(arr, target, m + 1, e);
        }
        return  -1;
    }
}