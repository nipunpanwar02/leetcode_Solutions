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
    static class Tuple{
        TreeNode node;
        int vertical;
        int level;

        Tuple(TreeNode node, int vertical, int level){
            this.node = node;
            this.vertical = vertical;
            this.level = level;
        }
    }
    //this is level order traversing BFS using queue..//
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        TreeMap<Integer , TreeMap<Integer , PriorityQueue<Integer>>> map = new TreeMap<>();

        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(root, 0, 0));

        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int vertical = tuple.vertical;
            int level = tuple.level;

            if(!map.containsKey(vertical)){
                map.put(vertical, new TreeMap<>());
            }
            if(!map.get(vertical).containsKey(level)){
                map.get(vertical).put(level, new PriorityQueue<>());
            }
            map.get(vertical).get(level).add(node.val);

            if(node.left!=null) q.add(new Tuple(node.left, vertical-1, level+1));
            if(node.right!=null) q.add(new Tuple(node.right, vertical+1, level+1));
        }
        for(TreeMap<Integer , PriorityQueue<Integer>> vert : map.values()){
            ans.add(new ArrayList<>());
            
            for(PriorityQueue<Integer> nodeval : vert.values()){
                while(!nodeval.isEmpty()){
                    ans.get(ans.size() - 1).add(nodeval.poll());
                }
            }
        }
        return ans;
    }
}