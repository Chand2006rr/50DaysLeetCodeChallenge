class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length-1;
        Arrays.sort(nums);
        return nums[n-k+1];
    }
}