// Given a string s, find the length of the longest substring without duplicate characters.
// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character,Integer> map = new HashMap<>();
        int maxLen=0;
        int left =0;
        int len=0;
        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);

            // expand
            map.put(c,map.getOrDefault(c,0)+1);

            while(map.get(c)>1){
                char leftChar = s.charAt(left);
                // shrink
                map.put(leftChar, map.get(leftChar)-1);
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
