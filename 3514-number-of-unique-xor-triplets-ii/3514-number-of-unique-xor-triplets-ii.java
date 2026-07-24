class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        if(n==1) return 1;

        for(int i=0;i<n;i++){
            set.add(nums[i]^nums[i]);
            for(int j=i+1;j<n;j++){
                set.add(nums[i]^nums[j]);
            }
        }
        for(int Set:set){
            for(int num:nums){
                ans.add(num^Set);
            }
        }
        return ans.size();
    }
}




        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         for(int k=0;k<n;k++){
        //                 int ans = nums[i]^nums[j];
        //                 int real = ans^nums[k];
        //                 set.add(real);
        //             }
        //     }
        // }
        // return set.size();