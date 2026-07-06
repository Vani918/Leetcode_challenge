class Solution {
    public int missingNumber(int[] nums) {
        // Simple way to find the missing number is count the Total sum n ele
        // Then count the Actually some of the given array elements
        // Subtract the total sum Buy actual sum Difference is the Missing number
      int n=nums.length;
      int totalSum=n*(n+1)/2;
      int actualSum=0;
      for(int i=0;i<n;i++){
        actualSum+=nums[i];  // Find the sum of given(input) array elements
      }  
      return totalSum - actualSum; //calculate the differnce
    }
}