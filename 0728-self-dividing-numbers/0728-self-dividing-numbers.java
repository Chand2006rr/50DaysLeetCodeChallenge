class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            String s = String.valueOf(i);
            boolean valid = true;
            for(int j=0;j<s.length();j++){
               int digit = s.charAt(j) - '0';
               if(digit == 0 || i%digit != 0){
                valid = false;
                break;
               }
            }
            if(valid){
                ans.add(i);
            }
        }
        return ans;
    }
}