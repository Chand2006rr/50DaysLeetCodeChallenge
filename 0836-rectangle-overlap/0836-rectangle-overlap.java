class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // for(int i=0;i<rec1.length;i++){
        //         if(rec1[i]+1 != rec2[i]){
        //             return false;
        //     }
        // }
        // return true;

        return rec1[0] < rec2[2] &&
                rec2[0] < rec1[2] &&
                rec1[1] < rec2[3] &&
                rec2[1] < rec1[3];
    }
}