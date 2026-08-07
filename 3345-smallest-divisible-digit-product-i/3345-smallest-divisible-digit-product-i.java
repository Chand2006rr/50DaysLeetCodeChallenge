class Solution {
    public int smallestNumber(int n, int t) {
        List<Integer> ans = new ArrayList<>();
        for(int i=n;i<=100;i++){
            if(digitProd(i) % t == 0){
                ans.add(i);
            }
        }
        return ans.get(0);
    }

    private int digitProd(int n){
        int mul = 1;
        while(n>0){
            int temp = n%10;
            mul *= temp;
            n /= 10;
        }
    return mul;
    }
}