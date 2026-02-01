package com.codesquad.mission2.first;

import java.util.ArrayDeque;
import java.util.Deque;

public class Maze {
    private final int[][] myMaze ={
            {0, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 0}
    };
    private boolean[][] visited = new boolean[myMaze.length][myMaze[0].length];
    private Deque<Position> stack = new ArrayDeque<>();

    public Maze() {}

    public void start(){
        System.out.println("===== Start Maze =====");
        System.out.println("출구는 (" + (myMaze.length - 1) + ", " + (myMaze.length - 1) + ") 입니다.");

        printMaze();
        solve(0, 0);
    }

    private void printMaze(){
        for(int i = 0; i < myMaze.length; i++){
            for(int j = 0; j < myMaze[i].length; j++){
                if(myMaze[i][j] == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

    private boolean solve(int x, int y) {
        if (x < 0 || y < 0 || x >= myMaze.length || y >= myMaze.length)
            return false;

        if (myMaze[x][y] == 1 || visited[x][y])
            return false;

        stack.push(new Position(x, y));
        visited[x][y] = true;

        if (x == 7 && y == 7) {
            System.out.print("(7, 7)");
            return true;
        }

        if (solve(x + 1, y) || solve(x, y + 1) || solve(x - 1, y) || solve(x, y - 1)) {
            return true;
        }

        stack.pop();
        return false;
    }
}

