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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans, 0);
        return ans;
    }
    void helper(TreeNode root, List<Integer> ans, int level){
        if(root == null) return;

        if(level == ans.size()){           //it stores only the first node value come at this level and reject the value of any other node came at this same level..//
            ans.add(root.val);
        }
        helper(root.right, ans, level+1);   //coz we want only right side, left side nodes will be ignored later..//
        helper(root.left, ans, level+1);
    }
}