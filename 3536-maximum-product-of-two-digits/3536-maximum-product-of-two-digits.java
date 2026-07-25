class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        ArrayList<Integer> ans = new ArrayList<>();
        int max = 0;
        int mul = 1;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                mul = ((s.charAt(i)-'0')*(s.charAt(j)-'0'));
                ans.add(mul);
            }
        }
        for(int i=0;i<ans.size();i++){
            max = Math.max(max,ans.get(i));
        }
    return max;
    }
}