/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();

        sumleaf2root(root,path,ans);

        for(int i=0;i<ans.size();i++){
            if(ans.get(i)==targetSum){
                return true;
            }
        }
        return false;
    }

    public static int printPath(ArrayList<Integer> path){
        int sum = 0;
        for(int i=0;i<path.size();i++){
            sum += path.get(i);
        }
        return sum;
    }

    public void sumleaf2root(TreeNode root,ArrayList<Integer> path,ArrayList<Integer> ans){
        if(root==null){
            return;
        }

        path.add(root.val);
        if(root.left == null && root.right == null){
            ans.add(printPath(path));
        } 
        sumleaf2root(root.left,path,ans);
        sumleaf2root(root.right,path,ans);
        path.remove(path.size()-1);
        }
}