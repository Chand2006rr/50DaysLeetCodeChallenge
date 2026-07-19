class Solution {
    public boolean isBalanced(String num) {
    //     if(oddSum(num) != evenSum(num)){
    //         return false;
    //     }
    //     return true;
    // }
    // public int oddSum(String num){
    //     int sum = 0;
    //     for(int i=0;i<num.length();i+=2){
    //         if(i%2 != 0){
    //             sum += num.charAt(i);
    //         }
    //     }
    //     return sum;
    // }
    // public int evenSum(String num){
    //     int sum = 0;
    //     for(int i=0;i<num.length();i+=2){
    //         if(i%2 == 0){
    //             sum += num.charAt(i);
    //         }
    //     }
    //     return sum;
    return sum(num);
    }
    private boolean sum(String num){
        int oddSum = 0;
        int evenSum = 0;
        for(int i=0;i<num.length();i++){
            if(i%2 == 0){
                evenSum += num.charAt(i)-'0';
            }else{
                oddSum += num.charAt(i)-'0';
            }
        }
        if(evenSum != oddSum){
            return false;
        }
        return true;
    }
}