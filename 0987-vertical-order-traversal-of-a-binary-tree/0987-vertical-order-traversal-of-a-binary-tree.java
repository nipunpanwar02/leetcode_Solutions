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

    TreeMap<Integer , TreeMap<Integer , PriorityQueue<Integer>>> map = new TreeMap<>();
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        inorder(root, 0, 0);

        for(TreeMap<Integer , PriorityQueue<Integer>> vert : map.values()){
            ans.add(new ArrayList<>());

            for(PriorityQueue<Integer> nodeval : vert.values()){

                while(!nodeval.isEmpty()){
                    ans.get(ans.size()-1).add(nodeval.poll());
                }
            }
        }
        return ans;

    }

    void inorder(TreeNode root, int vertical, int level){
        if(root == null) return;

        inorder(root.left, vertical-1, level+1);

        if(!map.containsKey(vertical)){
            map.put(vertical, new TreeMap<>());
        }
        if(!map.get(vertical).containsKey(level)){
            map.get(vertical).put(level, new PriorityQueue<>());
        }
        map.get(vertical).get(level).add(root.val);

        inorder(root.right, vertical+1, level+1);
    }
}