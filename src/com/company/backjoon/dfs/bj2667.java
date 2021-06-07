package com.company.backjoon.dfs;

import java.util.Arrays;
import java.util.Scanner;

public class bj2667 {
    static String[][] map;
    static int[][] visited;
    static int[] hnum = new int[626];
    static int num = 0;
    static int count = 0;
    static int count2 = 0;
    public static void main(String[] args) {

        Arrays.fill(hnum, 100001);
        String str;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.nextLine();
        visited = new int[num+1][num+1];
        map = new String[num+1][num+1];
        for(int i=0; i<num; i++) {
            str = sc.nextLine();
            map[i] = str.split("");
        }
        for(int y=0; y<num; y++)
        {
            for(int x=0; x<num; x++)
            {
                if(map[y][x].equals("1") && visited[y][x] != 1) {
                    dfs(x, y);
                    count++;
                    hnum[count] = count2;
                    count2=0;
                }
            }
        }
        Arrays.sort(hnum);
        System.out.println(count);
        for(int i=0; i<count; i++){
            System.out.println(hnum[i]);
        }
    }

    static void dfs(int x, int y)
    {
        count2 = count2 + 1;
        visited[y][x] = 1;
        int dx[] = {-1, 0 , 1, 0};
        int dy[] = { 0, 1 , 0, -1};

        for(int i=0; i<4; i++)
        {
            int cx = x + dx[i];
            int cy= y + dy[i];
            if(cx >= 0 && cy >= 0 && cx <num && cy<num )
            {
                if(map[cy][cx].equals("1") && visited[cy][cx] != 1) {
                    dfs(cx, cy);
                }
            }
        }
    }
}
