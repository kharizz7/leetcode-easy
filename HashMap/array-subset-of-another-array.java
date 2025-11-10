// Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].
// Examples:

// Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
// Output: true
// Explanation: b[] is a subset of a[]

// Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
// Output: true
// Explanation: b[] is a subset of a[]

// Input: a[] = [10, 5, 2, 23, 19], b[] = [19, 5, 3]
// Output: false
// Explanation: b[] is not a subset of a[]

class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int j: b){
            if(!map.containsKey(j) || map.get(j) == 0){
                return false;
            }else{
                map.put(j,map.get(j)-1);
            }
        }
        return true;
    }
}
