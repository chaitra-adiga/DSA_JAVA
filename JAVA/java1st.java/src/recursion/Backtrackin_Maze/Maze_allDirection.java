package recursion.Backtrackin_Maze;

import java.util.Arrays;

public class Maze_allDirection {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path= new int[board.length][board[0].length];
        allPathPrint("",board,0,0,path,1);
    }

    static void allPaths(String p, boolean[][] maze, int r, int c){
        //base
        if(r == maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        //i am considering  this block is my path
        maze[r][c]=false;

        //down
        if(r< maze.length-1){
            allPaths(p+'D',maze,r+1,c);
        }
        //right
        if(c<maze[0].length-1){
            allPaths(p+'R',maze,r,c+1);
        }
        //up
        if(r>0){
            allPaths(p+'U',maze,r-1,c);
        }
        //left
        if(c>0){
            allPaths(p+'L',maze,r,c-1);
        }
        //this line is where the function will be over --- return position
        //so before the function gets removed , also remove the changes that were made by that function
        maze[r][c]=true;
    }

    static void allPathPrint(String p , boolean[][] maze, int r , int c, int[][] path, int step){
        //base
        if(r== maze.length-1 && c==maze[0].length-1){
            //i'm at corner element
            //this is last step is also a step
            path[r][c]=step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        //considering the visited cell to be marked false
        maze[r][c]=false;
        //including that  step no. at that position
        path[r][c]=step;

        if(r< maze.length-1){
            allPathPrint(p+'D',maze,r+1,c,path,step+1);
        }
        if(c< maze[0].length-1){
            allPathPrint(p+'R',maze,r,c+1,path,step+1);
        }
        if(r>0){
            allPathPrint(p+'U',maze,r-1,c,path,step+1);
        }
        if(c>0){
            allPathPrint(p+'L',maze,r,c-1,path,step+1);
        }


        //reverse the changes to the visited cell
        maze[r][c]=true;
        //also set the step as zero while going back
        path[r][c]=0;

    }

}
