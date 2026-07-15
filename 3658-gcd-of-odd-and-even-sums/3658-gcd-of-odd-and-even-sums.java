class Solution {
    public int gcdOfOddEvenSums(int n) {
        int ans = gcd(n);
        return ans;
        }
    public int sumOdd(int n){
        int oddSum = 0;
        for(int i=1;i<=2*n-1;i+=2){
            if(i%2 != 0){
                oddSum += i;
            }
        }
        return oddSum;
    }

    public int sumEven(int n){
        int evenSum = 0;
        for(int j=2;j<=2*n+1;j+=2){
            if(j%2 == 0){
                evenSum += j;
            }
        }
        return evenSum;
    }

    public int gcd(int n){
        for(int i=n;i>=0;i++){
            if(sumEven(n)%i == sumOdd(n)%i){
                return i;
            }
        }
        return -1;
    }
}