class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            ans.add(map.get(key));
        }
        Collections.sort(ans);
        for(int i=0;i<ans.size()-1;i++){
             if(ans.get(i).equals(ans.get(i+1))){
                    return false;
                }
        }
        return true;
    }
}