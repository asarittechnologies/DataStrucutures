package shortestPath;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean isVisited;
    private int minDistance;
    private Vertex precedessor;
    private List<Edge> adjacencentList;

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' + " "+precedessor+
                '}';
    }

    public Vertex(){
        this.minDistance = Integer.MAX_VALUE;
        this.adjacencentList = new ArrayList<>();
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public int getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(int minDistance) {
        this.minDistance = minDistance;
    }

    public Vertex getPrecedessor() {
        return precedessor;
    }

    public void setPrecedessor(Vertex precedessor) {
        this.precedessor = precedessor;
    }

    public List<Edge> getNeighbours() {
        return adjacencentList;
    }

    public void setNeighbours(Edge adjacencentEdge) {
        this.adjacencentList.add(adjacencentEdge);
    }
}
