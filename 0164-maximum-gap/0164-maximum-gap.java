class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        if(n<2){
            return 0;
        }
        for(int i=0;i<n-1;i++){
            int num = Math.abs(nums[i+1]-nums[i]);
            list.add(num); 
        }
        for(int i=0;i<list.size();i++){
            max = Math.max(max,list.get(i));
        }
        return max;
    }
}