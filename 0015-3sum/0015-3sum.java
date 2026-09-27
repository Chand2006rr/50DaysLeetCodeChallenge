// import java.util.Arrays;

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Arrays.sort(nums);

//         List<List<Integer>> main = new ArrayList<>();
//         int n = nums.length;
//         for(int i=0;i<n-2;i++){
//             for(int j=i+1;j<n-1;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(i != j && i != k && j != k && nums[i]+nums[j]+nums[k] == 0){
//                         List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);

//                         //to check duplicate
//                         if(!main.contains(temp)){
//                             main.add(temp);
//                         }  
//                     }
//                 }
//             }
//         }
//         return main;
//     }
// }



import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> main = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values of i
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    main.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicate values of left
                    while(left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate values of right
                    while(left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else if(sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return main;
    }
}