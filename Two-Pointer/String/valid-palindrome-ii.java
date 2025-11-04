// Given a string s, return true if the s can be palindrome after deleting at most one character from it.
// Example 1:

// Input: s = "aba"
// Output: true

// Example 2:

// Input: s = "abca"
// Output: true
// Explanation: You could delete the character 'c'.

// Example 3:

// Input: s = "abc"
// Output: false

class Solution {
    public boolean validPalindrome(String s) {
        

        int left=0,right=s.length()-1;
        boolean found = false;
        while(left<right){
            if(s.charAt(left)== s.charAt(right)){
                left++;
                right--;
            }else{
                if(found) return false;
                return isvalid(s,left+1,right) || isvalid(s,left,right-1);
            }
        }
        return true;
    }
    public boolean isvalid(String s, int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
            
        }
        return true;
    }

        
}
