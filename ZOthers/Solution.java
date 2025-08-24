
public class Solution{  
    public static void main(String[] args){
        int[] arr = {1, 2, 0};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] > 0 && nums[i] < nums.length){
                int index = nums[i] - 1;
                if(nums[i] != nums[index]){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                }
                else{
                    i++;
                }
            }else{
                i++;
            }
        }
        for(int j = 1; j <= nums.length; j++){
            if(nums[j - 1] != j){
                return j;
            }
        }
        return -1;
    }
}

//     public static int findDuplicate(int[] nums) {
//         int i = 0;
//         while(i < nums.length){
//             int index = nums[i] - 1;
//             if(nums[i] != nums[index] && nums[i] != i + 1){
//                 int temp = nums[i];
//                 nums[i] = nums[index];
//                 nums[index] = temp;
//             }
//             else{
//                 i++;
//             }
//         }
//         int j = 0;
//         int n = -1;
//         while(j < nums.length){
//             if(nums[j] != j + 1){
//                 n = nums[j];
//                 break;
//             }
//             j++;
//         }
//         return n;
//     }
// }
    
    // public static List<Integer> findDisappearedNumbers(int[] nums) {
    //     List<Integer> list = new ArrayList<>();
    //     int i = 0;
    //     while(i < nums.length){
    //         int index = nums[i] - 1;
    //         if(nums[i] != nums[index] && nums[i] != i + 1){
    //             int temp = nums[index];
    //             nums[index] = nums[i];
    //             nums[i] = temp;
    //         }
    //         else{
    //             i++;
    //         }
    //     }
    //     System.out.println(Arrays.toString(nums));
    //     int j = 0;
    //     while(j < nums.length){
    //         if(nums[j] != j + 1){
    //             list.add(j);
    //         }
    //         j++;
    //     }
    //     return list;
    // }
// }

    // public static int[] plusOne(int[] digits) {
    //     int val = 0;
    //     int n = digits.length;
    //     if(digits[digits.length-1] == 9){
    //         n = digits.length+1;
    //     }
    //     int[] res = new int[n];
    //     for(int i = 0; i < digits.length; i++){
    //         val = val*10 + digits[i];
    //     }
    //     val++;
    //     int index = res.length-1;
    //     while(val > 0){
    //         int rem = val % 10;
    //         res[index] = rem;
    //         val = val / 10;
    //         index--;
    //     }
    //     return res;
    // }


    // public static int[] sumZero(int n) {
    //     int[] ans = new int[n];
    //         int left = 0;
    //         int right = n-1;
    //         int l = -n/2;
    //         int r = n/2;
    //         for(int i = 0; i < (n+1)/2; i++){
    //             ans[left] = l;
    //             ans[right] = r;
    //             left++;
    //             l++;
    //             right--;
    //             r--;
    //         }
    //     return ans;
    // }
    // public static int[] twoSum(int[] nums, int target) {
    //     int[] ans = new int[2];
    //     int right = nums.length-1;
    //     for(int left = 0; left < nums.length; left++){
    //         while(left < right){
    //             if(nums[left] + nums[right] == target){
    //                 ans[0] = left;
    //                 ans[1] = right;
    //                 break;
    //             }
    //             right--;
    //         }
    //     }
    //     return ans;
    // }