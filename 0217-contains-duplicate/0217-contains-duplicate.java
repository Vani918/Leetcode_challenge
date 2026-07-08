//Brute force approach
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[j]==nums[i]){
//                  return true;
//             }
//         }
//         }
//         return false;
//     }
// }


//using hashset
import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a new empty HashSet to keep track of numbers we have seen.
        HashSet<Integer> seen = new HashSet<>();

        // Loop through each number in the input array.
        for (int num : nums) {
            // Check if this number is already in the HashSet.
            if (seen.contains(num)) {
                // If yes, that means we found a duplicate → return true.
                return true;
            }
            // Otherwise, add the number to the HashSet for future checks.
            seen.add(num);
        }

        // If the loop finishes without finding duplicates, return false.
        return false;
    }
}
