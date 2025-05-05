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

    public int sum(TreeNode root, int dig){
        if(root == null){
            return 0;
        }
        dig = dig*10 + root.val;
        if(root.left == null && root.right == null){
            return dig;
        }
        return sum(root.left,dig) + sum(root.right,dig);
    }
   
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
}
