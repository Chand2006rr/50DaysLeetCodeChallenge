class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int arr[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j=0;j<=i;j++){
                max = Math.max(nums[j],max);
                for(int l=i;l<nums.length;l++){
                    min = Math.min(nums[l],min);
                }
                int num = max - min;
            arr[i] = num;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= k){
                return i;
            }
        }
        return -1;
    }
} 