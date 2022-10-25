/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author bair7
 */
public class Dfs {
    public static boolean searchpath(int [][]maze,int x,int y,List<Integer>path){
        if(maze[x][y]==9){
            path.add(x);
            path.add(y);
            return true;
        }
        if(maze[x][y]==0){
            maze[x][y]=2;
            int [] dx={1,0,-1,0};
            int [] dy={0,-1,0,1};
            
            for(int d=0;d<dx.length;d++){
                int newx=x+dx[d];
                int newy=y+dy[d];
            
                if(newx>=0 && newx<maze.length && newy>=0 && newy<maze[0].length && searchpath(maze,newx,newy,path)){
                    path.add(x);
                    path.add(y);
                    return true;
                }
            }
        }
    
    return false;
    }

    
       public static void main(String[] args){
        Dfs obj=new Dfs();
        int x=0;
        int y=0;
        int [][]maze={
            {0,0,1},
            {0,1,6},
            {0,0,0}           
        };
        List<Integer>path=new ArrayList<>();
  
        boolean reach=obj.searchpath(maze,1,1,path);
        System.out.print(reach);
        
        
        
    }
    
}
