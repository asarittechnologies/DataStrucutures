package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
    Stack<Node> stack;
    DFS(){
        this.stack = new Stack<>();
    }
    public static void main(String[] args) {

    }
    public void dfs(Node node){
        stack.push(node);
        node.setVisted(true);

        while(!stack.isEmpty()){
            Node actualNode = stack.pop();
            if(!actualNode.isVisted()){
                actualNode.setVisted(true);
                stack.push(node);
            }
        }
    }
}

class Node{
    private String name;
    private boolean isVisted;
    private List<Node> adjancentList;

    Node(String name, List<String> adjancentList) {
        this.name = name;
        this.adjancentList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisted() {
        return isVisted;
    }

    public void setVisted(boolean visted) {
        isVisted = visted;
    }

    public List<Node> getAdjancentList() {
        return adjancentList;
    }

    public void addAdjacentNodes(Node node) {
        this.adjancentList.add(node);
    }
}