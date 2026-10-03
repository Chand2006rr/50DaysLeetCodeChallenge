class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N < 0){
            return 1/power(x,-N);
        }
        return power(x,N);
    }

    private double power(double x, long N){
        if(N==0){
            return 1;
        }

        double halfpower = power(x,N/2);
        double halfpowersq = halfpower * halfpower;
        
        if(N%2 != 0){
            return x*halfpowersq;
        }
        return halfpowersq;
    }
}