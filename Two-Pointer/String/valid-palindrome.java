// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.

 

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
        if(Character.isLetterOrDigit(ch)){
            sb.append(Character.toLowerCase(ch));
        }
        }
        char[] arr = sb.toString().toCharArray();
        int left=0,right=arr.length-1;
        boolean found = true;

        while(left<right){
            if(arr[left]!=arr[right]){
                found = false;
            }
            left++;
            right--;
        }
        return found;  
    }
}
