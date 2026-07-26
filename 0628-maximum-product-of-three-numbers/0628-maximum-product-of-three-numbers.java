class Solution {
    public int maximumProduct(int[] nums) {
        // int max = Integer.MIN_VALUE;
        // int prod = 1;

        // for(int i=0;i<nums.length-2;i++){
        //     for(int j=i+1;j<nums.length-1;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             prod = (nums[i]*nums[j]*nums[k]);
        //             max= Math.max(max,prod);
        //         }
        //     }
        // }
        // return max;

        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int n = nums.length;

        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],
                        nums[0]*nums[1]*nums[n-1]);
    }
}