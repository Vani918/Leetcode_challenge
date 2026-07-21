class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
         int[] result=new int[n];
         // Step 1: prefix products
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        
        // Step 2: suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }
    return result;
    }
}

// Step 1: Prefix products
// We walk left → right, storing product of everything before i.

// Start with prefix = 1.

// At i=0: result[0] = 1 (nothing before 1).

// At i=1: result[1] = 1 (prefix product of [1]).

// At i=2: result[2] = 2 (prefix product of [1,2]).

// At i=3: result[3] = 6 (prefix product of [1,2,3]).

// So after prefix pass:

// Code
// result = [1, 1, 2, 6]
// Step 2: Suffix products
// We walk right → left, multiplying by product of everything after i.

// Start with suffix = 1.

// At i=3: result[3] = 6 * 1 = 6.

// At i=2: result[2] = 2 * 4 = 8.

// At i=1: result[1] = 1 * (3*4) = 12.

// At i=0: result[0] = 1 * (234) = 24.

// Final result:

// Code
// [24, 12, 8, 6]