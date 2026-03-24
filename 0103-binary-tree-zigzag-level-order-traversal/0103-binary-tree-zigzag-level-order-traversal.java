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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        level(root);
        return res;
    }
    public void level(TreeNode root)
    {
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = false;
        while(!q.isEmpty())
        {
            int size = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode cur = q.poll();
                temp.add(cur.val);
                if(cur.left != null)  { q.add(cur.left); }
                if(cur.right != null) { q.add(cur.right);}              
            }
            if(flag == true){
                Collections.reverse(temp);
            }
            flag= !flag;
            res.add(new LinkedList<>(temp));
        }
    }
}