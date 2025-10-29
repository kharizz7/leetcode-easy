// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
// Example 2:

// Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
// Output: 10
// Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0,maxLen=0,zero=0;

        while(right<nums.length){
            if(nums[right]==0){
                // checking for zero
                zero++;
            }
            if(zero>k){
                // eliminating zero
                if(nums[left]==0){
                    zero--;
                }
                // shrink
                left++;   
            }
            if(zero<=k){
                maxLen = Math.max(maxLen,right-left+1);
            }
            // expand
            right++;
        }
        return maxLen;

        
    }
}
