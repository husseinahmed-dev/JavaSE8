package ITS350_ProgrammingContest;

import java.util.Scanner;

/**
 * Created by Hussein on 3/12/16.
 */
public class NumberMaze {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[][] maze;
        int N;

        N = userInput.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println();
            int W = userInput.nextInt();
            int H = userInput.nextInt();
            maze = new int[W][W];
            for (int j = 0; j < H; j++) {
                for (int k = 0; k < W; k++) {
                    maze[j][k] = userInput.nextInt();
                }
            }
            displayArray(maze);
            // find best path
            MazePath mazePath = new MazePath(maze, W);
            mazePath.findPath(0, 0);
        }

    }

    public static void displayArray(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
