// Java program to find count of distinct nodes
// on a path with maximum distinct nodes.
import java.util.*;
class GFG
{

    // A node of binary tree
    static class Node
    {
        String data;
        Node left, right;
    };

    // A utility function to create a new Binary
// Tree node
    static Node newNode(String data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    static int largestUinquePathUtil(Node node, HashMap<String,
            Integer> m)
    {
        if (node == null)
            return m.size();

        // put this node into hash
        if(m.containsKey(node.data))
        {
            m.put(node.data, m.get(node.data) + 1);
        }
        else
        {
            m.put(node.data, 1);
        }

        int max_path = Math.max(largestUinquePathUtil(node.left, m),
                largestUinquePathUtil(node.right, m));

        // remove current node from path "hash"
        if(m.containsKey(node.data))
        {
            m.put(node.data, m.get(node.data) - 1);
        }

        // if we reached a condition where all duplicate value
        // of current node is deleted
        if (m.get(node.data) == 0)
            m.remove(node.data);

        return max_path;
    }

    // A utility function to find long unique value path
    public static int getDisCnt(Node root){
        Set<String> uniq = new HashSet<>();
        if(root == null){
            return 0;
        }
        return getMaxHelper(root, uniq);
    }

    private static int getMaxHelper(Node root, Set<String> uniq){
        if(root == null){
            return uniq.size();
        }
        int l = 0;
        int r  = 0;
        if(uniq.add(root.data)){
            l = getMaxHelper(root.left, uniq);
            r = getMaxHelper(root.right, uniq);
            uniq.remove(uniq.size()-1);
        }
        else{
            l = getMaxHelper(root.left, uniq);
            r = getMaxHelper(root.right, uniq);
        }
        return Math.max(l, r);
    }
    // Driver Code
    public static void main(String[] args)
    {
        // Create binary tree shown in above figure
        Node root = newNode("1");
        root.left = newNode("2");
        root.right = newNode("2");
        root.left.left = newNode("1");
        root.left.right = newNode("2");
        root.right.left = newNode("4");
        root.right.right = newNode("1");
        System.out.println(getDisCnt(root));
    }
}
