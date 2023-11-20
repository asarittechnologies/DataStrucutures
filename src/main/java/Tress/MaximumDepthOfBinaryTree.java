package Tress;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {

    }
    public int maximumDepthTree(Node node,int currentDepth){
        if(node == null){
            return currentDepth;
        }
        currentDepth++;
        return Math.max(maximumDepthTree(node.left,currentDepth),
                maximumDepthTree(node.right,currentDepth));
    }
}

