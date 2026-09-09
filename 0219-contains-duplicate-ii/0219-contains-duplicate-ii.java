class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] == nums[j] && (j-i)<=k){
        //             return true;
        //         }
        //     }
        // }
        // return false;

       TreeSet<Integer> set = new TreeSet<>();
       for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
            return true;
        }
        set.add(nums[i]);
        if(set.size() > k){
            set.remove(nums[i-k]);
        }
       }
       return false;
    }
}