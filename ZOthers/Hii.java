class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
            int left = 0;
            int right = n-1;
            int l = -(n/2);
            int r = n/2;
            for(int i = 0; i < (n+1)/2; i++){
                ans[left] = l;
                ans[right] = r;
                left++;
                right--;
                l++;
                right--;
            }
        return ans;
    }
}