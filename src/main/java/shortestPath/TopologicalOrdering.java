package shortestPath;

import java.util.List;
import java.util.Stack;

public class TopologicalOrdering {

    Stack<Vertex> stack ;
    public TopologicalOrdering(List<Vertex> graph){
        this.stack = new Stack<>();
        for(int i=0;i<graph.size();i++){
            if(!graph.get(i).isVisited()){
                dfs(graph.get(i));
            }
        }
    }
    public void dfs(Vertex vertex){
        vertex.setVisited(true);
        for(Edge e: vertex.getNeighbours()){
            if(!e.getTarget().isVisited()){
                dfs(e.getTarget());
            }
        }
        stack.add(vertex);
    }
    public Stack<Vertex> getVertices(){
        return this.stack;
    }
}
