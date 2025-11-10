// Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.
// The words in paragraph are case-insensitive and the answer should be returned in lowercase.
// Note that words can not contain punctuation symbols.
// Example 1:

// Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
// Output: "ball"
// Explanation: 
// "hit" occurs 3 times, but it is a banned word.
// "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
// Note that words in the paragraph are not case sensitive,
// that punctuation is ignored (even if adjacent to words, such as "ball,"), 
// and that "hit" isn't the answer even though it occurs more because it is banned.

// Example 2:

// Input: paragraph = "a.", banned = []
// Output: "a"

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> set = new HashSet<>();
        for(String b:banned){
            set.add(b.toLowerCase());
        }

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String[] words = paragraph.split("\\s+");

        Map<String,Integer> map = new HashMap<>();
        for(String w: words){
            if(!set.contains(w) && w.length()>0){
                map.put(w,map.getOrDefault(w,0)+1);
            }
        }
        String result = "";
        int max =0;
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
        
    }
}  

