package com.company.backjoon.FloydWarshall;

import java.util.Scanner;

public class bj11403 {

    static int num;
    static int map[][];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        map = new int[num+1][num+1];
        for(int i=0; i<num; i++)
        {
            for(int j=0; j<num; j++)
            {
                map[i][j] = sc.nextInt();
            }
        }

        for(int k=0; k<num; k++)
        {
            for(int i=0; i<num; i++)
            {
                for(int j=0; j<num; j++)
                {
                    if(map[i][k] == 1 && map[k][j] == 1)
                    {
                        map[i][j] = 1;
                    }
                }
            }
        }

        for(int i=0; i<num; i++)
        {
            for(int j=0; j<num; j++)
            {
                System.out.print(map[i][j] + " ");
            }
                System.out.print("\n");
        }
    }
}
