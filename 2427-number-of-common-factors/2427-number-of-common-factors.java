class Solution {
    public int commonFactors(int a, int b) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        // for(int i=1;i<=1000;i++){
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0){
                list1.add(i);
            } 
            if(b%i==0){
                list2.add(i);
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                if(list1.get(i).equals(list2.get(j))){
                    list.add(list1.get(i));
                }
            }
        }

        return list.size();
    }
}