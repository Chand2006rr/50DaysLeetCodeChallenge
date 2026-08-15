class Solution {
    public int removeDuplicates(int[] nums) {
        // int k=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i] != nums[k-1]){
        //         nums[k] = nums[i];
        //         k++;
        //     }
        // }
        // return k;


        TreeSet<Integer> set = new TreeSet<>();

        for(int num:nums){
            set.add(num);
        }

        int i=0;
        for(int unique:set){
            nums[i++] = unique;
        }
        return set.size();
    }
}