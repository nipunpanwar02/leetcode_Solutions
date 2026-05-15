/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        int max = 0;

        for(int i=0; i<root.children.size(); i++){
            Node child = root.children.get(i);

            int childDepth = maxDepth(child);   //child is already a node pointed to root.children at i position thats why we can write here root.child..//

            max = Math.max(childDepth, max);
        }
        return max + 1;
    }
}