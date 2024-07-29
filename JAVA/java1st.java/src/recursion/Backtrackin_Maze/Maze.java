package recursion.Backtrackin_Maze;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(maze_count(3,3));
        System.out.println(maze_paths_diagonal("",3,3));
    }
    static int maze_count(int r , int c){
        //base
        if(r==1 || c==1){
            return 1;
        }
        int left = maze_count(r-1,c); //going down
        int right= maze_count(r,c-1); //going right

        return left+right;
    }

    static void maze_path(String p, int r, int c){
        //base
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        //right= c+1 & (c>1)
        if(c>1){
            maze_path(p+'R',r,c-1);
        }
        if(r>1){
            maze_path(p+'D',r-1,c);
        }
    }

    static ArrayList<String> maze_paths(String p,int r, int c){
        ArrayList<String> ans = new ArrayList<>();
        //base
        if(r==1 && c==1){
            ans.add(p);
            return ans;
        }

        if(r>1){
           ans.addAll(maze_paths(p+'D',r-1,c));
        }
        if(c>1){
            ans.addAll(maze_paths(p+'R',r,c-1));
        }
        return ans;
    }

    static ArrayList<String> maze_paths_diagonal(String p,int r, int c){
        ArrayList<String> ans = new ArrayList<>();
        //base
        if(r==1 && c==1){
            ans.add(p);
            return ans;
        }

        if(r>1){
            ans.addAll(maze_paths_diagonal(p+'V',r-1,c));
        }
        if(r>1 && c>1){
            ans.addAll(maze_paths_diagonal(p+'D',r-1,c-1));
        }
        if(c>1){
            ans.addAll(maze_paths_diagonal(p+'H',r,c-1));
        }
        return ans;
    }
}
