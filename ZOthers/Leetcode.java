class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = nums[i] - 1;
            if(nums[i] != i + 1){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }
        int j = 0;
        while(j < nums.length){
            if(nums[j] != j + 1){
                list.add(j);
            }
            j++;
        }
        return list;
    }
}