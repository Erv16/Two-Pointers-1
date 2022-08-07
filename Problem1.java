// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void sortColors(int[] nums) {
        
        // TC: O(n)
        // SC: O(1)
        if(nums == null || nums.length == 0) return;
        int low = 0; 
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high) {
            if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}