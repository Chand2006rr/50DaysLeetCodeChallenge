class Solution {
    public int divide(int dividend, int divisor) {
        // int ans = (int)dividend/(int)divisor;
        // if(dividend<0 && divisor<0){
        //     return Math.abs(ans);
        // }
        // return ans;
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Math.abs(Integer.MIN_VALUE-1);
        }
        return dividend/divisor;
    }
}