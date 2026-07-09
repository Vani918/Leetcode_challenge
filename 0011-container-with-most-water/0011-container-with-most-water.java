class Solution {
    public int maxArea(int[] height) {
        // int left= height[0]; need indices not vlaues
        // int right= height[height.length-1];
        // int i;
        // int area=0;
        // while(left<right){
        //     int width= right-left;
        //     area=width*(Math.min(height[left],height[right]));
        // Different logic comparing left and right Smaller one is incremented
        //     if(height[left+1]>height[left]){
        //         left++;
        //     }
        //     if(height[right-1]>height[right]{
        //         right--;
        //     }
        // } 

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left; // Distance between the two bars
            int area = width * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area); // Use Max function Comparing to the new value and Old Value

            // Move the pointer at the smaller height
            if (height[left] < height[right]) { // Which one is smaller that pointer is incremented
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}