class Solution {
    public int maxArea(int[] height) {
        int maxwater = 0;
        int lh = 0;
        int rh = height.length - 1;

        while(lh < rh){
            int ht = Math.min(height[lh],height[rh]);
            int width = rh - lh;
            int currwater = ht * width;
            maxwater = Math.max(currwater,maxwater);

            if(height[lh] < height[rh]){
                lh++;
            }else{
                rh--;
            }
        }
        return maxwater;
    }
}