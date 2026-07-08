class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        // Create a duplicate List of result And sort the elements
        for (int i = 0; i < nums.length - 2; i++) {// Iterate till the last but one position
          if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

            int left = i + 1; // One pointer at the first position
            int right = nums.length - 1; // Pointer at the last 

             while (left < right) {// Until pointers cross each
                int sum = nums[i] + nums[left] + nums[right]; // Calculate the sum(intended to be 0)

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++; // Check for remaining triplets
                    right--;

                    // skip duplicates
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                     left++;
                } else {
                    right--;
                }
}
        }
        return result;
    }
}