package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}  };
        int path[][] = new int[maze.length][maze[0].length];
        AllPathPrint("",maze,0,0,path,1);

    }
//        System.out.println(stringDiagonal("",3,3));

    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left + right;
    }

//    static void  string(String p,int r,int c){
//        if(r==1 && c==1){
//            System.out.println(p);
//            return ;
//        }
//        if(r>1){
//            string(p+'D',r-1,c);
//
//        }
//        if (c>1){
//            string(p+'R',r,c-1);
//        }
//
//    }


    static ArrayList<String> string(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> arr =new ArrayList<>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> left = new ArrayList<>();
//        ArrayList<String> right = new ArrayList<>();


        if(r>1){
            left.addAll(string(p+'D',r-1,c));
        }
        if (c>1){
            left.addAll(string(p+'R',r,c-1));
        }

        return left;
    }
    static ArrayList<String> stringDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> left = new ArrayList<>();
//        ArrayList<String> right = new ArrayList<>();


        if (r > 1) {
            left.addAll(stringDiagonal(p + 'D', r - 1, c));


        }
        if (c > 1) {
            left.addAll(stringDiagonal(p + 'R', r, c - 1));
        }
        if (r > 1 && c > 1) {
            left.addAll(stringDiagonal(p + 'X', r - 1, c - 1));
        }
        return left;
    }
    static void AllPath(String p,boolean[][] maze,int r,int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c]=false;

        if (r < maze.length-1) {
            AllPath(p + 'D', maze,r + 1, c);

        }
        if (c < maze[0].length-1) {
            AllPath(p + 'R', maze, r,c + 1);

        }
        if (r > 0) {
            AllPath(p + 'U', maze,r - 1, c);

        }
        if (c > 0) {
            AllPath(p + 'L', maze, r,c - 1);

        }

        maze[r][c]=true;

    }


    static void AllPathPrint(String p,boolean[][] maze,int r,int c,int path[][],int count) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]=count;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c]=false;
        path[r][c]=count;

        if (r < maze.length-1) {
            AllPathPrint(p + 'D', maze,r + 1, c,path,count+1);

        }
        if (c < maze[0].length-1) {
            AllPathPrint(p + 'R', maze, r,c + 1,path,count+1);

        }
        if (r > 0) {
            AllPathPrint(p + 'U', maze,r - 1, c,path,count+1);

        }
        if (c > 0) {
            AllPathPrint(p + 'L', maze, r,c - 1,path,count+1);
        }

        maze[r][c]=true;
        path[r][c]=0;

    }
}
