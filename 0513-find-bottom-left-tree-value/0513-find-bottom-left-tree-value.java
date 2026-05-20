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
    int maxlevel = -1;
    int ans = 0;
    public int findBottomLeftValue(TreeNode root) {
        helper(root, 0);
        return ans;
    }
    void helper(TreeNode root, int level){
        if(root == null) return;

        if(level > maxlevel){
            maxlevel = level;
            ans = root.val;
        }
        helper(root.left, level+1);
        helper(root.right, level+1);
    }
}