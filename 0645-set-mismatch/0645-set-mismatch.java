class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = i+1;
        } 
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                ans.add(nums[i]);
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(Arrays.binarySearch(nums, arr[i]) < 0){
                ans.add(arr[i]);
                break;
            }
        }
        int num[] = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            num[i] = ans.get(i);
        }
        return num;
    }
}