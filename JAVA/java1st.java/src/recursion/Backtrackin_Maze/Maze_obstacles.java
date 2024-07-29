package recursion.Backtrackin_Maze;

public class Maze_obstacles {
    public static void main(String[] args) {
        boolean [][]board ={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        maze_with_obs("",board,0,0);
    }

    static void maze_with_obs(String p, boolean[][] maze,int r, int c ){
        //base
        if(r== maze.length-1 && c==maze[0].length-1){
            //corner mein ho - return(2,2) in 3*3
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){ // if statement that maze[r][c]=false then this is executed
            return;
        }

        if(r< maze.length-1){
            maze_with_obs(p+'D',maze,r+1,c);
        }
        if(c< maze[0].length-1){
            maze_with_obs(p+'R',maze,r,c+1);
        }
    }

}
