class Solution {
    public boolean isThree(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                ans.add(i);
            }
        }
        if(ans.size() != 3){
            return false;
        }
        return true;
    }
}