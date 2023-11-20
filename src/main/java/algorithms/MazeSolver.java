package algorithms;

public class MazeSolver {
    public static void main(String[] args) {
        int[][] map = {
                {1,1,1,1,1,1},
                {2,1,1,1,1,1},
                {0,1,0,0,0,0},
                {1,0,0,0,0,0},
                {0,0,0,0,0,0},
                {1,1,1,0,0,0}
        };
        MazeSolver m= new MazeSolver(map,1,0);
        m.findWay();
    }

    int[][] maze;
    boolean[][] visited ;
    int startRow;
    int startCol;

    public MazeSolver(int[][] maze, int startRow, int startCol){
        this.maze = maze;
        this.visited = new boolean[maze.length][maze.length];
        this.startCol=startCol;
        this.startRow=startRow;
    }
    public void findWay(){
        if(depthFirstSearch(startRow,startCol)){
            System.out.println("Solution exists");
        }else{
            System.out.println("No solution");
        }

    }

    private boolean isFeasable(int x, int y){
        if(x<0 || x>maze.length-1)
            return false;
        if(y<0 || y>maze.length-1)
            return false;
        if(visited[x][y])
            return false;
        if(maze[x][y] == 1)
            return false;

        return true;
    }

    private boolean depthFirstSearch(int startRow, int startCol) {
        if(startRow == maze.length-1 && startCol == maze.length-1)
            return true;
        if(isFeasable(startRow,startCol)){
            visited[startRow][startCol] = true;
            if(depthFirstSearch(startRow+1,startCol))
                return true;
            if(depthFirstSearch(startRow-1,startCol))
                return true;
            if(depthFirstSearch(startRow,startCol+1))
                return true;
            if(depthFirstSearch(startRow,startCol-1))
                return true;
            return false;
        }
        return false;
    }

}
