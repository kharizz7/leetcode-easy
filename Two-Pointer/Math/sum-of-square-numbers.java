// Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
// Example 1:

// Input: c = 5
// Output: true
// Explanation: 1 * 1 + 2 * 2 = 5

// Example 2:

// Input: c = 3
// Output: false

  class Solution {
    public boolean judgeSquareSum(int c) {
        long b = (long) Math.sqrt(c);
        long a=0;
        while(a<=b){
        long sum = (a*a)+(b*b);
        if(sum==c){
            return true;
        }else if(sum<c){
            a++;
        }else{
            b--;
        }
        }
        return false;

    }
}
