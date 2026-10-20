class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

                //0(n^2)
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[i].length;j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;


                // 0(m*n)
        // int i=0;
        // int j=matrix[0].length-1;

        // while(i<matrix.length && j>=0){
        //     if(matrix[i][j] == target){
        //         return true;
        //     }
        //     else if(matrix[i][j] > target){
        //         j--;
        //     }else{
        //         i++;
        //     }
        // }
        // return false;

          int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}