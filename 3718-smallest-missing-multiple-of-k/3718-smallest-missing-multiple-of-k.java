class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int i=1;i<=nums.length+1;i++){
           int multiple = i*k;
           boolean isFound = false;
            for(int num:nums){
                if(num == multiple){
                    isFound = true;
                    break;
                }
                }
                if(!isFound){
                    return multiple;
            }
        }
        return k;
    }
}