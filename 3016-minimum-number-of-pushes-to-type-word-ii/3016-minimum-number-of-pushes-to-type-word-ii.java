import java.util.*;

class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map = new HashMap<>();
         
        for(char ch: word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        ArrayList<Integer> ans = new ArrayList<>(map.values());
        Collections.sort(ans,Collections.reverseOrder());   // this is greedy approach

        int count = 0;
        for(int i=0;i<ans.size();i++){
            count += ans.get(i)*(i/8+1);
        }
        return count;
    }
}