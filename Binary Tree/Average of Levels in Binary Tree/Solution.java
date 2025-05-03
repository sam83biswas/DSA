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
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> que = new LinkedList<>();

        que.add(root);

        while(!que.isEmpty()){
            int len = que.size();
            double sum = 0;

            for(int i = 0; i<len; i++){
                TreeNode curr = que.remove();
                sum += (double)curr.val;
                if(curr.left != null){
                    que.add(curr.left);
                }
                if(curr.right != null){
                    que.add(curr.right);
                }
            }
            double avg = sum/(double)len;
            ans.add(avg);

        }
        return ans;
        
    }
}
