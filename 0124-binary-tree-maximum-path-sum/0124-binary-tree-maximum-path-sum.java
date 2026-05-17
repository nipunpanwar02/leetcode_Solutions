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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    int maxsum = Integer.MIN_VALUE;

    public int solve(TreeNode root) {
        if (root == null) return 0;

        int leftsum = Math.max(0, solve(root.left)); //We are doing this so that we can't include the negative node value..//
        int rightsum = Math.max(0, solve(root.right));

        int pathsum = (root.val) + leftsum + rightsum;

        maxsum = Math.max(maxsum, pathsum);

        return Math.max(leftsum, rightsum) + (root.val);
    }
    //we create a wrapper functn like we do in diameter of BT..//

    public int maxPathSum(TreeNode root) {
        solve(root);
        return maxsum;
    }
}