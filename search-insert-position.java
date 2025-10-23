class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(target <= nums[i]){
                // find less and equal elements position
                return i; 
            }
        }
        return nums.length; // if target is bigger than all elements
    }
}
