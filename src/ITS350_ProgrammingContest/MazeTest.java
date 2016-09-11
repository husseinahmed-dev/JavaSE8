package ITS350_ProgrammingContest;

/**
 * Created by Hussein on 4/18/16.
 */
public class MazeTest {
    public static void main(String[] args) {
        int[][] maze = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,3},
                {4,1,1,3,-1}};
        int[][] maze2 = {
                {5,3,3,2,4,4},
                {3,3,4,4,2,4},
                {1,4,1,2,4,2},
                {3,4,1,3,2,3},
                {4,3,2,4,4,4},
                {2,3,5,2,3,-1}
        };

        System.out.println("Maze coordinates: " + maze2[1][4]);
        MazePath mazePath = new MazePath(maze, 5);
        mazePath.findPath(0, 0);
        mazePath.displayPath();
    }
}
