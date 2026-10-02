class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        k = k%n;
        for(int i=n-k;i<nums.length;i++){
            list.add(nums[i]);
        }
            for(int j=0;j<n-k;j++){
                list.add(nums[j]);
            }
            for(int i=0;i<n;i++){
                nums[i] = list.get(i);
            }
    }
}


// class Solution {
//     public void reverse(int[] nums, int l , int r) {
//         while (l < r) {
//             int temp = nums[l];
//             nums[l] = nums[r];
//             nums[r] = temp;
//             l++;
//             r--;
//         }
//     }

//     public void rotate(int[] nums, int k) {
//         int n = nums.length;

//         k %= n;

//         reverse(nums, 0, n-1);
//         reverse(nums, 0, k-1);
//         reverse(nums, k, n-1);

//         return;

//     }
// }