class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        //there is no need to make a function for tabulation 

        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n+1][m+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }

        return dp[n][m];

            //   Recusion
        // int n=text1.length();
        // int m = text2.length();
        // // return lcs(text1,text2,n,m);


                    // Memoization
    //     int n=text1.length();
    //     int m = text2.length();
    //     int dp[][] = new int[n+1][m+1];

    //     for(int i=0;i<n+1;i++){
    //         for(int j=0;j<m+1;j++){
    //             dp[i][j] = -1;
    //         }
    //     }

    //     return lcs2(text1,text2,n,m,dp);
    // }

                        // Recursion

    // public int lcs(String text1, String text2, int n, int m){
    //     if(n==0 || m==0){
    //         return 0;
    //     }if(text1.charAt(n-1) == text2.charAt(m-1)){
    //         return lcs(text1,text2,n-1,m-1)+1;
    //     }else{
    //         int ans1 = lcs(text1,text2,n-1,m);
    //         int ans2 = lcs(text1,text2,n,m-1);
    //         int ans = Math.max(ans1,ans2);
    //         return ans;
    //     }
    // }


                            // Memoization
                            
    // public int lcs2(String text1, String text2, int n, int m,int dp[][]){
    //     if(n==0 || m==0){
    //         return 0;
    //     }
        
    //     if(dp[n][m] != -1){
    //         return dp[n][m];
    //     }

    //     if(text1.charAt(n-1) == text2.charAt(m-1)){
    //         return dp[n][m] = lcs2(text1,text2,n-1,m-1,dp)+1;
    //     }else{
    //         int ans1 = lcs2(text1,text2,n-1,m,dp);
    //         int ans2 = lcs2(text1,text2,n,m-1,dp);
    //         dp[n][m] = Math.max(ans1,ans2);
    //         return dp[n][m];
    //     }
    // }

    }
}