class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int prod = 1;
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i);
            prod = (26-(ch-'a'))*(i+1);
            sum += prod;
        }
        return sum;
    }
}