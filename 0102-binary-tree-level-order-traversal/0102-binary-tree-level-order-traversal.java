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
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        level(root);
        return res;
    }
    public void level(TreeNode root)
    {
        if(root == null)
        {
            return ;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i;
        while(!q.isEmpty())
        {
            Queue<Integer> temp = new LinkedList<>();
            int size = q.size();
            for( i=0;i<size;i++)
            {
                TreeNode cur = q.poll();
                temp.add(cur.val);
                if(cur.left != null)
                {
                    q.add(cur.left);
                }
                if(cur.right != null)
                {
                    q.add(cur.right);
                }
            }
            res.add(new LinkedList<>(temp));
        }
    }
}