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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            List<Integer> arr = new ArrayList<>();
            int length = que.size();

            for(int i = 0;i<length;i++){
                TreeNode curr = que.poll();
                arr.add(curr.val);
                if(curr.left != null){
                    que.add(curr.left);
                }
                if(curr.right != null){
                    que.add(curr.right);
                }
            }
            ans.add(arr);
            
        }

        return ans;
            
        
    }
}
