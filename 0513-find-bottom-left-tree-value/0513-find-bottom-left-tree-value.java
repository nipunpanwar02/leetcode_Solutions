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
    static class Tuple {
        TreeNode node;
        int level;

        Tuple(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }
    public int findBottomLeftValue(TreeNode root) {
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(root, 0));

        int maxlevel = -1;
        int ans = 0;

        while(!q.isEmpty()){
            Tuple tuple = q.poll();

            TreeNode node = tuple.node;
            int level = tuple.level;

            if(level > maxlevel){
                maxlevel = level;
                ans = node.val;
            }
            if(node.left!=null){
                q.add(new Tuple(node.left, level + 1));
            }
            if(node.right!=null){
                q.add(new Tuple(node.right, level + 1));
            }
        }
        return ans;
    }
}