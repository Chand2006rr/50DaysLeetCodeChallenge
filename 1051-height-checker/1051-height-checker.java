class Solution {
    public int heightChecker(int[] heights) {
        int expected[] = new int[heights.length];
        int nums[]=new int[heights.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=heights[i];
        }
       
            Arrays.sort(heights);
            for(int i=0;i<heights.length;i++){
                expected[i]=heights[i];
            }
        
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != expected[i]){
                count++;
                }
            }
        return count;
        }
    }
