// You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

// You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

//     You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
//     Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
//     Once you reach a tree with fruit that cannot fit in your baskets, you must stop.

// Given the integer array fruits, return the maximum number of fruits you can pick.

// Example 1:

// Input: fruits = [1,2,1]
// Output: 3
// Explanation: We can pick from all 3 trees.

// Example 2:

// Input: fruits = [0,1,2,2]
// Output: 3
// Explanation: We can pick from trees [1,2,2].
// If we had started at the first tree, we would only pick from trees [0,1].

// Example 3:

// Input: fruits = [1,2,3,2,2]
// Output: 4
// Explanation: We can pick from trees [2,3,2,2].
// If we had started at the first tree, we would only pick from trees [1,2].



class Solution {
    public int totalFruit(int[] fruits) {

        int left=0,right=0,maxLen=0;
        int n=fruits.length;
        Map<Integer,Integer> map = new HashMap<>();

        while(right<n){
            // expand
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2){
                // shrink
                // get the key @ left side
                int leftfruit= fruits[left];
                // remove all the values from the key @ left side
                map.put(leftfruit,map.get(leftfruit)-1);
                // remove the key @ left side
                if(map.get(leftfruit)==0){
                    map.remove(leftfruit);
                    
                }
                // when removing value of left from map. it should move forward
                left++;
            
        
            }

            if(map.size()<=2){
                maxLen= Math.max(maxLen,right-left+1);
            }

            right++;
        }
        return maxLen;
        
    }
}
