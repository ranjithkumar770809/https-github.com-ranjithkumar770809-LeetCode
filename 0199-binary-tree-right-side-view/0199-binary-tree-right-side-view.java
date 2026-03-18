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
    List<Integer> res = new LinkedList<>();
    public List<Integer> rightSideView(TreeNode root) {
        backTrack(root,res,0);
        return res;
    }
    public void backTrack(TreeNode root, List<Integer> res, int level){
        if (root == null)
        {
            return;
        }
        if(res.size() == level)
        {
            res.add(root.val);
        }
        backTrack(root.right,res,level+1);
        backTrack(root.left,res,level+1);
    }
}