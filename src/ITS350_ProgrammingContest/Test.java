package ITS350_ProgrammingContest;

/**
 * Created by Hussein on 3/12/16.
 */
public class Test {
    public static void main(String[] args) {
        int[][] maze = {
                {5,3,3,2,4,4},
                {3,3,4,4,2,4},
                {1,4,1,2,4,2},
                {3,4,1,3,2,3},
                {4,3,2,4,4,4},
                {2,3,5,2,3,-1}
        };
        MazePath mazePath = new MazePath(maze, 6);
        System.out.println(mazePath.findPath(5, 0));
        mazePath.displayPath();
    }
}
