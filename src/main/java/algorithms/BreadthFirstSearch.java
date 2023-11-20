package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        BreadthFirstSearchImpl breadthFirstSearch = new BreadthFirstSearchImpl();
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        a.addNeighbours(b);
        a.addNeighbours(f);
        a.addNeighbours(g);

        b.addNeighbours(c);
        b.addNeighbours(d);
        b.addNeighbours(a);

        c.addNeighbours(b);

        g.addNeighbours(h);
        g.addNeighbours(a);

        d.addNeighbours(e);
        d.addNeighbours(b);

        h.addNeighbours(g);

        breadthFirstSearch.traverse(a);

    }
}
class BreadthFirstSearchImpl {
    public void traverse(Vertex root){
        root.setVisited(true);
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Vertex remove = queue.remove();
            System.out.println(remove.toString());
            for(Vertex v : remove.getAdjacentVertex()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);

                }
            }
        }
    }
}
class Vertex{
    private String name;
    private boolean isVisited;
    private List<Vertex> adjacentVertex;

    Vertex(String name){
        this.name = name;
        this.adjacentVertex = new ArrayList<>();
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public List<Vertex> getAdjacentVertex() {
        return adjacentVertex;
    }

    public void addNeighbours(Vertex adjacentVertex) {
        this.adjacentVertex.add(adjacentVertex);
    }
    @Override
    public String toString(){
        return name;
    }
}
