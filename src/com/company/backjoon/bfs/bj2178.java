package com.company.backjoon.bfs;

import java.util.Scanner;

public class bj2178 {

    static String map[][];
    static int end[] = new int[2];
    public static void main(String[] args) {
        int col, row;
        String str;
        Scanner sc = new Scanner(System.in);
        col = sc.nextInt();
        row = sc.nextInt();
        sc.nextLine();
        map = new String[col+1][row+1];
        end[0] = row;
        end[1] = col;
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

    }
}
