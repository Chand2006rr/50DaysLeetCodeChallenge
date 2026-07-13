class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>(); 
        //     for(int i=low;i<=high;i++){
                
        //         int a = i%10;
        //         i /= 10;
        //         if(a<a+1 && a+1<a+2){
        //             ans.add(i);
        //     }
        // }
        // return ans;

    //     for(int i=low;i<=high;i++){
    //         if(isSequential(i)){
    //             ans.add(i);
    //         }
    //     }
    //     return ans;
    // }

    // public boolean isSequential(int num){
    //     String s = String.valueOf(num);

    //     for(int i=0;i<s.length()-1;i++){
    //         if(s.charAt(i+1) - s.charAt(i) != 1){
    //             return false;
    //         }
    //     }
    //     return true;


        for (int start = 1; start <= 9; start++) {
            int num = start;
            int next = start + 1;

            while (next <= 9) {
                num = num * 10 + next;

                if (num >= low && num <= high) {
                    ans.add(num);
                }

                next++;
            }
        }

        Collections.sort(ans);
        return ans;
    }
}