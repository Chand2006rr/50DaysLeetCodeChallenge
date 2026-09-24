class Solution {
    public int smallestIndex(int[] nums) {
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int sum=0;
            
            while(nums[i]>0){
                int temp = nums[i]%10;
                sum += temp;
                nums[i] /= 10;
            }
            ans.add(sum);
        }

        for(int i=0;i<ans.size();i++){
            if(ans.get(i) == i){
                return i;
            }
        }
        return -1;
    }
}