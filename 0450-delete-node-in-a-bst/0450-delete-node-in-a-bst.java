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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(key < root.val)
        {
            root.left = deleteNode(root.left,key);
        }
        else if(key > root.val)
        {
            root.right = deleteNode(root.right,key);
        }
        else{

            if(root.right==null && root.left==null)
            {
                return null;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            else if(root.left==null)
            {
                return root.right;
            }
            else{
                int temp = findMin(root.right);
                root.val = temp;
                root.right = deleteNode(root.right,temp);
            }
        }
        return root;
    }

    public int findMin(TreeNode root)  
    {
        int min = root.val;
        while (root.left != null) {
            min = root.left.val;
            root = root.left;
        }
        return min;
    }
}