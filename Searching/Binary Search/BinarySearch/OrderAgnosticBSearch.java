public class OrderAgnosticBSearch{
    public static void main(String[] args){
        int[] arr = {128, 64, 32, 16, 8, 4, 2, 1};
        int ans = OrderAgnosticSearch(arr, 4);
        System.out.print(ans);
    }

    static int OrderAgnosticSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if(arr[start] < arr[end]){
                while(start <= end){
                    int mid = start + (end - start) / 2;
                    if(arr[mid] > target){
                        end = mid-1;
                    }
                    else if(arr[mid] < target){
                        start = mid + 1;
                    }
                    else return mid;
                }
        }
        else{
            while(arr[start] >= arr[end]){
                    int mid = end + (start - end) / 2;
                    if(arr[mid] > target){
                        start = mid + 1;
                    }
                    else if(arr[mid] < target){
                        end = mid - 1;
                    }
                    else return mid;
                }
        }
        return -1;
    }

}