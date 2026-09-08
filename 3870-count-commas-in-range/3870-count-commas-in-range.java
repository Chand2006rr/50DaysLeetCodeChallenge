class Solution {
    public int countCommas(int n) {
        int count = 0;
        if(n<1000){
            return 0;
        }
        for(int i=1000;i<=n;i++){
        String s  = String.valueOf(i);
            for(int j=3;j<s.length();j+=3){
                count++;
            }
        }
        return count;
    }
}