package com.company.backjoon.dfs;

import java.util.Scanner;
import java.util.Vector;

public class bj1012 {
    boolean map[][], visited[][];
    int col, row, num;
    public void Solution() {
        int cnt;
        int x, y;
        int count = 0;

        Vector<Integer> v = new Vector<>();
        Scanner sc = new Scanner(System.in);
        cnt = sc.nextInt();
        for(int i =0; i< cnt; i++)
        {
            row = sc.nextInt();
            col = sc.nextInt();
            num = sc.nextInt();
            map = new boolean[col+1][row+1];
            visited = new boolean[col+1][row+1];
            for(int j=0; j<num; j++)
            {
                x = sc.nextInt();
                y = sc.nextInt();
                map[y][x] = true;
            }

            for(int m=0; m<col; m++)
            {
                for(int n=0; n<row; n++)
                {
                    if(map[m][n] == true && visited[m][n] == false)
                    {
                        dfs(m,n);
                        count++;
                    }
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
    public void dfs(int y,int x)
    {
        visited[y][x] = true;
        int dx[] = {0,1,0,-1};
        int dy[] = {-1,0,1,0};
        for(int i=0; i<4; i++)
        {
            int cx = x+dx[i];
            int cy = y+dy[i];
            if(cx >= 0 && cx<=row && cy>=0 && cy<=row) {
                if (map[cy][cx] == true && visited[cy][cx] == false){
                    dfs(cy,cx);
                }
            }
        }
    }
}
