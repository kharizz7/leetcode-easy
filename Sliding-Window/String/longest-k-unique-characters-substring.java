// You are given a string s consisting only lowercase alphabets and an integer k. Your task is to find the length of the longest substring that contains exactly k distinct characters.

// Note : If no such substring exists, return -1. 

// Examples:

// Input: s = "aabacbebebe", k = 3
// Output: 7
// Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.
// Input: s = "aaaa", k = 2
// Output: -1
// Explanation: There's no substring with 2 distinct characters.
// Input: s = "aabaaab", k = 2
// Output: 7
// Explanation: The entire string "aabaaab" has exactly 2 unique characters 'a' and 'b', making it the longest valid substring.
// Constraints:
// 1 ≤ s.size() ≤ 105
// 1 ≤ k ≤ 26


import java.util.*;
class Solution {
    public int longestKSubstr(String s, int k) {
        int maxLen=-1, right=0, left=0;
        
        Map<Character,Integer> map = new HashMap<>();
        
        while(right<s.length()){
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            
            if(map.size()>k){
                char leftChar = s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                left++;
            }
            
            if(map.size() ==k){
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
        }
        return maxLen;
        
    }
}
