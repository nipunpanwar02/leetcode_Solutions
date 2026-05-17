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

    public boolean mirror(TreeNode left, TreeNode right){
        boolean mirror = false;

        if(left == null && right == null) return true;
        if(left == null || right == null) return false;

        //here we are finding if the 2 trees are mirror image or not like we find out 2 trees are identical or not same as that..//
        if((left.val == right.val) && mirror(left.left, right.right) && mirror(left.right, right.left)){
            mirror = true;
        }
        return mirror;
    }
    public boolean isSymmetric(TreeNode root) {
        return mirror(root.left, root.right);
    }
}