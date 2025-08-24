import java.util.Arrays;

public class SortedMatrix{
    public static void main(String[] args) {
        int[][] arr = {
            {2, 4, 6, 8},
            {10, 20, 30, 40},
            {50, 55, 60, 65},
            {66, 77, 88, 99}
        };
        System.out.println(Arrays.toString(search(arr, 6)));
    }

    static int[] BinarySearch(int[][] arr, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;

            if(arr[row][mid] == target){
                return new int[] {row, mid};
            }
            if(arr[row][mid] > target){
                cEnd = mid - 1;
            }
            else{
                cStart = mid + 1;
            }
        }
        return new int[] {-1, -1};
    }

    static int[] search(int[][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;

        if(rows == 1){
            return BinarySearch(arr, 0, 0, cols-1, target);
        }
        
        //run the loop till only 2 rows are remaining
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while(rStart < rEnd - 1){                    //It will execute till only two rows will remaining
            int mid = rStart + (rEnd - rStart) / 2;
            if(arr[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            else if (arr[mid][cMid] > target){      //Ignore all the rows under it
                rEnd = mid;     //rEnd++ -> mid 
            }
            else{                                   // Ignore all the rows above it
                rStart = mid;       //rStart++ -> mid 
            }
        }
        if(arr[rStart][cMid] == target){
            return new int[] {rStart, cMid};
        }
        else if(arr[rStart + 1][cMid] == target){
            return new int[] {rStart + 1, cMid};    //Changed rStart to rStart + 1
        }

        //Search in 1st half
        if(arr[rStart][cMid - 1] >= target){
            return BinarySearch(arr, rStart, 0, cMid - 1, target);
        }
        //Search in 2nd half
        if(arr[rStart][cMid+1] <= target && arr[rStart][cols - 1] >= target){
            return BinarySearch(arr, rStart, cMid + 1, cols - 1, target);
        }
        //Search in 3rd half
        if(arr[rStart + 1][cMid - 1] >= target){
            return BinarySearch(arr, rStart + 1, 0, cMid - 1, target);
        }
        //Search in 4th half
        else{
            return BinarySearch(arr, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}