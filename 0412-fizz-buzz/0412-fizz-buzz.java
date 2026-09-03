class Solution {
    public List<String> fizzBuzz(int n) {
        String ans[] = new String[n];
        for(int i=1;i<n+1;i++){
            if(i%3==0 && i%5==0){
                ans[i-1] = "FizzBuzz";
            }
            else if(i%3 == 0){
                ans[i-1] = "Fizz";
            }
            else if(i%5 == 0){
                ans[i-1] = "Buzz";
            }else{
                ans[i-1] = String.valueOf(i);
            }
        }
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(ans[i]);
        }
        return list;
    }
}