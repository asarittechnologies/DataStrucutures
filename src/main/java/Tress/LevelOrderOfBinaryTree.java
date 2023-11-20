package Tress;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderOfBinaryTree {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        LevelOrderOfBinaryTree l = new LevelOrderOfBinaryTree();
        //List<List<Integer>> ans = l.levelOrder(node);
        //ans.stream().forEach(System.out::println);
        List<Integer> ans = l.rightSideView(node);
        ans.stream().forEach(System.out::println);
    }
    public  List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<>();
        if(root == null){
            return res;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int levels = queue.size();
            List<Integer> subLevels = new ArrayList<>();
            for(int i=0;i<levels;i++){
                if(queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                subLevels.add(queue.remove().value);
            }

           res.add(subLevels);
        }
        return res;
    }

    public List<Integer> rightSideView(Node root) {
        if (root == null)
            return new ArrayList();
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        List<Integer> res = new ArrayList();

        while(!queue.isEmpty()){
            int size = queue.size();

            while (size -- > 0){
                Node cur = queue.poll();
                if (size == 0)
                    res.add(cur.value);

                if (cur.left != null)
                    queue.offer(cur.left);
                if (cur.right != null)
                    queue.offer(cur.right);
            }
        }

        return res;
    }
}
