package com.company.backjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj2178 {

    static String map[][];
    static int col, row;
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        col = sc.nextInt();
        row = sc.nextInt();
        sc.nextLine();
        map = new String[col+1][row+1];

        for(int i=0; i<col; i++)
        {
            str = sc.nextLine();
            map[i] = str.split("");
        }

        bfs();
    }

    //그래프 안에 중복 상관없이 각자 갈길간다
    // 큐에는 길 객체 push pop
    static void bfs() {
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, -1, 0, 1};
        int rx, ry;
        Queue<Token> queue = new LinkedList<>();
        queue.offer(new Token(0,0,1));
        while(!queue.isEmpty())
        {
            Token tk = queue.poll();
            if(tk.x == row-1 && tk.y == col-1)
            {
                System.out.println(tk.cnt);
                break;
            }
            for(int i=0; i<4; i++)
            {
                rx = tk.x + dx[i];
                ry = tk.y + dy[i];
                if(rx>=0 && rx<row && ry>=0 && ry<col)
                {
                    if(map[ry][rx].equals("1"))
                    {
                        map[ry][rx] = "0";
                        queue.offer(new Token(rx,ry,tk.cnt+1));
                    }
                }
            }
        }

    }

    static class Token{
        int x;
        int y;
        int cnt;
        public Token(int x,int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}
