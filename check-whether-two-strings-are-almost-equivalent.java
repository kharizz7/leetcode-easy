// 2068. Check Whether Two Strings are Almost Equivalent

// Example 1:

// Input: word1 = "aaaa", word2 = "bccb"
// Output: false

// Example 2:

// Input: word1 = "abcdeef", word2 = "abaaacc"
// Output: true
// Explanation: The differences between the frequencies of each letter in word1 and word2 are at most 3:
// - 'a' appears 1 time in word1 and 4 times in word2. The difference is 3.
// - 'b' appears 1 time in word1 and 1 time in word2. The difference is 0.
// - 'c' appears 1 time in word1 and 2 times in word2. The difference is 1.
// - 'd' appears 1 time in word1 and 0 times in word2. The difference is 1.
// - 'e' appears 2 times in word1 and 0 times in word2. The difference is 2.
// - 'f' appears 1 time in word1 and 0 times in word2. The difference is 1.

// Example 3:

// Input: word1 = "cccddabba", word2 = "babababab"
// Output: true

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        // it makes an empty array to store 26 values
       int[] freq1 = new int[26];
       int[] freq2 = new int[26];

       for(char c: word1.toCharArray()){
        // value c=d => d-'a' = 100-97 = 3
        // index value 3 count increased to 1
        freq1[c- 'a']++;
       }
       for(char c: word2.toCharArray()){
        freq2[c-'a']++;
       }

       for(int i=0; i<26; i++){
        // subtract values from word1 to word2
        if(Math.abs(freq1[i] -freq2[i])>3){
            return false;
        }
       }
       return true;
        
    }
}
