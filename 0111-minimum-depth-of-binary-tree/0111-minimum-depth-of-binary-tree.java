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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        //we write this condition bcoz if there is a null then it automatically takes the other bcoz min depth is shortest dist. btw root and leaf node and in case of null it is not a leafnode thats why we take the other..//
        if(root.left==null) return minDepth(root.right) + 1;
        if(root.right==null) return minDepth(root.left) + 1;

        int leftdepth = minDepth(root.left);
        int rightdepth = minDepth(root.right);

        return Math.min(leftdepth, rightdepth) + 1;
    }
}