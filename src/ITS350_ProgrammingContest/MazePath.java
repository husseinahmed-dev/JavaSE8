package ITS350_ProgrammingContest;

/**
 * Created by Hussein on 3/12/16.
 */
public class MazePath {
    private int[][] maze;
    public int[][] path = new int[500][2];
    public boolean[][] visited;
    public int counter = 0;
    int W;
    boolean goal = false;

    public MazePath(int[][] maze, int W) {
        this.maze = maze;
        this.W = W;
        this.visited = new boolean[W][W];
    }

    public boolean findPath(int x, int y) {
        if (x > W || x < 0 || y > W || y < 0) return false;
        if (maze[x][y] == -1) return true;
        if (visited[x][y] == true) return false;

        path[counter][0] = x;
        path[counter++][1] = y;
        visited[x][y] = true;
        if (findPath(x + maze[x][y], y) == true) return true;
        if (findPath(x, y - maze[x][y]) == true) return true;
        if (findPath(x, y + maze[x][y]) == true) return true;
        if (findPath(x - maze[x][y], y) == true) return true;
            path[--counter][0] = x;
            path[counter][1] = y;
        return false;

    }

    public boolean findPath2(int x, int y) {
        if (maze[x][y] == -1) {
            System.out.println("Found Goal!");
            return true;
        } else {

            path[counter][0] = x;
            path[counter++][1] = y;
            if (y - maze[x][y] >= 0 && !visited[x][y - maze[x][y]]) {
                visited[x][y] = true;
                findPath2(x, y-maze[x][y]);

            }
            if (x + maze[x][y] < W && !visited[x+ maze[x][y]][y]) {
                visited[x][y] = true;
                findPath2(x + maze[x][y], y);
            } if (x - maze[x][y] >= 0 && !visited[x - maze[x][y]][y]) {
                visited[x][y] = true;
                findPath2(x - maze[x][y], y);
            } if (y + maze[x][y] < W && !visited[x][y + maze[x][y]]) {
                visited[x][y] = true;
                findPath2(x, y + maze[x][y]);
            }

            return false;
        }

    }



    public void displayPath() {
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void findBestPath() {

    }

}


